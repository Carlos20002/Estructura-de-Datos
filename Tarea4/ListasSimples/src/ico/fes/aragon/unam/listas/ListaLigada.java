package ico.fes.aragon.unam.listas;

public class ListaLigada <T> {
 //Atributos

 private Nodo<T> cabeza;
 private int tamanio;

 // Constructorno

 public ListaLigada() {

 }

 public void agregarAlfinal(T dato) {
  Nodo<T> nuevo = new Nodo<>(dato);
  if (cabeza == null) {
   cabeza = nuevo;
  } else {
   Nodo<T> aux = this.cabeza;
   while (aux.getSiguiente() != null) {
    aux = aux.getSiguiente();
   }
   aux.setSiguiente(nuevo);

  }

 }

 public void transversal() {

  Nodo<T> aux = this.cabeza;
  while (aux != null) {
   System.out.println(aux.getDato() + "---->");
   aux =aux.getSiguiente();
  }
  System.out.println(" ");
 }

 public boolean estaVacio() {
  if (this.cabeza == null) {
   System.out.println("Esta vacia ");
   return true;
  } else {
   System.out.println("Si tienen elementos ");
   return false;
  }
 }

 public void agregarAlinicio(T dato) {
  this.cabeza = new Nodo<>(dato, this.cabeza);

 }


 public void agregarDespuesde(T datoExis, T datoNuevo){

  Nodo<T> aux = this.cabeza;
  Nodo<T> copia;
  while (aux != null){
   if(aux.getDato() == datoExis){
     copia = aux.getSiguiente();
     aux.setSiguiente(new Nodo<>(datoNuevo,copia));
   }
   aux = aux.getSiguiente();
  }
 }

 public int buscar(T dato){
  int indice = 0;
  int contador = 0;
  Nodo<T> aux = this.cabeza;
  while(aux != null){
   contador++;
   if(aux.getDato() == dato){
    indice = contador;
    break;
   }
   aux = aux.getSiguiente();
  }return indice;
}

public void eliminar(int posicion){
 int contador = 0;
 Nodo<T> aux = this.cabeza;
 while (aux != null){
  contador++;
  if(contador == posicion-1 ){
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
  aux= aux.getSiguiente();
 }

}

public void eliminarElfinal(){
  int i = obtenerTamanio();
  int contador = 0;
  Nodo<T> aux = this.cabeza;
  while(aux != null) {
   contador++;
   if(contador == i - 1){
    aux.setSiguiente(null);
   }
   aux = aux.getSiguiente();
  }
}

 public void eliminarElprimero(){
  Nodo<T> copia = new Nodo<>(this.cabeza.getSiguiente().getDato(),
          this.cabeza.getSiguiente().getSiguiente());
  this.cabeza = copia;
 }

 public int obtenerTamanio(){
  int contador = 0;
  Nodo<T> aux = this.cabeza;
  while(aux != null){
   contador++;
   aux = aux.getSiguiente();
  }
  return contador;
 }

 public void actualizar(T valorAnt, T valorNue){
  Nodo<T> aux = this.cabeza;
  while (aux != null){
   if(aux.getDato() == valorAnt){
    aux.setDato(valorNue);
    break;
   }else {
    System.out.println("Valor no encontrado...");
   }
   aux = aux.getSiguiente();
  }
 }

}


