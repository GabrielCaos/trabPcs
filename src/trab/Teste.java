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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author LABCCET
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] aArgs) throws IOException{
    Teste text = new Teste();
    
    //treat as a small file
    List<String> lines = text.readSmallTextFile(FILE_NAME);
    //log(lines);
    Pattern my_pattern = Pattern.compile("\"(?i)(;*?)(.+?)(;)\"");
    
    for(String line : lines){
        //System.out.println(line);
        Matcher  m = my_pattern.matcher(line);
        System.out.println(m);
        while(m.find()){
            System.out.println("entrei");
            String s = m.group(1);
            //System.out.println(m.group(1));
        }
    }
    //lines.add("This is a line added in code.");
    //text.writeSmallTextFile(lines, FILE_NAME);
    
    //treat as a large file - use some buffering
    //text.readLargerTextFile(FILE_NAME);
    //System.out.println(text);
    //lines = Arrays.asList("Down to the Waterline", "Water of Love");
    //text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);   
  }

  final static String FILE_NAME = "C:\\Usuários\\Gabriel_Net\\Desktop\\calendario.txt";
  final static String OUTPUT_FILE_NAME = "C:\\Usuários\\Gabriel_Net\\Desktop\\calendario2.txt";
  final static Charset ENCODING = StandardCharsets.UTF_8;
  
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