/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.io.IOException;

/**
 *
 * @author Gabriel_Net
 */
public class Trab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Data data1 = new Data(10, 2, 2013);
        Data data2 = new Data(11, 2, 2013);
        
        Corrida corrida1 = new Corrida(1, 58, 58);
        Corrida corrida2 = new Corrida(2, 58, 58);
        
        Etapa etapa1 = new Etapa(data1, corrida1, "GP Australia");
        Etapa etapa2 = new Etapa(data2, corrida2, "GP Malasia");
        Etapa[] etapas = {etapa1, etapa2};
         
        Calendario calendario = new Calendario(etapas);
        
        for(Etapa etapa : calendario.getEtapas()){
             //System.out.println(etapa.getNome());
             //System.out.println(etapa.getData());
             //System.out.println(etapa.getNumCorrida());
        }
        
        Piloto piloto1 = new Piloto("Felipe Massa");
        Piloto piloto2 = new Piloto("Sebastian Vettel");
        
        Carro carro1 = new Carro(1);
        Carro carro2 = new Carro(2);
        
        Equipe equipe1 = new Equipe("Ferrari", piloto1, carro1);
        Equipe equipe2 = new Equipe("Red Bull", piloto2, carro2);
        Equipe[] equipes = {equipe1, equipe2};
        
        for(Equipe equipe : equipes){
            //System.out.println(equipe.getNome());
            //System.out.println(equipe.getNomePiloto());
            //System.out.println(equipe.getNumCarro());
        }
        
        leitorDeArquivos leitor1 = new leitorDeArquivos();
        String[][] dados1 = null;
        dados1 = leitor1.lerDados(";", "C:\\Users\\Gabriel_Net\\Desktop\\calendario.txt");
        Data[] data3;
        for(String[] dado1 : dados1){
            //dado1[0];
            int dia = Integer.parseInt(dado1[0]);
            data3[0] = new Data()
            for(String dado : dado1) {
                System.out.println(dado);
            }
        }
    } 
}
