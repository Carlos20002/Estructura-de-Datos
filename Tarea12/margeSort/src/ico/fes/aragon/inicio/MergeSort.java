package ico.fes.aragon.inicio;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] data) {
        if (data.length > 1) {
            int mitad = data.length / 2;
            int[] izquierda = Arrays.copyOfRange(data, 0, mitad);
            int[] derecha = Arrays.copyOfRange(data, mitad, data.length);

            System.out.println(Arrays.toString(izquierda) + "  --- " + Arrays.toString(derecha));

            mergeSort(izquierda);
            mergeSort(derecha);

            // Merge
            int i = 0, d = 0, k = 0;
            int[] resultado = new int[data.length];

            while (i < izquierda.length && d < derecha.length) {
                if (izquierda[i] < derecha[d]) {
                    resultado[k++] = izquierda[i++];
                } else {
                    resultado[k++] = derecha[d++];
                }
            }

            // Acomodar los restantes
            while (i < izquierda.length) {
                resultado[k++] = izquierda[i++];
            }

            while (d < derecha.length) {
                resultado[k++] = derecha[d++];
            }

            // Copiar resultado de vuelta al array original
            System.arraycopy(resultado, 0, data, 0, data.length);
        }

        System.out.println("regreso de rec: " + Arrays.toString(data));
        return data;
    }

    public static void main(String[] args) {
        System.out.println(".-.-.-.-.-.- MERGE --.-.-.-.-");
        int[] info = {38, 27, 43, 3, 9, 82, 10, 19, 50, 61};
        System.out.println(Arrays.toString(mergeSort(info)));
    }
}
