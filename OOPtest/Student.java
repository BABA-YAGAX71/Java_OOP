
public class Student {
    String name;
    int id;   
    Student(){
        System.out.println("no information");
    }
    Student(String n){
        name = n;
    }
    Student(String n,int i){
        name = n;
        id = i;
    }
    void print(){
        System.out.println("Name :"+name);
        System.out.println("id :"+id);
    }
}
