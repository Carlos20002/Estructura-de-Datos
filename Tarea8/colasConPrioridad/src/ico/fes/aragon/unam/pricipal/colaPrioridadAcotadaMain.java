package ico.fes.aragon.unam.pricipal;
import ico.fes.aragon.unam.clases.ClienteBanco;
import ico.fes.aragon.unam.colas.ColaConPrioridadAcotada;
public class colaPrioridadAcotadaMain {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> clientes = new ColaConPrioridadAcotada<>(5);
       clientes.encolar(4,new ClienteBanco("Carlos",4));
        clientes.encolar(4,new ClienteBanco("Marcela",4));
        clientes.encolar(5,new ClienteBanco("Julieta",5));
        clientes.encolar(5,new ClienteBanco("Roberto",5));
        clientes.encolar(5,new ClienteBanco("Luis",5));
        clientes.encolar(1,new ClienteBanco("Cristian",5));
        System.out.println(clientes);
        System.out.println(clientes.desencolar().retirarDinero(10000));
        System.out.println(clientes);
        System.out.println("Nuevos clientes en la cola...\n");
        clientes.encolar(3,new ClienteBanco("Alberto",3));
        clientes.encolar(2,new ClienteBanco("Omar",2));
        System.out.println(clientes);
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println("Atendiendo al siguiente cliente: "+clientes.desencolar());
        System.out.println(clientes);



    }
}
