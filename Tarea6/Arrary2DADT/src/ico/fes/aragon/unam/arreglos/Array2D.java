package ico.fes.aragon.unam.arreglos;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Array2D {
     //Atributos
    private static final Character VIVO = '1';
    private static final Character MUERTO = '0';
    private Character[][] data;
    private int rowSize;
    private int colSize;

    //Constructores

    public Array2D(){}

    public Array2D( int ren, int col){
        this.rowSize = ren;
        this.colSize = col;
        this.data =  new Character[ren][col];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                this.data[i][j] = MUERTO;
            }
        }
    }

    // Metodos

    public void clear(Character dato){
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                   this.data[i][j] = dato;
                }
            }
    }


    public int getRowSize(){
        return rowSize;
    }
    public int getColSize(){
        return colSize;
    }

    @Override
    public String toString() {
        String str = " ";
        for (int i = 0; i < this.rowSize;i++){
            for(int j = 0; j < this.colSize;j++){
                str = str + this.data[i][j] +" , ";
            }
            str = str + "\n";
        }
        return str;
    }

    public void setItem(int ren, int col, Character dato){
        if( ren >= 0 && ren <= this.rowSize && col >= 0 && col <= this.colSize){
            this.data[ren][col] = dato;
        }else{
            System.out.println("Indices fuera de rango...");
        }
    }

    public Character getItem(int ren, int col) {
        if (ren >= 0 && ren < this.rowSize && col >= 0 && col < this.colSize) {
            return this.data[ren][col];
        } else {
            System.out.println("Indices fuera de rango...");
        }
        return '\0';
    }
    public void imprimir() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void numeroDeGeneraciones(int generaciones){
        for (int i = 0; i < generaciones; i++) {
            this.data = evolucionar(this.data);
            System.out.println("Generación " + (i + 1) + ":");
            imprimir();
        }
    }

    public  Character[][] evolucionar(Character[][] matriz) {
        int n = matriz.length;
        Character[][] nuevaMatriz = new Character[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int vivos = contarVecinosVivos(matriz, i, j);

                if (matriz[i][j] == VIVO) {
                    if (vivos < 2 || vivos > 3) {
                        nuevaMatriz[i][j] = MUERTO;
                    } else {
                        nuevaMatriz[i][j] = VIVO;
                    }
                } else {
                    if (vivos == 3) {
                        nuevaMatriz[i][j] = VIVO;
                    } else {
                        nuevaMatriz[i][j] = MUERTO;
                    }
                }
            }
        }
        return nuevaMatriz;
    }
    private static int contarVecinosVivos(Character[][] matriz, int x, int y) {
        int n = matriz.length;
        int vivos = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int nuevoX = x + i;
                int nuevoY = y + j;

                if (nuevoX >= 0 && nuevoX < n && nuevoY >= 0 && nuevoY < n) {
                    if (matriz[nuevoX][nuevoY] == VIVO) {
                        vivos++;
                    }
                }
            }
        }
        return vivos;
    }
}
