class Employee{
    int id;
    int salary;
    String name;
    public void getDetails(){
        System.out.println("Id of the employee is "+id);
        System.out.println("Name of the employee is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        Employee Abhishek = new Employee();
        Employee Aman = new Employee();

        Abhishek.id = 1001;
        Abhishek.salary = 40;
        Abhishek.name = "Abhishek";
        Aman.id = 1002;
        Aman.salary = 35;
        Aman.name = "Aman";

        Abhishek.getDetails();
        System.out.println("Salary is "+Abhishek.getSalary()+"K");
        System.out.println();
        Aman.getDetails();
        System.out.println("Salary is "+Aman.getSalary()+"K");

    }
}
