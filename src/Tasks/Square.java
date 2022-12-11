package Tasks;

public class Square extends Figure {
    private int d;
    public Square(int a, int b, int c, int d){
        super(a,b,c);
        this.d = d;
    }
    @Override public double perimeter(){
        return getA()+getB()+getC()+getD();
    }
    @Override public double area(){
        return getA()+getB()+getC()+getD();
    }

    public void setD(int d) {
        this.d = d;
    }
    public int getD() {
        return d;
    }
}
