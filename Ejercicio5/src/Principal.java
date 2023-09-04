import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(7);
        lista.add(1);
        lista.add(9);
        lista.add(4);
        lista.add(8);
        lista.add(2);

        int valorMaximo = encontrarMaximo(lista);
        System.out.println("El valor máximo en la lista es: " + valorMaximo);
    }

    public static int encontrarMaximo(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía.");
        }

        return Collections.max(lista);
    }
}
