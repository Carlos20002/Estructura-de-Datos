package ico.fes.aragon.unam.pricipal;
import ico.fes.aragon.unam.clases.Pasiente;
import ico.fes.aragon.unam.colas.ColasADT;

public class colasMain {
    public static void main(String[] args) {
        ColasADT<Pasiente> pasientes = new ColasADT<>();
        pasientes.encolar(new Pasiente("Gerardo","Marinez",15, "Masculino"));
        pasientes.encolar(new Pasiente("Fatima","Hernandez",28, "Femenino"));
        pasientes.encolar(new Pasiente("Abigail","Graciano",45, "Femenino"));
        System.out.println(pasientes);
        System.out.println("\n");
        System.out.println("El pasiente que sigue es: "+pasientes.frente());
        System.out.println("Atendiendo al pasiente: "+pasientes.desecolar());
        System.out.println("\n");
        System.out.println("Mostrando lista de pasientes: \n"+pasientes);
        pasientes.encolar(new Pasiente("Luis","Lopez",55, "Masculino"));
        pasientes.encolar(new Pasiente("Sofia","Rodriguez",18, "Femenino"));
        System.out.println("Atendiendo al siguiente pasiente: "+ pasientes.desecolar());
        System.out.println("\n");
        System.out.println("Mostrando lista de pasientes:\n");
        System.out.println(pasientes);

    }
}
