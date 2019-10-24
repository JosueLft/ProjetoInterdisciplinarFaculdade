package produtos;
/**
 * classe Papel que herda caracteristicas da classe Produto e seus metodos.
 * terá os atributos cor, tipo, largura, altura, gramatura e paltado alem dos 
 * atributos da super classe;
 * a classe produto irá implementar a classe manipulação e seus metodos
 * A classe Papel terá seus atributos privados e metodos de acesso get e set
 */
import manipulacao.Manipulacao;
import javax.swing.JOptionPane;

public class Papel extends Produto implements Manipulacao{
    private String cor;//atributos da classe
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean paltado;

    public Papel(String cor, String tipo, float largura, float altura, int gramatura, boolean paltado, String marca, float valor) {//metodo construtor com parametros e inicialização dos atributos
        super(marca, valor);
        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.paltado = paltado;
    }
    
    public Papel() {//metodo construtor sem parametros e inicialização por meio de interface grafica
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do papel: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do papel: ")));
        this.cor = JOptionPane.showInputDialog(null, "Informe a cor do papel: ");
        this.tipo = JOptionPane.showInputDialog(null, "Informe o tipo do papel: ");
        this.largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a largura do papel: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura do papel: "));
        this.gramatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a gramatura do papel: "));
        int v = JOptionPane.showConfirmDialog(null, "O papel é paltado?");
        this.paltado = v == 0;
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getGramatura() {
        return gramatura;
    }
    public void setGramatura(int gramatura) {
        this.gramatura = gramatura;
    }
    public boolean isPaltado() {
        return paltado;
    }
    public void setPaltado(boolean paltado) {
        this.paltado = paltado;
    }
    
    @Override// metodo sobreescrito da interface manipulação
    public String consulta() {
        String msg = "\n--------------------\n" + "Marca: " + this.getMarca() + "\nValor: " + this.getValor() +
                "\nCor: " + this.getCor() + "\nTipo: " +
                this.getTipo() + "\nLargura: " + this.getLargura() + "\nAltura: " +
                this.getAltura() + "\nGramatura: " + this.getGramatura() + "\nPaltado: " + this.isPaltado() 
                + "\n--------------------\n";
        return msg;
    }

    @Override
    public boolean cadastro() {
        super.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do papel: "));
        super.setValor(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do papel: ")));
        this.cor = JOptionPane.showInputDialog(null, "Informe a cor do papel: ");
        this.tipo = JOptionPane.showInputDialog(null, "Informe o tipo do papel: ");
        this.largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a largura do papel: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a altura do papel: "));
        this.gramatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a gramatura do papel: "));
        int v = JOptionPane.showConfirmDialog(null, "O papel é paltado?");
        this.paltado = v == 0;
        return true;
    }
}
