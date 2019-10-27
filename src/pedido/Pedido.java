/**
 * Classe que conterá informações dos pedidos realizado pelos clientes
 */
package pedido;

import cliente.Cliente;
import data.Data;
import manipulacao.Manipulacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import produtos.Caderno;
import produtos.CaixaLapis;
import produtos.Papel;

public class Pedido implements Manipulacao {
    Data data = new Data();
    private Cliente cliente;
    private float totalPedido;
    private ArrayList<CaixaLapis> cxLapis = new ArrayList<>();
    private ArrayList<Papel> papel = new ArrayList<>();
    private ArrayList<Caderno> caderno = new ArrayList<>();
    private String pedido;
    
    public Pedido() {
        cliente = new Cliente(JOptionPane.showInputDialog(null, "Informe o seu Nome: "),
                JOptionPane.showInputDialog(null, "Informe o seu CPF: "),
                JOptionPane.showInputDialog(null, "Informe o seu Telefone: "));
    }

    @Override
    public String consulta() {
        this.calculaTotalPedido();
        String msg = "Nome: " + cliente.getNome() +
                " CPF: " + cliente.getCpf() +
                " Telefone: " + cliente.getTelefone() + "\n" +
                this.pedido() + 
                "\nTotal Pedido: " + getTotalPedido() + "\n" + 
                "\nData do Pedido: " + data.gerarData();
        return msg;
    }
    
    public String pedido() {
        String msg = null;
        int cont = 1;
        System.out.println("Caderno: " + caderno.size());
        for(int i = 0; i < caderno.size(); i++){
            msg += "\nItem: " + (i + 1) + "\n" + caderno.get(i).consulta();
            cont++;
        }
        for(int i = 0; i < papel.size(); i++){
            msg += "\nItem: " + cont + "\n" + papel.get(i).consulta();
            cont++;
        }
        for(int i = 0; i < cxLapis.size(); i++){
            msg += "\nItem: " + cont + "\n" + cxLapis.get(i).consulta();
            cont++;
        }
        return msg;
    }

    @Override
    public boolean cadastro() {
        int resp = 0;
        if(resp == 0){
            while(resp == 0){
                caderno.add(new Caderno());
                resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Caderno?");
            }
        }
        resp = 0;
        if(resp == 0){
            while(resp == 0){
                papel.add(new Papel());
                resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Papel?");
            }
        }
        resp = 0;
        if(resp == 0){
            while(resp == 0){
                cxLapis.add(new CaixaLapis());
                resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra Caixa de Lapis?");
            }
        }
        return true;
    }
    
    public void calculaTotalPedido() {
        for(int i = 0; i < caderno.size(); i++){
            this.setTotalPedido(caderno.get(i).getValor());
        }
        for(int i = 0; i < papel.size(); i++){
            this.setTotalPedido(this.getTotalPedido() + papel.get(i).getValor());
        }
        for(int i = 0; i < cxLapis.size(); i++){
            this.setTotalPedido(this.getTotalPedido() + cxLapis.get(i).getValor());
        }
    }

    //metodos de acesso
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public float getTotalPedido() {
        return totalPedido;
    }
    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }
    public ArrayList<CaixaLapis> getCxLapis() {
        return cxLapis;
    }
    public void setCxLapis(ArrayList<CaixaLapis> cxLapis) {
        this.cxLapis = cxLapis;
    }
    public ArrayList<Papel> getPapel() {
        return papel;
    }
    public void setPapel(ArrayList<Papel> papel) {
        this.papel = papel;
    }
    public ArrayList<Caderno> getCaderno() {
        return caderno;
    }
    public void setCaderno(ArrayList<Caderno> caderno) {
        this.caderno = caderno;
    }
    public String getPedido() {
        return pedido;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }    
}