import java.time.LocalDateTime;

public class Cita {

    private Integer idDoctor;
    private int idPaciente;
    private LocalDateTime fechaYHora;

    public Cita(
        Integer idDoctor,
        int idPaciente,
        LocalDateTime fechaYHora
        ){
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
        this.fechaYHora = fechaYHora;
    }

    // Getter for idDoctor
    public Integer getIdDoctor() {
        return idDoctor;
    }

    // Setter for idDoctor
    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    // Getter for idPaciente
    public int getIdPaciente() {
        return idPaciente;
    }

    // Setter for idPaciente
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    // Getter for fechaYHora
    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    // Setter for fechaYHora
    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

        public String toString() {
        return "Cita{" +
                "idDoctor=" + idDoctor +
                ", idPaciente=" + idPaciente +
                ", fechaYHora=" + fechaYHora +
                '}';
    }
}