package produtos;

import manipulacao.Manipulacao;
import javax.swing.JOptionPane;

/**
 * classe CaixaLapis que herda caracteristicas da classe Produto e seus metodos.
 * terá os atributos quantidade, colorido alem dos atributos da super classe;
 * a classe produto irá implementar a classe manipulação e seus metodos
 * A classe CaixaLapis terá seus atributos privados e metodos de acesso get e set
 */
public class CaixaLapis extends Produto implements Manipulacao {
    private int quantidade;// atributos da classe
    private boolean colorido;
    
    public CaixaLapis(int quantidade, boolean colorido, String marca, float valor) {//metodo construtor com parametros e inicialização de atributos
        super(marca, valor);
        this.quantidade = quantidade;
        this.colorido = colorido;
    }
    
    public CaixaLapis() {//metodo construtor com parametros e inicialização de atributos por meio de interface grafica
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a Marca da Caixa de Lapis: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da Caixa de Lapis: ")));
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de lapis na caixa: "));
        int v = JOptionPane.showConfirmDialog(null, "É lapis de cor?");
        this.colorido = v == 0;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean isColorido() {
        return colorido;
    }
    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }

    @Override
    public String consulta() {//metodo de consulta que retorna o valor de todos os atributos da classe em uma mensagem
        String msg = "Marca: " + this.getMarca() + "\nValor: " + this.getValor() +
                "\nQuantidade de Folhas: " + this.getQuantidade() + "\nColorido: " +
                this.isColorido() + "\n--------------------\n";
        return msg;
    }
    @Override
    public boolean cadastro() {
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a Marca da Caixa de Lapis: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da Caixa de Lapis: ")));
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de lapis na caixa: "));
        int v = JOptionPane.showConfirmDialog(null, "É lapis de cor?");
        this.colorido = v == 0;
        return true;
    }
}
