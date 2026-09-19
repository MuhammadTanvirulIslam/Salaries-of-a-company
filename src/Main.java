import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Workers> workers = new ArrayList<>();

        workers.add(new Workers("Tanvir Islam", 3500.00, 940.00));
        workers.add(new Workers("Peter Parker", 5600.00, 980.00));
        workers.add(new Workers("Lamine Yamal", 9000.00, 670.00));

        System.out.println("--- Workers' Overview ---");
        for (Workers worker : workers) {
            System.out.println(worker);
            System.out.println("---");

        }

        double globalTotalSalary = GlobalTotalSalary(workers);
        System.out.printf("Global Total Salary of all workers: $%.2f%n", globalTotalSalary);
    }

    public static double GlobalTotalSalary(List<Workers> workers) {
        double total = 0.0;
        for (Workers worker : workers) {
            total += worker.getTotalSalary();
        }
        return total;
    }
}



/*
 * Question:1. Is your design ready to easily accept changes in how to calculate the total salary (e.g., taking taxes into account)?
 * Answer: As we used encapsulation concept, it is easy to change calculation of salary. If tax  or any extra bonuses need to be added later, we only need to update the  getTotalSalary(), without modifying the main application
 */


/*
 * Question:2. How to implement the case where I don't use all of the 100 "spaces" for workers (e.g., if my company only has 20 workers)?
 * answer: Instead of using fixed sized array we can use Arraylist for avoiding memory wastage. In my code I already have used Arraylist so it won't change the fact whether i am taking 100 workers or 20 workers it will consume memory as per usage.
 * */