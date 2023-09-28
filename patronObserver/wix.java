public class wix {
    public static void main(String[] args) {
        subject producto = new producto();
//lista de observadores
        observador cliente1 =new observador("cliente 1");
        observador cliente2 = new observador("cliente 2");

        
//registrar
producto.AddObserver(cliente1);
producto.AddObserver(cliente2);
producto.setDisponible(true);


    }
}
