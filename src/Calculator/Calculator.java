package Calculator;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("a ededi daxil edin");
        double a = sc.nextDouble();
        System.out.println("b ededi daxil edin");
        double b = sc.nextDouble();
        System.out.println("operatoru secin +1 , -2 , *3 , /4");
        int operator = sc.nextInt();
        double netice = 0;
        switch (operator){
            case 1:
                netice = Operators.topla(a,b);
                break;
            case 2:
                netice = Operators.cix(a,b);
                break;
            case 3:
                netice = Operators.vur(a,b);
                break;
            case 4:
                netice = Operators.bol(a,b);
            default:
                System.out.println("operator duzgun secilmedi...");
        }
        System.out.println(netice);
    }
}
