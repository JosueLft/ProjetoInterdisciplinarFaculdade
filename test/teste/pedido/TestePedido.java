package teste.pedido;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import pedido.Pedido;

public class TestePedido {
    
    
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.cadastro();
        JTextArea txtArea = new JTextArea(20, 20);
        txtArea.setText(p.consulta());
        JScrollPane scroll = new JScrollPane(txtArea);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JOptionPane.showMessageDialog(null, scroll);
    }
}