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
        Employee Ashish = new Employee();

        Abhishek.id = 1001;
        Abhishek.salary = 40;
        Abhishek.name = "Abhishek";
        Ashish.id = 1002;
        Ashish.salary = 35;
        Ashish.name = "Ashish";

        Abhishek.getDetails();
        System.out.println("Salary is "+Abhishek.getSalary()+"K");
        System.out.println();
        Ashish.getDetails();
        System.out.println("Salary is "+Ashish.getSalary()+"K");

    }
}
