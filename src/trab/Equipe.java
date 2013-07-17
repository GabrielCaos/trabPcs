/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Gabriel_Net
 */
public class Equipe {
    private String nome;
    private Piloto piloto;
    private Carro carro;

    public Equipe(String nome, Piloto piloto, Carro carro) {
        this.nome = nome;
        this.piloto = piloto;
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Carro getCarro() {
        return carro;
    }
    
    public String getNomePiloto(){
        return piloto.getNome();
    }
    
    public int getNumCarro(){
        return carro.getNumero();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
}
