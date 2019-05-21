package pl.sdacademy.classes.figures;

public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getArea(){
        return a*b;
    }

    public int getParameter(){
        return 2*(a+b);
    }
}


