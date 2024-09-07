package ico.fes.aragon.unam.main;

import ico.fes.aragon.unam.conjustosADT.ConjuntoADT;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ConjuntoADT<Integer> conjunto1 = new ConjuntoADT<>();
        ConjuntoADT<Integer> conjunto2 = new ConjuntoADT<>();

        conjunto1.Agregar(1);
        conjunto1.Agregar(2);
        conjunto1.Agregar(3);
        conjunto1.Agregar(220);
        conjunto1.Agregar(323);

        conjunto2.Agregar(3);
        conjunto2.Agregar(4);
        conjunto2.Agregar(5);
        conjunto2.Agregar(23);
        conjunto2.Agregar(34);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("\n");
        //--------------------------------------------------------
        conjunto1.Eliminar(220);
        conjunto1.Eliminar(323);

        conjunto2.Eliminar(23);
        conjunto2.Eliminar(34);

        System.out.println("Conjuntos depues de eliminar elementos: ");
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("\n");
        //--------------------------------------------------------
        System.out.println("Comprobar si los elementos pertenesen a los conjuntos: ");
        System.out.println("El conjunto1 tiene el elemento 20: "+conjunto1.Contiene(20));
        System.out.println("El conjunto1 tiene el elemento 2: "+conjunto1.Contiene(2));
        System.out.println("El conjunto1 tiene el elemento 345: "+conjunto1.Contiene(345));

        System.out.println("El conjunto2 tiene el elemento 5: "+conjunto2.Contiene(5));
        System.out.println("El conjunto2 tiene el elemento 578: "+conjunto2.Contiene(578));
        System.out.println("El conjunto2 tiene el elemento 4: "+conjunto2.Contiene(4));

        System.out.println("\n");
        //--------------------------------------------------------
        System.out.println("Operaciones de conjuntos: ");
        System.out.println("Unión: " + conjunto1.Union(conjunto2));
        System.out.println("Intersección: " + conjunto1.Interseccion(conjunto2));
        System.out.println("Diferencia: " + conjunto1.Diferencia(conjunto2));


    }
}
