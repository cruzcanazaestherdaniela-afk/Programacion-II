package PRACTICA01;
import java.util.Scanner;

public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        EcuacionLineal ecuacion1 = new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion1.tieneSolucion()) {
            System.out.println("x = " + ecuacion1.getX()+ ", y = " + ecuacion1.getY());
        }
        else {
            System.out.println("La ecuacion no tiene solucion");
        }
        sc.close();
    }
}