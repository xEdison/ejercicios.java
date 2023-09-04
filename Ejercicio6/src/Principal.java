public class Principal {

    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};

        int[] resultado = sumarArreglos(arreglo1, arreglo2);

        System.out.print("Arreglo resultante: ");
        for (int elemento : resultado) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            throw new IllegalArgumentException("Los arreglos no tienen el mismo tamaño.");
        }

        int[] resultado = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        return resultado;
    }
}
