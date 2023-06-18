public class Sir {
    String name;
    int id;

    Sir(){
        System.out.println("No");
    }
    Sir(String h){
        name = h;
    }
    Sir(String h, int i){
        name  = h;
        id = i;
    }   
    void print(){
        System.out.println("name"+name);
        System.out.println("id:"+id);
    }
}

