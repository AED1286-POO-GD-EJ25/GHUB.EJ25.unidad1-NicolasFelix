package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo !";
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Helena", 24171083,96, "TICS");
        Alumno alumno2 = new Alumno("Nicolas", 24171081, 92, "Sistemas");

        alumno1.cargarMateria();
        alumno2.cargarMateria();

        System.out.println("el promedio es de" + alumno1.obtenerPromedio(92));

        Mochila mochila1 = new Mochila("Negra" , "70*20cm", 8);
    }
}