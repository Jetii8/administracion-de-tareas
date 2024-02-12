public class Paciente {

    private String motivo;

    public Paciente(
        String nombre,
        String correo,
        String motivo
    ){
        super(nombre, correo)
        this.motivo = motivo
    }
}