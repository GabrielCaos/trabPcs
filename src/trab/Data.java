/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Gabriel_Net
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String data;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData(){
        return (dia + "/" + mes + "/" + ano);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
