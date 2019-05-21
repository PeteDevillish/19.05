package pl.sdacademy.classes.figures;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getArea(){
        return r*r*Math.PI;
    }

    public double getParameter(){
        return 2*Math.PI *r;
    }
}
