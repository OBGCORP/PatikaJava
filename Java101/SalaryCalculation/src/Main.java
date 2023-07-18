public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ahmet", 150000,45,1985);
        employee.bonus();
        employee.raiseSalary();
        employee.tax();
    }
}