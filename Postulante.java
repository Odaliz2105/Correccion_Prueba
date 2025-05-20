public class Postulante {
    // Atributos privados
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String nacionalidad;
    private String condicionSocioeconomica;
    private String carrera;
    private double promedio;

    // Constructor 1: solo nombre y apellido
    public Postulante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor 2: nombre, apellido y carrera
    public Postulante(String nombre, String apellido, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.promedio = 78.0; // valor quemado
        this.edad = 18;       // valor predeterminado
    }

    // Constructor 3: todos los datos personales
    public Postulante(String nombre, String apellido, int edad, String telefono, String correo,
                      String nacionalidad, String condicionSocioeconomica, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.condicionSocioeconomica = condicionSocioeconomica;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters y Setters (solo los importantes para el ejercicio)
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setCondicionSocioeconomica(String condicionSocioeconomica) {
        this.condicionSocioeconomica = condicionSocioeconomica;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean cumpleRequisitos() {
        if (condicionSocioeconomica != null &&
                condicionSocioeconomica.equalsIgnoreCase("baja") &&
                edad > 18 &&
                promedio >= 85) {

            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar los datos solo si califica
    public void mostrarDatos() {
        if (cumpleRequisitos()) {
            System.out.println("----- Postulante Apto -----");
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
            System.out.println("Promedio: " + promedio);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Condición socioeconómica: " + condicionSocioeconomica);
            System.out.println();
        } else {
            System.out.println("----- Postulante No Apto -----");
            System.out.println("El postulante no cumple los requisitos para aplicar a la beca.\n");
        }
    }
}
