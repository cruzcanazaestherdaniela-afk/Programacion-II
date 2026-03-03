package PRACTICA01;
import java.util.Arrays;
import java.util.Random;
public class PruebaCronometro {
        public static void main(String[] args) {
        int n = 100000;
        int[] numeros = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(100000);
        }
        Cronometro c1 = new Cronometro();
        c1.inicia();
        Arrays.sort(numeros);
        c1.detener();
        System.out.println("Lapso de Tiempo: "+ c1.lapsoDeTiempo() + " milisegundos");
    }
}