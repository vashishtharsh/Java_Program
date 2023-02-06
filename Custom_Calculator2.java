import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot add 8 and 9";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Input cannot be greater than 100000";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Cannot divide by Zero";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "Input cannot be greater than 7000 while multiplying";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws MaxInputException, CannotDivideByZeroException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class Custom_Calculator2 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException{
        Scanner sc = new Scanner(System.in);
        CustomCalculator c = new CustomCalculator();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1.Add\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("which operation you want to perform: ");
        int opt = sc.nextInt();
        switch (opt) {
//            case 1 -> System.out.println(c.add(a, b));
//            case 2 -> System.out.println(c.subtract(a, b));
//            case 3 -> System.out.println(c.multiply(a, b));
//            case 4 -> System.out.println(c.divide(a, b));
//            default -> System.out.println("Choose the correct option");
	        case 1:
		        System.out.println(c.add(a, b));
		        break;
	        case 2:
		        System.out.println(c.subtract(a, b));
		        break;
	        case 3:
		        System.out.println(c.multiply(a, b));
		        break;
	        case 4:
		        System.out.println(c.divide(a, b));
		        break;
		    default:
			    System.out.println("Choose the correct option");
        }
    }
}
