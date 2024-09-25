package ico.fes.aragon.unam.principal;
import ico.fes.aragon.unam.inicio.PilaADT;
import java.util.HashMap;

public class PilaMain {
    public static void main(String[] args) {
        System.out.println("El siguiente texto esta balaceado '[[{[()()]}]]' : "+estaBalanceado("[[{[()()]}]]"));
        System.out.println("El siguiente texto esta balaceado '{{[3*5(3456/3456)]}14+2}' : "+
                estaBalanceado("{{[3*5(3456/3456)]}14+2}"));
        System.out.println("El siguiente texto esta balaceado '((8+20)+17]]' : "+estaBalanceado("((8+20)+17]]"));
        System.out.println("El siguiente texto esta balaceado '{(1/5)/(7*4)}' : "+estaBalanceado("{(1/5)/(7*4)}"));
        System.out.println("El siguiente texto esta balaceado '[2+3([{(5)}])]' : "+estaBalanceado("[2+3([{(5)}])]"));
        System.out.println("El siguiente texto esta balaceado '([23/4)]' : "+estaBalanceado("([23/4)]"));
    }

    public static  boolean estaBalanceado(String texto) {
        HashMap<Character, Character> pares = new HashMap<>();
        pares.put('{', '}');
        pares.put('(', ')');
        pares.put('[',']');

        PilaADT<Character> pila = new PilaADT<>();
        for (char charac : texto.toCharArray()) {
            if (pares.containsKey(charac)) {
                pila.push(charac);
            } else if (pares.containsValue(charac)) {
                if (pila.isEmpty() || pares.get(pila.pop()) != charac) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
