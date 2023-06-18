

public class Triangle extends Shape{
    double base,height;

    Triangle(String base,String height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5*base*height;
    }
    
}
