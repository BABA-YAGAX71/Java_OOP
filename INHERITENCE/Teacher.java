

public class Teacher extends Person {
    private String quality;

    public void setquality(String quality){
        this.quality = quality;
    }
    public String getquality(){
        return quality;
    }
    void print(){
        System.out.println(getName());
        System.out.println(getid());
        System.out.println(getquality());
    }
    
}
