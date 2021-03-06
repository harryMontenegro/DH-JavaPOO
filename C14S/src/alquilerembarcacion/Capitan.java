package alquilerembarcacion;

public class Capitan {
    private String nombre;
    private String apellido;
    private String numeroMatricula;

    public Capitan() {
    }

    public Capitan(String nombre, String apellido, String numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
    }

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

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
