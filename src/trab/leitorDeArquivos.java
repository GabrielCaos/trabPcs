/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabriel_Net
 */
public class leitorDeArquivos {
   // private String[] nomeEtapas;
    //private int[] numCorridas;
    //private String[] datas;
    //final static String FILE_NAME = "C:\\Users\\Gabriel_Net\\Desktop\\calendario.txt";
    final static String OUTPUT_FILE_NAME = "C:\\Users\\Gabriel_Net\\Desktop\\calendario2.txt";
    final static Charset ENCODING = StandardCharsets.UTF_8;
    
    public String[][] lerDados(String pattern, String fileName) throws IOException{
        
        leitorDeArquivos text = new leitorDeArquivos();
        List<String> lines = text.readSmallTextFile(fileName);
        String my_pattern = pattern;
        //System.out.println("------------------------------");
        String[] dados = null;
        //for(String line : lines){
            //String[] dados = line.split(my_pattern);
            //for(String dado : dados){
               // System.out.println(dado);
       //     }
        //}
        int i = 0;
        int i2 = 0;
        String[][] data = new String[lines.size()][4];
        for(String line : lines){
            dados = line.split(my_pattern);
            i2 = 0;
            for(String dado : dados){
                data[i][i2] = dado.trim();
                i2++;
            }
            //System.out.println(dados);
            i++;
        }
        return data;
    }
    
    //public int separaInteiros(String separador, String ){
        
    //}
    
  //For smaller files
  List<String> readSmallTextFile(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    return Files.readAllLines(path, ENCODING);
  }
  
  void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    Files.write(path, aLines, ENCODING);
  }

  //For larger files
  
  void readLargerTextFile(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    try (Scanner scanner =  new Scanner(path, ENCODING.name())){
      while (scanner.hasNextLine()){
        //process each line in some way
        log(scanner.nextLine());
      }      
    }
  }
  
  void readLargerTextFileAlternate(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
      String line = null;
      while ((line = reader.readLine()) != null) {
        //process each line in some way
        log(line);
      }      
    }
  }
  
  void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
    Path path = Paths.get(aFileName);
    try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
      for(String line : aLines){
        writer.write(line);
        writer.newLine();
      }
    }
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
}
