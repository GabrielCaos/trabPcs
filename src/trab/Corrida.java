/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Gabriel_Net
 */
public class Corrida {
    private int numCorrida;
    private int numVoltasPrevistas;
    private int numVoltasRealizadas;

    public Corrida(int numCorrida, int numVoltasPrevistas, int numVoltasRealizadas) {
        this.numCorrida = numCorrida;
        this.numVoltasPrevistas = numVoltasPrevistas;
        this.numVoltasRealizadas = numVoltasRealizadas;
    }

    public int getNumCorrida() {
        return numCorrida;
    }

    public int getNumVoltasPrevistas() {
        return numVoltasPrevistas;
    }

    public int getNumVoltasRealizadas() {
        return numVoltasRealizadas;
    }

    public void setNumCorrida(int numCorrida) {
        this.numCorrida = numCorrida;
    }

    public void setNumVoltasPrevistas(int numVoltasPrevistas) {
        this.numVoltasPrevistas = numVoltasPrevistas;
    }

    public void setNumVoltasRealizadas(int numVoltasRealizadas) {
        this.numVoltasRealizadas = numVoltasRealizadas;
    }
}
