import java.util.*;

class JuegoAdivinaNumero extends Juego {

    public int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Número fuera de rango (0-10)");
            return false;
        }
        return true;
    }
    protected void generarNumero() {
        numeroAAdivinar = (int)(Math.random() * 11);
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);

        reiniciaPartida();
        generarNumero();

        System.out.println("Adivina un número entre 0 y 10");

        while (true) {
            int intento = sc.nextInt();
            if (!validaNumero(intento)) {
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                boolean quedanVidas = quitaVida();

                if (!quedanVidas) {
                    System.out.println("Perdiste. El número era: " + numeroAAdivinar);
                    break;
                }

                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor");
                } else {
                    System.out.println("El número es menor");
                }
            }
        }
    }
}