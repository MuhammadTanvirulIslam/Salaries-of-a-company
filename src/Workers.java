public class Workers {
    private String name;
    private double baseSalary;
    private double complement;

    public Workers(String name, double baseSalary, double complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    public double getTotalSalary() {
        return baseSalary + complement;
    }

    public String toString() {
        return String.format("Name: %-15s | Base Salary: $%.2f | Complement: $%.2f | Total Salary: $%.2f",
                name, baseSalary, complement, getTotalSalary());
    }
}





/*
 * Question:1. Is your design ready to easily accept changes in how to calculate the total salary (e.g., taking taxes into account)?
 * Answer: As we used encapsulation concept, it is easy to change calculation of salary. If tax  or any extra bonuses need to be added later, we only need to update the  getTotalSalary(), without modifying the main application
 */


/*
 * Question:2. How to implement the case where I don't use all of the 100 "spaces" for workers (e.g., if my company only has 20 workers)?
 * answer: Instead of using fixed sized array we can use Arraylist for avoiding memory wastage. In my code I already have used Arraylist.
 * */