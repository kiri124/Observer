
public class observador implements observer{
    private String nombre;

    public observador(String nombre){
        this.nombre=nombre;
    }

    @Override 
    public void update(String mensaje){
        System.out.println(nombre+ " si existe stock disponible");
    }

   
}
