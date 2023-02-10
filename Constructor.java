class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 103;
        name = "Aman Sharma";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 102;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee harsh = new MyMainEmployee("Harsh Vashishtha", 101);
        MyMainEmployee harsh1 = new MyMainEmployee("Aman Sharma");
        MyMainEmployee harsh2 = new MyMainEmployee();
        //harsh.setName("Harsh Vashishtha");   --> This statement we get as output if we uncomment it.
        //harsh.setId(34);
        System.out.println(harsh.getId());
        System.out.println(harsh.getName());
    }
}
