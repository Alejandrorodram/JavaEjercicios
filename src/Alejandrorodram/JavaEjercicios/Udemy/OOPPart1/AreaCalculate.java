package Alejandrorodram.JavaEjercicios.Udemy.OOPPart1;

public class AreaCalculate {
    private double width;
    private double height;

    public AreaCalculate (double width, double height){
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }
    public AreaCalculate (){
        this(0, 0);
    }

    public double getWidth (){
        return width;
    }
    public double getHeight (){
        return height;
    }
    public void setWidth (double width){
        this.width = width < 0 ? 0 : width;

    }
    public void setHeight (double height){
        this.height = height < 0 ? 0 : height;
    }
    public double getArea(){
        double area = width*height;
        return area;
    }

}
