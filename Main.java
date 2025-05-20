public class Main {
    public static void main(String[] args) {

        // Postulante 1: usa el constructor completo (califica)
        Postulante p1 = new Postulante("María", "López", 21, "0999999999", "maria@gmail.com",
                "ecuatoriana", "baja", "Ingeniería en Sistemas", 90.0);
        p1.mostrarDatos();

        // Postulante 2: usa el constructor completo (no califica)
        Postulante p2 = new Postulante("Luis", "Ramírez", 17, "0888888888", "luis@gmail.com",
                "ecuatoriana", "media", "Arquitectura", 83.5);
        p2.mostrarDatos();

        // Postulante 3: usa constructor de nombre, apellido y carrera
        Postulante p3 = new Postulante("Jorge", "Pérez", "Medicina");
        p3.setEdad(19);
        p3.setPromedio(87.5);
        p3.setCondicionSocioeconomica("alta");
        p3.setNacionalidad("ecuatoriana");
        p3.setCorreo("jorge@gmail.com");
        p3.setTelefono("0777777777");

        p3.mostrarDatos(); // este no califica por condición económica
    }
}
