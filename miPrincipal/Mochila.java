package miPrincipal;
public class Mochila {
    String color;
    String tamaño;
    int bolsas;
    public Mochila(String color, String tamaño, int bolsas){
        this.color = color;
        this.tamaño = tamaño;
        this.bolsas = bolsas; 
    }
    public void abrir(){
        System.out.println("Mochila abierta");
    }
    public void cerrar(){
        System.out.println("Mochila cerrada");
    }
    public boolean metercosas(){
        return true;
    }
    public void lanzar(){
        System.out.println("Estoy lanzando la mochila");
    }
}
