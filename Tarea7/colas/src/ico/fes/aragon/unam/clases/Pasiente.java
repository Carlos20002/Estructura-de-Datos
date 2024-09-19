package ico.fes.aragon.unam.clases;
public class Pasiente {
    // atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    // constructores
    public Pasiente(){}

    public Pasiente(String nombre, String apellido, int edad, String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero= genero;
    }
    // metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\nPasiente{" +
                "nombre: '" + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", edad: " + edad +" años"+
                ", genero: '" + genero + '\'' +"\n"+
                '}';
    }
}
