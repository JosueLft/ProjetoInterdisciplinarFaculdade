/**
 * Classe utilizada para testes da classe caderno
 */
package teste.produtos;

import produtos.Caderno;

public class TesteCaderno {
    
    public static void main(String[] args) {
        Caderno c = new Caderno();
        System.out.println(c.consulta());
        c.cadastro();
        System.out.println(c.consulta());
    }
}
