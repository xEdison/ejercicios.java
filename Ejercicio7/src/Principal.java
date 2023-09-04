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
                System.out.println("La traducción al español es: " + traduccion);
            } else {
                System.out.println("La palabra no está en el diccionario.");
            }
        } else {
            System.out.println("Debes proporcionar una palabra en inglés como argumento.");
        }
    }
}
