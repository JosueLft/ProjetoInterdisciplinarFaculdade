/**
 * Classe que contera interação com todas as outras classe 
 * terá um menu de navegação
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import pedido.Pedido;
import produtos.Caderno;
import produtos.CaixaLapis;
import produtos.Papel;


public class Principal {
    private int escolha;
    Caderno c;
    Papel p;
    CaixaLapis cl;
    Pedido p1;
    
    public Principal() {//metodo contrutor utilizado apenas para inicializar a variavel escolha
        escolha = 0;
    }
    
    public void menu() {//menu que será exibido as principais funcionalidades
        String ret = JOptionPane.showInputDialog(null, "------------------ Menu ------------------\n" + 
                "Cadastro(1)\n" +
                "Consulta(2)\n" +
                "Listar Todos(3)\n" + 
                "Sair(4)\n" + 
                "------------------------------------------\n");
        if(ret != null){
            escolha = Integer.parseInt(ret);
        } else {
            escolha = 4;
        }
        switch (escolha) {
            case 1:
                this.cadastrar();
                break;
            case 2:
                this.consultar();
                break;
            case 3:
                this.listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Até Logo!");
                break;
        }
    }
    
    public void cadastrar(){//metodo de criacação do menu de cadastro onde será cadastrado os produtos e pedidos
        String ret = JOptionPane.showInputDialog(null, "------------------ Cadastro ------------------\n" + 
                "Caderno(1)\n" +
                "Papel(2)\n" +
                "Caixa de Lapis(3)\n" + 
                "Pedido(4)\n" +
                "Sair(5)\n" + 
                "----------------------------------------------");
        escolha = 0;
        if(ret != null){
            escolha = Integer.parseInt(ret);
        }
        switch (escolha) {
            case 1:
                c = new Caderno();
                this.cadastrar();
                break;
            case 2:
                p = new Papel();
                this.cadastrar();
                break;
            case 3:
                cl = new CaixaLapis();
                this.cadastrar();
                break;
            case 4: 
                p1 = new Pedido();
                p1.cadastro();
                this.cadastrar();
                break;
            default:
                this.menu();
                break;
        }
    }
    public void consultar() {//metodo de consulta onde será consultado produtos ou pedidos separados
        String ret = JOptionPane.showInputDialog(null, "------------------ Consultar ------------------\n" + 
                "Caderno(1)\n" +
                "Papel(2)\n" +
                "Caixa de Lapis(3)\n" + 
                "Pedido(4)\n" +
                "Sair(5)\n" + 
                "-----------------------------------------------");
        if(ret != null){
            escolha = Integer.parseInt(ret);
        }
        switch (escolha) {
            case 1:
                JOptionPane.showMessageDialog(null, c.consulta());
                this.consultar();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, p.consulta());
                this.consultar();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, cl.consulta());
                this.consultar();
                break;
            case 4: 
                JTextArea txtArea = new JTextArea(20, 20);
                txtArea.setText(p.consulta());
                JScrollPane scroll = new JScrollPane(txtArea);
                scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                JOptionPane.showMessageDialog(null, scroll);
                this.consultar();
                break;
            default:
                this.menu();
                break;
        }
        escolha = 0;
    }
    public void listar() {// metodo utilizado para listar todo o conteudo cadastrado
        JTextArea txtArea = new JTextArea(20, 20);
        txtArea.setText("------------------ Lista ------------------\n" + 
                "------ Caderno ------\n"
                        + c.consulta() +
                "------ Papel ------\n"
                        + p.consulta() +
                "------ Caixa de Lapis ------\n"
                        + cl.consulta() + 
                "------ Pedido ------\n"
                        + p1.consulta() + "\n" +
                "-----------------------------------------------");
        JScrollPane scroll = new JScrollPane(txtArea);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JOptionPane.showConfirmDialog(null, scroll);
        this.menu();
        escolha = 0;
    }
    
    public static void main(String[] args) {
        Principal p = new Principal();
        p.menu();
    }
}
