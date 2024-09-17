package ico.fes.aragon.unam.main;
import ico.fes.aragon.unam.arreglos.Array2D;
public class Arreglos2dMain {

    public static void main(String[] args) {
        Array2D rejilla = new Array2D(5,5);
        System.out.println("Matriz inicializada");
        rejilla.imprimir();
        System.out.println("Ingresamos datos en la matriz");
        rejilla.setItem(1,3,'1');
        rejilla.setItem(2,2,'1');
        rejilla.setItem(3,2,'1');
        rejilla.setItem(0,4,'1');
        rejilla.imprimir();

        rejilla.numeroDeGeneraciones(5);
    }
}
