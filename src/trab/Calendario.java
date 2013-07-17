/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Gabriel_Net
 */
public class Calendario {
    private Etapa[] etapas;

    public Calendario(Etapa[] etapas) {
        this.etapas = etapas;
    }

    public Etapa[] getEtapas() {
        return etapas;
    }

    public void setEtapas(Etapa[] etapas) {
        this.etapas = etapas;
    }
}
