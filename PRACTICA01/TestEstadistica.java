package PRACTICA01;
import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < datos.length; i++) {
            datos[i] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(datos);
        System.out.printf("El promedio es %.2f%n", est.promedio());
        System.out.printf("La desviacion estandar es %.5f%n", est.desviacion());
        sc.close();
    }
}