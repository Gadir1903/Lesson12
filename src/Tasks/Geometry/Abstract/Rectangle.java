package Tasks.Geometry.Abstract;

import Tasks.Geometry.Interfaces.Figure2d;
import Tasks.Geometry.Interfaces.Figure3d;

public abstract class Rectangle extends Figure implements Figure2d, Figure3d {
    public Rectangle(int a, int b) {
        super(a, b);
    }
}
