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





