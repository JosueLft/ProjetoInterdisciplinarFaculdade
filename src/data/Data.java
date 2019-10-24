/*
 * classe que armazenara informações de data para um pedido ou cadastro de algo
 */
package data;

import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    //criando objetos de bibliotecas interans para a captura da data do computador
    Date data = new Date();
    GregorianCalendar cg = new GregorianCalendar();

    public int getDia() {
        dia = cg.get(GregorianCalendar.DAY_OF_MONTH);//capturando o dia do sistema atual e inserindo o valor na variavel dia
        return dia;
    }
    public int getMes() {
        mes = cg.get(GregorianCalendar.MONTH) + 1;//capturando o mes do sistema atual e inserindo o valor na variavel mes
        return mes;
    }
    public int getAno() {
        ano = cg.get(GregorianCalendar.YEAR);//capturando o ano do sistema atual e inserindo o valor na variavel ano
        return ano;
    }
    
    public String gerarData() {
        String dat = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
        return dat;
    }
}
