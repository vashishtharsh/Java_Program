import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n];
        System.out.println("Take elements of an array:");
        for (int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Print element of an array:");
        for (int i=n-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
