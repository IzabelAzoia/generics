package comparableXcomparator.generics;
import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave1", 10);
        mapaSemGenerics.put("Chave 2", "valor");


        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put(("Chave 1"), 10);
        mapaGenerics.put("Chave 2", 20);

        for(Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        for(Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
