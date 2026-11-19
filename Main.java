import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String texto = "abcabaabcabacabaa";
        int n = texto.length();

        String padrao = "abaa";
        int m = padrao.length();

        LinkedList<Object> deslocamento = new LinkedList<>();

        for (int i = 0; i<=n-m; i++){
            if(texto.substring(i, i+m).equals(padrao)){
                deslocamento.add(i);
            }
        }

        System.out.println("Deslocamentos: "+ deslocamento);

    }
}
