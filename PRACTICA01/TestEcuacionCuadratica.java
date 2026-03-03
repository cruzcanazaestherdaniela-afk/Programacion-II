package PRACTICA01;
import java.util.Scanner;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionCuadratica ecuacion1 = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion1.getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices "+ ecuacion1.getRaiz1() + " y " + ecuacion1.getRaiz2());
        }
        else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una raiz "
                    + ecuacion1.getRaiz1());
        }
        else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        sc.close();
    }
}