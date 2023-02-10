class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Access_modifier {
    public static void main(String[] args) {
        MyEmployee person = new MyEmployee();
        // person.id = 45;
        // person.name = "Harsh Vashishtha"; --> Throws an error due to private access modifier
        person.setName("Harsh Vashishtha");
        System.out.println(person.getName());
        person.setId(1001);
        System.out.println(person.getId());
    }
}
