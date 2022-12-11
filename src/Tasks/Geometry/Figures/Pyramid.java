package Tasks.Geometry.Figures;

import Tasks.Geometry.Abstract.Figure;
import Tasks.Geometry.Interfaces.Figure3d;

public class Pyramid extends Figure implements Figure3d {

    public Pyramid(int a, int b) {
        super(a, b);
    }

    @Override
    public double volume() {
        return 0.33 * getA() *getB();
    }
}
