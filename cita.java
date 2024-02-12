import java.time.LocalDateTime;

public abstract class Cita {

    private int idDoctor;
    private int idPaciente;
    private LocalDateTime fechaYHora;

    public Cita(
        String idDoctor,
        String idPaciente,
        String fechaYHora
        ){
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
        this.fechaYHora = fechaYHora;

    }
}
