package ico.fes.aragon.unam.listaDoble;

public class DoubleLinkedList <T> {

    //atributos
    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int tamano;


    //Contructores
    public DoubleLinkedList() {
    }

    //metodos
    public boolean EstaVacio() {
        boolean res = false;
        if (this.cabeza == null && this.cola == null) {
            res = true;
        }
        return res;
    }

    public int obtenerTamanio() {
        return tamano;
    }

    public void agregarAlinicio(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (this.EstaVacio()) {
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            this.cabeza.setAnterior(nuevo);
            nuevo.setSiguiente(this.cabeza);
            this.cabeza = nuevo;
        }
        this.tamano++;
    }

    /**
     * @param direccion 0 --> izq a derecha  si es 1 --> derecha a iz
     */
    public void transversal(int direccion) {
        if (direccion == 1) {
            NodoDoble<T> aux = this.cola;
            while (aux != null) {
                System.out.println(aux);
                aux = aux.getAnterior();
            }
        } else if(direccion == 0){
            NodoDoble<T> aux = this.cabeza;
            while (aux != null) {
                System.out.println(aux);
                aux = aux.getSiguiente();
            }
        }
        System.out.println("");
    }

    public void agregarDespuesDe(T referencia, T valor) {
        NodoDoble<T> aux = this.cabeza;
        while (aux != null) {
            if (aux.getDato() == referencia) {
                NodoDoble<T> nuevo = new NodoDoble<>(valor);
                nuevo.setSiguiente(aux.getSiguiente());
                nuevo.setAnterior(aux);
                if (aux.getSiguiente() != null) {
                    aux.getSiguiente().setAnterior(nuevo);
                } else {
                    this.cola = nuevo;
                }
                aux.setSiguiente(nuevo);
                tamano++;
                return;

            }
            aux = aux.getSiguiente();

        }
        System.out.println("No se encontro la referencia");
    }

    public void agregarAlfinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        NodoDoble<T> aux = this.cabeza;
        if (this.EstaVacio()) {
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            while(aux != null){
             if(aux.getSiguiente() == null){
                 aux.setSiguiente(nuevo);
                 nuevo.setAnterior(aux);
                 this.cola = nuevo;
                 break;
             }
             aux= aux.getSiguiente();
            }
        }
        this.tamano++;
    }

    public int buscar(T valor) {
        int indice = 0;
        int contador = 0;
        NodoDoble<T> aux = this.cabeza;
        while (aux != null) {
            ++contador;
            if (aux.getDato() == valor) {
                indice = contador;
                break;
            }
            aux = aux.getSiguiente();
        }
        return indice;
    }

    public void eliminarElPrimero() {
        if(this.cabeza == null){
            System.out.println("La lista esta vacia, no nada por eliminar");
            return;
        }
        this.cabeza = cabeza.getSiguiente();
        if(this.cabeza != null){
            this.cabeza.setAnterior(null);
        }else{
            this.cola = null;
        }
        tamano--;
    }

    public void eliminarElFinal() {
      if (this.cola == null){
          System.out.println("Lista vacia, no hay elementos por borrar");
          return;
      }
      this.cola = cola.getAnterior();
      if(this.cola != null){
          this.cola.setSiguiente(null);
      }else{
          this.cabeza = null;
      }
        tamano--;
}


    public void eliminarPosicion(int posicion){
        int contador= 0;
        int indice = posicion;
        NodoDoble<T> aux = this.cabeza;
        NodoDoble<T> copia;
        while (aux != null){
            contador++;
            if (contador == indice){
                copia = aux.getAnterior();
                copia.setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(copia);
                return;
            }
            aux= aux.getSiguiente();
        }
        System.out.println("Posicion no encontrada");
        tamano--;
    }

    public void actualizar(T referencia, T valor){
        NodoDoble<T> aux = this.cabeza;
        while(aux != null){
            if(aux.getDato() == referencia){
                aux.setDato(valor);
               return;
            }
            aux = aux.getSiguiente();
        }
        System.out.println("No se esncontro el dato");
    }

    public T obtener(int posicion){
      NodoDoble<T> aux = this.cabeza;
      T dato = null;
      int contador = 0;
      while (aux != null){
          ++contador;
          if(posicion != 0 && posicion<obtenerTamanio()){
              if (posicion == contador){
                  dato =aux.getDato();
              }
          }
          aux = aux.getSiguiente();
      }
        return dato;
    }
}







