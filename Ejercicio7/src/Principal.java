import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
   
        Map<String, String> diccionario = new HashMap<>();

       
        diccionario.put("apple", "manzana");
        diccionario.put("cat", "gato");
        diccionario.put("dog", "perro");
        diccionario.put("book", "libro");
        diccionario.put("computer", "computadora");

     
        if (args.length == 1) {
            String palabraEnIngles = args[0].toLowerCase();

           
            if (diccionario.containsKey(palabraEnIngles)) {
                String traduccion = diccionario.get(palabraEnIngles);
                System.out.println("La traducci�n al espa�ol es: " + traduccion);
            } else {
                System.out.println("La palabra no est� en el diccionario.");
            }
        } else {
            System.out.println("Debes proporcionar una palabra en ingl�s como argumento.");
        }
    }
}
