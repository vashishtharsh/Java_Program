import java.util.Scanner;

public class Custom_Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, option;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1.Add\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("which operation you want to perform: ");

        option = sc.nextInt();
        if (a <= 100000 && b <= 100000) {
            switch (option){
                case 1:
                    System.out.println("Sum: "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction: "+(a-b));
                    break;
                case 3:
                    try{
                        if ((a*b)<7000)
                            System.out.println("Multiplication: "+(a*b));
                        else
                            System.out.println("cross the limit of multiplication...");
                    }
                    catch(Exception e){
                        System.out.println("Max limit 7000 crossed exception..."+e);
                    }
                    break;
                case 4:
                    try{
                        if(b!=0)
                            System.out.println("Division: "+(a/b));
                        else
                            throw new ArithmeticException("Divided by zero exception occur...");
                    }
                    catch (ArithmeticException e){
                        System.out.println("Don't put 0 at denominator...");
                    }
                    break;
                default:
                    System.out.println("Choose the correct option");
            }
        }
        else {
            System.out.println("invalid Input");
        }
    }
}
