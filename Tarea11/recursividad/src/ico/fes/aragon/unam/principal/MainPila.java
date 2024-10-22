package ico.fes.aragon.unam.principal;
import java.util.Stack;

public class MainPila{
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        System.out.println(pila);

        Integer medio = obtenerElementoMedio(pila);
        if (medio != null) {
            System.out.println("El elemento en la posición media es: " + medio);
        } else {
            System.out.println("La pila está vacía.");
        }
    }
    public static Integer obtenerElementoMedio(Stack<Integer> pila) {
        int size = pila.size();
        if (size == 0) {
            return null;
        }
        return obtenerMedio(pila, size, 0);
    }
    private static Integer obtenerMedio(Stack<Integer> pila, int tamano, int indiceActual) {
        if (indiceActual == tamano / 2) {
            return pila.pop();
        }
        int elemento = pila.pop();
        Integer medio = obtenerMedio(pila, tamano, indiceActual + 1);
        pila.push(elemento);
        return medio;
    }
    }
