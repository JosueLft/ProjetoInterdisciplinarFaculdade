/**
 * Classe que conterá informações dos pedidos realizado pelos clientes
 */
package pedido;

import cliente.Cliente;
import data.Data;
import manipulacao.Manipulacao;
import java.util.ArrayList;
import produtos.Caderno;

public class Pedido implements Manipulacao {
    Data data = new Data();
    private Cliente cliente;
    private float totalPedido;
    private ArrayList cxLapis;
    private ArrayList papel;
    private ArrayList caderno;
    Caderno c;
    private String pedido;

    @Override
    public String consulta() {
        return "---------------------- Pedido ----------------------\n" +
                "Data do Pedido: " + data.gerarData();
    }

    @Override
    public boolean cadastro() {
        return true;
    }

    public float getTotalPedido() {
        return totalPedido;
    }
    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }
    public ArrayList getCxLapis() {
        return cxLapis;
    }
    public void setCxLapis(ArrayList cxLapis) {
        this.cxLapis = cxLapis;
    }
    public ArrayList getPapel() {
        return papel;
    }
    public void setPapel(ArrayList papel) {
        this.papel = papel;
    }
    public ArrayList getCaderno() {
        return caderno;
    }
    public void setCaderno(ArrayList caderno) {
        this.caderno = caderno;
    }
    public String getPedido() {
        return pedido;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}