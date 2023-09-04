import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        numeroAzar();
    }

    public static int numeroAzar() {
        Random rand = new Random();
        int aleatorio = rand.nextInt(100) + 1;
        System.out.println("Número aleatorio generado: " + aleatorio);
        return aleatorio;
    }
}

