public abstract class Usuario {

    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getter for nombre
    public String getNombre() {
        return nombre;
    }

    // Setter for nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter for correo
    public String getCorreo() {
        return correo;
    }

    // Setter for correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}