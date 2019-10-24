
import javax.swing.JOptionPane;
import pedido.Pedido;

/**
 * Classe de teste para os pedidos
 * 
 */
public class TestePedido {
    
    public static void main(String[] args) {
        Pedido p = new Pedido();
        JOptionPane.showMessageDialog(null, p.consulta());
    }
}
