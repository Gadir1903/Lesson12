import Tasks.Geometry.Figures.Cube;
import Tasks.Geometry.Figures.NormalTriangle;
import Tasks.Geometry.Figures.Pyramid;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // ilk eded
//        System.out.println("ilk ədədi daxil edin");
//        double a = sc.nextDouble();
//        // ikinci eded
//        System.out.println("ikinci ədədi daxil edin");
//        double b = sc.nextDouble();
//        // operator sec
//        System.out.println("Operatoru seçin : + , - , * , / , %");
//        String operator = sc.next();
//        switch (operator) {
//            case "+":
//                System.out.println("Cavab :" + (a + b));
//                break;
//            case "-":
//                System.out.println("Cavab :" + (a - b));
//                break;
//            case "*":
//                System.out.println("Cavab :" + (a * b));
//                break;
//            case "/":
//                System.out.println("Cavab :" + (a / b));
//                break;
//            case "%":
//                System.out.println("Cavab :" + (a % b));
//                break;
//            default:
//                System.out.println("Operator Düzgün Seçilməyib!");
//        }
//        Calculator.calculate();
//        Triangle triangle = new Triangle(4,3,2);
//        triangle.perimeter();
//        System.out.println("Triangle Perimeter = " + triangle.perimeter());
//
//        Square square = new Square(3,4,5,8);
//        square.area();
//        System.out.println("Square Perimeter = " + square.area());
        Cube cube = new Cube(23,45,23);
        System.out.println("Cube Volume = " + cube.volume());

        Pyramid pyramid = new Pyramid(3,4);
        System.out.println("Pyramid Volume = " + pyramid.volume());

        NormalTriangle normalTriangle = new NormalTriangle(3,4,5);
        System.out.println("NormalTriangle = " + normalTriangle.perimeter());
        System.out.println("NormalTriangle = " + normalTriangle.area());
    }
}

