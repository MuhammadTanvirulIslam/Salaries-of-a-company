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