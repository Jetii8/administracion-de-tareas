public class Paciente extends Usuario {

    private String motivo;

    public Paciente(
        String nombre,
        String correo,
        String motivo
    ){
        super(nombre, correo);
        this.motivo = motivo;
    }

    // Getter for motivo
    public String getMotivo() {
        return motivo;
    }

    // Setter for motivo
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String toString() {
        return "Paciente{" +
                "nombre='" + getNombre() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", motivo='" + motivo + '\'' +
                '}';
    }
}