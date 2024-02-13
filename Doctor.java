public class Doctor extends Usuario  {

    private String especialiad;

    public Doctor(
        String nombre,
        String correo,
        String especialiad
    ){
        super(nombre, correo);
        this.especialiad = especialiad;
    }

    // Getter for especialiad
    public String getEspecialiad() {
        return especialiad;
    }

    // Setter for especialiad
    public void setEspecialiad(String especialiad) {
        this.especialiad = especialiad;
    }

    public String toString() {
        return "Doctor{" +
                "nombre='" + getNombre() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", especialidad='" + this.especialiad + '\'' +
                '}';
    }
}