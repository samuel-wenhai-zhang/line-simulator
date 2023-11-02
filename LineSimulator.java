import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class LineSimulator {


    public static void singleLineSim(int numCustomers) {
        
        int time = 1;
    
        /*
        * New customer every 5 ticks
        * Central queue
        * cashier 1 - every 12 ticks
        * cashier 2 - every 19 ticks
        * cashier 3 - every 25 ticks
        *
        * How long does it take to check out
        * all customers?
        */

        Queue<Integer> line = new LinkedList<Integer>();
        
        int customer = 1;
        int customersServed = 0;
        line.add(customer);

        while (customersServed < numCustomers) {
            if (time % 5 == 0 && customer < numCustomers) {
                customer++;
                line.add(customer);
            }
            if (time % 12 == 0 && !line.isEmpty()) {
                System.out.println("Cashier 1 served customer " + line.remove());
                customersServed++;
            }
            if (time % 19 == 0 && !line.isEmpty()) {
                System.out.println("Cashier 2 served customer " + line.remove());
                customersServed++;
            }
            if (time % 25 == 0 && !line.isEmpty()) {
                System.out.println("Cashier 3 served customer " + line.remove());
                customersServed++;
            }
            time++;
        }
        System.out.println("It took a total of " + time + " ticks to serve all customers with a single line.");

    }

    public static void threeLineSim(int numCustomers) {
        
        int time = 1;
        /* 
        * New customer every 5 ticks
        * 3 Individual lines
        * Customer always chooses the shortest
        * line (checking cashier 1, then 2, then 3)
        * cashier 1 - every 12 ticks
        * cashier 2 - every 19 ticks
        * cashier 3 - every 25 ticks
        *
        * How long does it take to check out
        * all customers?
        */
        Queue<Integer> c1 = new LinkedList<Integer>();
        Queue<Integer> c2 = new LinkedList<Integer>();
        Queue<Integer> c3 = new LinkedList<Integer>();

        int customer = 1;
        c1.add(customer);
        int customersServed = 0;

        while (customersServed < numCustomers) {
            if (time % 5 == 0 && customer < numCustomers) {
                customer++;
                if (c1.size() <= c2.size()) {
                    if (c1.size() <= c3.size()) {
                        c1.add(customer);
                    }
                    else {
                        c3.add(customer);
                    }
                }
                else if (c2.size() <= c3.size()) {
                    c2.add(customer);
                } else {
                    c3.add(customer);
                }
            }   `
            if (time % 12 == 0 && !c1.isEmpty()) {
                System.out.println("Cashier 1 served customer " + c1.remove());
                customersServed++;
            }
            if (time % 19 == 0 && !c2.isEmpty()) {
                System.out.println("Cashier 2 served customer " + c2.remove());
                customersServed++;
            }
            if (time % 25 == 0 && !c3.isEmpty()) {
                System.out.println("Cashier 3 served customer " + c3.remove());
                customersServed++;
            }
            time++;
        }
        System.out.println("It took a total of " + time + " ticks to serve all customers with three separate lines.");
    }


    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("How many customers do you want to simulate? ");
        int totalCustomers = kbd.nextInt();
        
        singleLineSim(totalCustomers);
        threeLineSim(totalCustomers);
    }
}
    
