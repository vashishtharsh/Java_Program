public class Conditionals_Logical_Op {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.print("For Logical AND: ");
        if(a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.print("For Logical OR: ");
        if(a || b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For Logical NOT: ");
        System.out.print("NOT(a) is: ");
        System.out.println(!a);
        System.out.print("NOT(b) is: ");
        System.out.println(!b);
    }
}
