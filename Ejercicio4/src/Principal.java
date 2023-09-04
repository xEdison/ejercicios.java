public class Principal {

    public static void main(String[] args) {
        int[] arreglo = {3, 7, 1, 9, 4, 8, 2};
        int valorMaximo = encontrarMaximo(arreglo);
        System.out.println("El valor máximo en el arreglo es: " + valorMaximo);
    }

    public static int encontrarMaximo(int[] arreglo) {
        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío.");
        }

        int maximo = arreglo[0]; 

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        return maximo;
    }
}
