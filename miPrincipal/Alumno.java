package miPrincipal;
public class Alumno {
    String nombre;
    int numControl;
    double promedio;
    String carrera;

    public Alumno(String nombre, int numControl, double promedio, String carrera){
        this.nombre = nombre;
        this.numControl = numControl;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public double obtenerPromedio(double promedio){
            return promedio;
    }

    public void cargarMateria(){
        System.out.println("Estoy cargando materia");
    }
}
