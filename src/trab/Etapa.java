/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Gabriel_Net
 */
public class Etapa {
    private Data data;
    private Corrida corrida;
    private String nome;

    public Etapa(Data data, Corrida corrida, String nome) {
        this.data = data;
        this.corrida = corrida;
        this.nome = nome;
    }

    public String getData() {
        return data.getData();
    }

    public int getNumCorrida() {
        return corrida.getNumCorrida();
    }

    public String getNome() {
        return nome;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
