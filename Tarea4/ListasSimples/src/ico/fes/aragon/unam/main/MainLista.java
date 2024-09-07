package ico.fes.aragon.unam.main;

import ico.fes.aragon.unam.clases.Smarphone;
import ico.fes.aragon.unam.listas.ListaLigada;

public class MainLista {

    public static void main(String[] args) {
        Smarphone sm1 = new Smarphone("Samsung","s24",128,8);
        Smarphone sm2 = new Smarphone("Motorola","Moto Edge30",128,8);
        Smarphone sm3 = new Smarphone("Huawei","Mate70",128,8);
        Smarphone sm4 = new Smarphone("Xiaomi","Mi14",256,8);
        Smarphone sm5 = new Smarphone("iphone","13proMax",128,8);
        // agregando los objetos a la lista
        ListaLigada<Smarphone> ll = new ListaLigada<>();
        ll.agregarAlfinal(sm1);
        ll.agregarAlfinal(sm2);
        ll.agregarAlfinal(sm3);
        ll.agregarAlfinal(sm4);
        ll.agregarAlfinal(sm5);
        //imprimiendo los datos
        ll.transversal();
        //Eliminar el de la pocision 2
        ll.eliminar(2);
        //Imprimiendo los datos despues de la eliminacion
        System.out.println("\n");
        ll.transversal();
        //actualizar el elemento 2
        ll.agregarDespuesde(sm1,new Smarphone("Poco","X3",128,4));

        //agregar un elemento y otro al final
        Smarphone sm6 = new Smarphone("OnePlus","Nord15",128,8);
        Smarphone sm7 = new Smarphone("LG","x20",128,8);
        ll.agregarAlinicio(sm6);
        ll.agregarAlfinal(sm7);
        //volver a imorimir todo
        System.out.println("\n");
        ll.transversal();
        // eliminar el primero en la lista
        ll.eliminarElprimero();
        // volver a imprimir
        ll.transversal();

    }
}
