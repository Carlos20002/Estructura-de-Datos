package ico.fes.aragon.unam.principal;

import ico.fes.aragon.unam.listaDoble.DoubleLinkedList;
import ico.fes.aragon.unam.listaDoble.NodoDoble;

public class MainDoubleLinkedList {
    public static void main(String[] args) {

        System.out.println("Creando lista de tipo integer");
    DoubleLinkedList<Integer> numeros = new DoubleLinkedList<>();

    // añadiendo el 50 al inicio
    numeros.agregarAlinicio(50);
    //añadiendo al final
    numeros.agregarAlfinal(60);
    numeros.agregarAlfinal(65);
    numeros.agregarAlfinal(70);
    numeros.agregarAlfinal(80);
    numeros.agregarAlfinal(90);
        System.out.println("imprimiendo contenido");
    numeros.transversal(0);
        System.out.println("eliminar el de la posicion 2");
    numeros.eliminarPosicion(2);
        System.out.println("volver a imprimir");
    numeros.transversal(0);
        System.out.println("actualizar el cuarto elemento a 88");
    numeros.actualizar(80,88);
        System.out.println("volver a imprimir");
    numeros.transversal(0);
        System.out.println("buscar el valor 88, e imprimir en que pocicion se encuentra");
        System.out.println("El valor 88 tiene la posicion: "+numeros.buscar(88));



    }

}
