class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 1003;
        name = "Ashish Mishra";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1002;
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
        MyMainEmployee priyanshu = new MyMainEmployee("Priyanshu Baral", 1001);
        MyMainEmployee priyanshu1 = new MyMainEmployee("Abhishek Mishra");
        MyMainEmployee priyanshu2 = new MyMainEmployee();
        //priyanshu.setName("Priyanshu Baral");   --> This statement we get as output if we uncomment it.
        //priyanshu.setId(34);
        System.out.println(priyanshu.getId());
        System.out.println(priyanshu.getName());
    }
}
