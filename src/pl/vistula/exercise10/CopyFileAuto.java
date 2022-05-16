package pl.vistula.exercise10;



import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFileAuto {
    public static void main(String[] args) {

        int bajt;

       try(FileInputStream  fis = new FileInputStream("file text");
        FileOutputStream  fos = new FileOutputStream("copyFile.txt")){

            do{
                bajt = fis.read();
                if((char)bajt == ' ') bajt='-';
                if (bajt != -1) fos.write(bajt);
            } while (bajt != -1);
        }catch (IOException e){
            System.out.println("Error IO");
        }
    }
}
