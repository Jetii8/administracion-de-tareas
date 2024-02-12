public class Main {
    public static void main(String[] args) {
        // crear un nuevo sistema de citas
        SistemaCitas systema = new SistemaCitas;
        // agregar un doctor
        systema.agregarDoctor(
            "Juan Martinez",
            "juan@correo.com",
            "Cirujano"
        )

        // agregar un paciente
        systema.agregarPaciente(
            "Jessica Lopez",
            "jessica@correo.com",
            "Le duele el corazon"
        )

        // crear un cita
        systema.crearCita(
            0, // id de paciente
            LocalDateTime.of(2024, 2, 12, 17, 0) // fecha y hora
        )

        // relacionar una cita
        systema.relacionarCita(
            0, // id de cita
            0, // id de doctor
        )

    }
}
