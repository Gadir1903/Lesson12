package OOP;

public class Overloading {
    static int test(int a,int b){
        return a+b;
    }
    static int test(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(test(4,3));
        System.out.println(test(2,3,4));
    }
}
