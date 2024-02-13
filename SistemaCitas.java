import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaCitas {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;

    public SistemaCitas() {
        this.doctores =  new ArrayList<>();
        this.pacientes =  new ArrayList<>();
        this.citas =  new ArrayList<>();
    }

    public void agregarDoctor(
        String nombre,
        String correo,
        String especialiad) {
        System.out.println("AGREGAR DOCTOR:");
        // crear una obj de doctor y agregarlo a el arreglo
        doctores.add(new Doctor(
            nombre,
            correo,
            especialiad
        ));

        System.out.println("Doctor agregado a el sistema:");

        for (Doctor doctor : doctores) {
            System.out.println(doctor.toString());
        }
    }

    public void agregarPaciente(
        String nombre,
        String correo,
        String motivo) {
        System.out.println("AGREGAR PACIENTE:");
        // crear una obj de paciente y agregarlo a el arreglo de pacientes
        pacientes.add(new Paciente(
            nombre,
            correo,
            motivo
        ));

        System.out.println("Paciente agregado a el sistema:");

        for (Paciente paciente : pacientes) {
            System.out.println(paciente.toString());
        }

    }

    public void crearCita(
        int idPaciente,
        LocalDateTime fechaYHora
    ) {
        System.out.println("CREAR CITA:");
        //obtener paciente por id de el arreglo de pacientes 
        try{
            pacientes.get(idPaciente);
        }catch(Exception e){
            System.out.println("Paciente no existe en el sistema");
        }
        // crear una cita con el id de el doctor, el el paciente y la
        // fecha y la hora de la cita
        try{
            Cita cita = new Cita(
                null,
                idPaciente,
                fechaYHora
            );
            // agregar la cita a el arreglo de citas
            citas.add(cita);
        }catch(Exception e){
            System.out.println("Fallo en crear una cita. Intente mas tarde");
        }
        System.out.println("Cita agregada a el sistema:");
        int i = 0;
        for (Cita cita : citas) {
            System.out.println("idCita='" + i + '\'' + cita.toString());
            i++;
        }
    }

    public boolean actualizarCita(
        int idCita,
        Integer idDoctor
    ) {

        System.out.println("ACTUALIZAR CITA:");

        int idPaciente;
        LocalDateTime fechaYhora;

        // verificar que el id de el doctor exista en el arreglo
        // de doctores
        try{
            doctores.get(idDoctor);
        }catch(Exception g){
            System.out.println("Doctor no existe en el sistema");
        }
        // obtener el id de la cita que se quiere relacionar
        // remplazar el valor nulo de el doctor a un id de doctor
        // para associarlo con la cita
        try{
            Cita cita = citas.get(idCita);
            idPaciente = cita.getIdPaciente();
            fechaYhora = cita.getFechaYHora();
            // actulizar el doctor a el nuevo id de el doctor
            // que va a tomar el paciente
            Cita citaTemporal = new Cita(
                idDoctor,
                idPaciente,
                fechaYhora
            );
            // actiaizar el valor de la cita a el nuevo
            citas.set(0, citaTemporal);
        }catch(Exception e){
            System.out.println("Cita no existe en el sistema");
            return false;
        }
        System.out.println("cita exitosamente actualizada:");
        int i = 0;
        for (Cita cita : citas) {
            System.out.println("idCita='" + i + '\'' + cita.toString());
            i++;
        }
        return true;
    }

    public void obtenerCita(int idCita){

        System.out.println("DETALLES DE CITA:");

        try{
            Cita cita = citas.get(idCita);
            Integer idDoctor = cita.getIdDoctor();
            if(idDoctor != null){
                Doctor doctor = doctores.get(
                    cita.getIdDoctor()
                );
                System.out.println(doctor.toString());
            }
            int idPaciente = cita.getIdPaciente();
            Paciente paciente = pacientes.get(idPaciente);
            System.out.println(paciente.toString());

        }catch(Exception e){
            System.out.println("Cita no existe en el sistema");
        }
    }
}