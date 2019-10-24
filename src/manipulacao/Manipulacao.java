package manipulacao;

public interface Manipulacao {
    
    public String consulta();
    
    /**
     * Metodo utilizado para capturar todos os dados de um determinado Produto(Classe)
     * e utilizar para formular um pedido ou verificar se ja foi cadastrado, onde será
     * retornado todos os dados relevantes de uma determinada classe.
     */
    public boolean cadastro();
}
