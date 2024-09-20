package ico.fes.aragon.unam.colas;
public class ColaConPrioridadAcotada <E>{
private ColasADT<E> []colas;
private int maxPrioridad;

    public ColaConPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        this.colas = new ColasADT[maxPrioridad + 1  ];
        for (int i = 0; i < this.maxPrioridad + 1 ; i++) {
            this.colas[i] = new ColasADT<>();
        }
    }

    public int longitud (){
        int contador = 0;
        for (int i = 0; i < maxPrioridad+1; i++) {
            contador +=this.colas[i].longitud();
        }
        return contador;
    }

    public boolean estaVacia(){
        boolean res = false;
        if (this.colas.length == 0){
            res = true;
        }
        return res;
    }

    public void encolar(int prioridad,E elemento){
            if(prioridad>=1 && prioridad<= this.maxPrioridad){
                this.colas[prioridad].encolar(elemento);
            }
    }

    public E desencolar() {
        for (int i = 0 ; i < maxPrioridad + 1  ; i++) {
            if (!colas[i].estaVacia()){
                return colas[i].desecolar();
            }
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxPrioridad + 1; i++) {
            sb.append("Nivel ").append(i).append(": "); 
            if (colas[i].estaVacia()) {
                sb.append("vacío");
            } else {
                sb.append("[");
                sb.append(colas[i]).append(" ,");
                sb.setLength(sb.length() - 2);
                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
