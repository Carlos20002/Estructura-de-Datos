package ico.fes.aragon.unam.colas;
import java.util.LinkedList;
public class ColasADT<E> {
    private LinkedList<E> data;

    public ColasADT(){
        this.data = new LinkedList<>();
    }

    public boolean estaVacia(){
        boolean res = false;
        if (this.data.size() == 0){
            res = true;
        }
        return res;
    }

    public int longitud(){
        return this.data.size();
    }

    public E frente(){
        return this.data.getFirst();
    }

    public void encolar(E elemento){
        this.data.addLast(elemento);
    }

    public E desecolar(){
        return this.data.removeFirst();
    }

    @Override
    public String toString() {
        return "ColasADT{" +
                "data=" + data +
                '}';
    }
}
