

public class Person {
    private String name;
    private int id;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    void print1(){
        System.out.println(getName());
        System.out.println(getid());
    }
}
