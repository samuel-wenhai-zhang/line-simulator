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
    }


    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("How many customers do you want to simulate? ");
        int totalCustomers = kbd.nextInt();
        
        singleLineSim(totalCustomers);
        threeLineSim(totalCustomers);

    }
}
    
