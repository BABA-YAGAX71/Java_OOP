

public class Car extends Vehicle{
    int gear;
    Car(String c, double w, int g){
        super(c,w);
        gear = g;
    } 
    void copy(){
        super.print();;
        System.out.println("Gear"+gear);
    }
    
}
