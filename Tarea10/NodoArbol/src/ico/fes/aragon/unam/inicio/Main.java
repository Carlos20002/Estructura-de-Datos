package ico.fes.aragon.unam.inicio;

import ico.fes.aragon.unam.principal.NodoArbol;

public class Main {
    public static void main(String[] args) {
        NodoArbol<Integer> num = new NodoArbol<>(10);
        num.setHijoIzquierdo(new NodoArbol<>(5));
        num.setHijoDerecho(new NodoArbol<>(15));
        num.getHijoDerecho().setHijoDerecho(new NodoArbol<>(25));
        num.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>(1));

        System.out.println(num);

        System.out.println("");
        NodoArbol<String> nombres = new NodoArbol<>("Diego");
        nombres.setHijoIzquierdo(new NodoArbol<>("Pedro"));
        nombres.setHijoDerecho(new NodoArbol<>("Mario"));
        nombres.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("Susan"));
        nombres.getHijoIzquierdo().setHijoDerecho(new NodoArbol<>("Diana"));
        System.out.println(nombres);


    }
}
