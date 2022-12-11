package Tasks.Geometry.Figures;

import Tasks.Geometry.Abstract.Figure;
import Tasks.Geometry.Interfaces.Figure3d;

public class Cube extends Figure implements Figure3d {
    private int c;
    public Cube(int a, int b, int c) {
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
    public double volume() {
        return getA()*getB()*getC();
    }
}
