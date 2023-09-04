public class Principal {

    public static void main(String[] args) {
        int numero = 15;
        mayor10(numero);
    }

    public static void mayor10(int numero) {
        if (numero > 10) {
            System.out.println("El número " + numero + " es mayor que 10.");
        }else {
        	System.out.println("El numero " + numero +" no es mayor que 10");
        }
    }
}
