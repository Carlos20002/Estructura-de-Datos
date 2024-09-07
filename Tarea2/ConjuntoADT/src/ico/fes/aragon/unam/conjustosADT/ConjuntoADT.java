package ico.fes.aragon.unam.conjustosADT;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoADT<T> {
    //Atributos
    private Set<T> conjunto;

    //Constructor
    public ConjuntoADT() {
        this.conjunto = new HashSet<>();
    }

    //Metodos
    public int Longitud() {
        return conjunto.size();
    }

    public boolean Contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    public void Agregar(T elemento) {
        if(!(this.conjunto.contains(elemento))){
            conjunto.add(elemento);
        }
    }

    public void Eliminar(T elemento) {
        conjunto.remove(elemento);
    }


    public boolean Equals(ConjuntoADT<T> otro){
        return this.conjunto.equals(otro.conjunto);
    }

    public boolean esSubconjunto(ConjuntoADT<T> otro) {
        return otro.conjunto.containsAll(this.conjunto);
    }


    public ConjuntoADT<T> Union(ConjuntoADT<T> otro) {
        ConjuntoADT<T> nuevo = new ConjuntoADT<>();
        nuevo.conjunto.addAll(this.conjunto);
        nuevo.conjunto.addAll(otro.conjunto);
        return nuevo;
    }


    public ConjuntoADT<T> Interseccion(ConjuntoADT<T> otro) {
        ConjuntoADT<T> nuevo = new ConjuntoADT<>();
        nuevo.conjunto.addAll(this.conjunto);
        nuevo.conjunto.retainAll(otro.conjunto);
        return nuevo;
    }


    public ConjuntoADT<T> Diferencia(ConjuntoADT<T> otro) {
        ConjuntoADT<T> nuevo = new ConjuntoADT<>();
        nuevo.conjunto.addAll(this.conjunto);
        nuevo.conjunto.removeAll(otro.conjunto);
        return nuevo;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }
}




