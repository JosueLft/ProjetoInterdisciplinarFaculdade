package produtos;

import manipulacao.Manipulacao;
import javax.swing.JOptionPane;

/**
 * classe Caderno que herda caracteristicas da classe Produto e seus metodos.
 * terá os atributos qtdDeFolhas, tamanho, tipo e capadura alem dos atributos da 
 * super classe;
 * a classe produto irá implementar a classe manipulação e seus metodos
 * A classe caderno terá seus atributos privados e metodos de acesso get e set
 */
public class Caderno extends Produto implements Manipulacao {
    private int qtdDeFolhas = 0;//atributos da classe
    private String tamanho = null;
    private String tipo = null;
    private boolean capadura = true;
    private String msg = null;

    public Caderno(int qtdDeFolhas, String tamanho, String tipo, boolean capadura, String marca, float valor) {//metodo construtor com parametros e inicialização dos mesmo
        super(marca, valor);
        this.qtdDeFolhas = qtdDeFolhas;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.capadura = capadura;
    }
    
    public Caderno() {//metodo construtor sem parametros e inicialização dos mesmos por interface grafica
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a Marca do Caderno: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do Caderno: ")));
        this.qtdDeFolhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de folhas: "));
        this.tamanho = JOptionPane.showInputDialog(null, "Informe o tamanho: ");
        this.tipo = JOptionPane.showInputDialog(null, "Informe o tipo: ");
        int v = JOptionPane.showConfirmDialog(null, "O Caderno é de capadura?");
        this.capadura = v == 0;
    }
    
    //metodos de acesso get e set de cada atributo
    public int getQtdDeFolhas() {
        return qtdDeFolhas;
    }
    public void setQtdDeFolhas(int qtdDeFolhas) {
        this.qtdDeFolhas = qtdDeFolhas;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isCapadura() {
        return this.capadura;
    }
    public void setCapadura(boolean capadura) {
        this.capadura = capadura;
    }
    
    //metodos sobreescritos da classe manipulação que esta sendo implementada
    @Override
    public String consulta() {//metodo de consulta que retorna o valor de todos os atributos da classe em uma mensagem
        msg = "\n--------------------\n" + "Marca: " + this.getMarca() + "\nValor: " + this.getValor() +
            "\nQuantidade de Folhas: " + this.getQtdDeFolhas() + "\nTamanho: " +
            this.getTamanho() + "\nTipo: " + this.getTipo() + "\nCapadura: " +
            this.isCapadura() + "\n--------------------\n";
        return msg;
    }
    //metodo de cadastrado
    @Override
    public boolean cadastro() {
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a Marca do Caderno: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do Caderno: ")));
        this.qtdDeFolhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de folhas: "));
        this.tamanho = JOptionPane.showInputDialog(null, "Informe o tamanho: ");
        this.tipo = JOptionPane.showInputDialog(null, "Informe o tipo: ");
        int v = JOptionPane.showConfirmDialog(null, "O Caderno é de capadura?");
        return true;
    }
}
