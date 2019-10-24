package produtos;

/**
 * Super classe abstrata utilizada para gerenciar subclasses da mesma;
 */

public abstract class Produto {
    
    private String marca = null;// atributos
    private float valor = 0.0f;
    
    public Produto() {} // metodo construtor sem parametros
    
    public Produto(String marca, float valor) {// metodo construtor com parametros
        this.marca = marca;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }  
}
