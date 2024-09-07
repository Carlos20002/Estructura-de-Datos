package ico.fes.aragon.unam.main;

import ico.fes.aragon.unam.listas.Nodo;

public class NodoMain {
    public static void main(String[] args) {
        //paso uno crear la estructura de la imagen
       Nodo<Integer> head = new Nodo<>(100, new Nodo<>(200,
               new Nodo<>(300, new Nodo<>(400, new Nodo<>(600)))));
       //imprimir todo
        Nodo<Integer> aux = head;
        System.out.println(" ------------------------------> ");
        while (aux != null){
            System.out.println(aux.getDato() + " | -> |");
            aux = aux.getSiguiente();
        }
        System.out.println("null|");

        //Cambiar el valor del 3er nodo de 300 a 333
        head.getSiguiente().getSiguiente().setDato(333);

        // Imprimir todo nuevamente
        System.out.println("\n");

        Nodo<Integer> aux2 = head;
        System.out.println(" ----------------------------> ");
        while (aux2 != null){
            System.out.println(aux2.getDato() + " | -> |");
            aux2 = aux2.getSiguiente();
        }
        System.out.println("null|");

        // Insertar un nodo 700 despues del nodo 600 (al final)
        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(700));

        // Imprimir todo nuevamente
        System.out.println("\n");

        Nodo<Integer> aux3 = head;
        System.out.println(" ----------------------------> ");
        while (aux3 != null){
            System.out.println(aux3.getDato() + " | -> |");
            aux3 = aux3.getSiguiente();
        }
        System.out.println("null|");

        //Insertar un nodo con valor 50 al principio (antes del nodo 100)
       Nodo<Integer> nuevoNodo = new Nodo<>(50);
       nuevoNodo.setSiguiente(head);

        Nodo<Integer> aux4 = nuevoNodo;
        System.out.println(" ----------------------------> ");
        while (aux4 != null){
            System.out.println(aux4.getDato() + " | -> |");
            aux4 = aux4.getSiguiente();
        }
        System.out.println("null|");

    }
}
