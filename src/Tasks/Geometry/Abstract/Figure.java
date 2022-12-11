package Tasks.Geometry.Abstract;

public abstract class Figure {
   private int a;
   private int b;
        public Figure(int a, int b){
            this.a = a;
            this.b = b;
        }

    protected int getA() {
        return a;
    }

    protected void setA(int a) {
        this.a = a;
    }

    protected int getB() {
        return b;
    }

    protected void setB(int b) {
        this.b = b;
    }

}
