package ico.fes.aragon.unam.principal;

public class MainNumeroElevado {
    public static void main(String[] args) {
        System.out.println("Calculando el valor de un numero elevado a una potencia:");
        int base = 2;
        int exponente = 5;
        System.out.println(potenciaRecursiva(base,exponente));

    }
    public static int potenciaRecursiva(int base, int exponente){
        if (exponente == 0){
            return 1;
        }
        int resultado = base*potenciaRecursiva(base, exponente - 1);
        //System.out.println(resultado);
        return resultado;
    }
}
