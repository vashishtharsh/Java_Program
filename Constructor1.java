class Employe{
    private String name;
    private int salary;

    public Employe(){
        name = "Priyanshu Baral";
        salary = 9000;
    }
    public Employe(int sal){
        name = "Ashish";
        salary = sal;
    }
    public String getNam(){
        return name;
    }
    public int getSal(){
        return salary;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Employe emp = new Employe();
        Employe emp1 = new Employe(10000);

        System.out.println("Name: "+emp.getNam());
        System.out.println("Salary: "+emp.getSal());
        System.out.println();
        System.out.println("Name: "+emp1.getNam());
        System.out.println("Salary: "+emp1.getSal());
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
