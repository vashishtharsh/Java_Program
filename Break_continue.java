public class Break_continue {
    public static void main(String[] args) {
        /*System.out.println("******Break Statement******");
        System.out.println("For Loop");
        for (int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("Hello!");
            if(i==2){
                System.out.println("End");
                break;
            }
        }
        System.out.println("\n");
        System.out.println("While Loop");
        int i = 0;
        while (i<5){                          //Same as Do-While
            System.out.println(i);
            System.out.println("Good");
            if(i==2){
                System.out.println("End");
                break;
            }
            i++;
        }*/

        System.out.println("******Continue Statement******");
        System.out.println("For Loop");
        for (int i = 0; i<5; i++){
            if(i==2){
                System.out.println("End");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello!");
        }

        System.out.println("\n");

        System.out.println("While Loop");
        int i = 0;
        while (i<5){                          //Same as Do-While
            if(i==2){
                i++;
                System.out.println("End");
                continue;
            }
            System.out.println(i);
            System.out.println("Good");
            i++;
        }
    }
}
