package pl.vistula.exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {

        FileInputStream fis;
         int bajt;

          try {
              fis = new FileInputStream("exam6.txt");
          }catch (FileNotFoundException e){
              System.out.println(" not found");
              return;

          }

          try {
              do {
                  bajt = fis.read();
                  if (bajt != -1)
                      System.out.println((char) bajt);
              } while (bajt != -1);

          }catch (IOException e){
              System.out.println(" error reading file");
          }
          finally {


              try {
                  fis.close();
              } catch (IOException e) {
                  System.out.println(" closing file");
              }
          }
    }
}
