import java.util.Scanner;

public class Conditionals_Relational_Op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Yes you can drive the car!");
            } else {
                System.out.println("No you cannot drive the car yet!");
            }
    }
}
