package pl.sdacademy.classes.figures;

public class Traingle {
    private int a, b, c, h;

    public Traingle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getArea() {
        return a * h / 2;
    }

    public int getParameter() {
        return a + b + c;
    }
}
