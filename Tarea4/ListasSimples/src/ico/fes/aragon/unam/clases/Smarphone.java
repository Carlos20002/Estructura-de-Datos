package ico.fes.aragon.unam.clases;

public class Smarphone {
    //atributos
    private String marca;
    private String modelo;
    private int almacenamiento;
    private int ram;

    //constructores
    public Smarphone(){}

    public Smarphone(String marca, String modelo, int almacenamiento, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }

    //metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Smarphone{" +
                "marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", almacenamiento =" + almacenamiento +"gb"+
                ", ram=" + ram +"gb" +
                '}';
    }
}
