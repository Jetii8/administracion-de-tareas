public class SistemaCitas {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Administrador> administradores;

    public SistemaCitas() {
        this.doctores =  new ArrayList<>();
        this.pacientes =  new ArrayList<>();
        this.citas =  new ArrayList<>();
        this.administradores =  new ArrayList<>();
    }

    public void agregarDoctor(
        String nombre,
        String correo,
        String especialiad) {
        // crear una obj de doctor y agregarlo a el arreglo
        doctores.add(new Doctor(
            nombre,
            correo,
            especialiad
        ));
    }

    public void agregarPaciente(
        String nombre,
        String correo,
        String motivo) {
        // crear una obj de paciente y agregarlo a el arreglo de pacientes
        paciente.add(new Doctor(
            nombre,
            correo,
            motivo
        ));
    }

    public void crearCita(
        int idDoctor,
        int idPaciente,
        LocalDateTime fechaYHora
        Cita cita;
    ) {
        //obtener paciente por id de el arreglo de pacientes 
        try{
            paciente.get(idPaciente);
        }catch(Exception e){
            System.out.println("Paciente no existe en el sistema");
        }
        // crear una cita con el id de el doctor, el el paciente y la
        // fecha y la hora de la cita
        try{
            cita = new Cita(
                null,
                idPaciente,
                fechaYHora
            );
        }catch(Exception e){
            System.out.println("Fallo en crear una cita. Intente mas tarde");
        }
        // agregar la cita a el arreglo de citas
        citas.add(cita);
        System.out.println("Cita creada exitosamente");

    }

    public void relacionarCita(
        int idCita,
        int idDoctor,
        LocalDateTime fechaYHora
    ) {
        // obtener el id de la cita que se quiere relacionar
        // remplazar el valor nulo de el doctor a un id de doctor
        // para associarlo con la cita
        Cita cita;
        try{
            cita = cita.get(idCita);
        }catch(Exception e){
            System.out.println("Doctor no existe en el sistema");
        // verificar que el id de el doctor exista en el arreglo
        // de doctores
        try{
            doctores.get(idDoctor)
        }catch(Exception e){
            System.out.println("Doctor no existe en el sistema");
        }
        // actulizar el doctor a el nuevo id de el doctor
        // que va a tomar el paciente
        cita.idDoctor = idDoctor;
        // actiaizar el valor de la cita a el nuevo
        citas.add(cita);
        System.out.println("cita exitosamente actualizada");


    
}