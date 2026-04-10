class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }
    @Override
    protected void generarNumero() {
        do {
            numeroAAdivinar = (int)(Math.random() * 11);
        } while (numeroAAdivinar % 2 != 0);
    }
    @Override
    public boolean validaNumero(int num) {
        if (!super.validaNumero(num)) {
        return false;
        }

        if (num % 2 != 0) {
        System.out.println("Error: el número debe ser PAR");
        return false;
        }

        return true;
    }
}