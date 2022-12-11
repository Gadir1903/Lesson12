package Tasks.Geometry.Figures;

import Tasks.Geometry.Abstract.Figure;
import Tasks.Geometry.Interfaces.Figure2d;

public class NormalTriangle extends Figure implements Figure2d {

    private int c;

    public NormalTriangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int perimeter() {
        return getA()+getB()+getC();
    }

    @Override
    public int area() {
        return getA()*getB()*getC();
    }
}
