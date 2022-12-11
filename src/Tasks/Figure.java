package Tasks;

public class Figure {
    private int a;
    private int b;
    private int c;

    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

     int getA() {
        return a;
    }

     void setA(int a) {
        this.a = a;
    }

     int getB() {
        return b;
    }

     void setB(int b) {
        this.b = b;
    }

     int getC() {
        return c;
    }

     void setC(int c) {
        this.c = c;
    }

    public double perimeter(){
       return a+b+c;
    }
    public double area(){
        return a*b*c;
    }
}
