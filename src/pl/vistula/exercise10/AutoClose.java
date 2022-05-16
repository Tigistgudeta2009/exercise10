package pl.vistula.exercise10;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoClose {
    public static void main(String[] args) throws IOException {


        int bajt;

        try (FileInputStream fis = new FileInputStream("exam6.txt"))
        {
            do
            {
                bajt = fis.read();
                if (bajt != -1) System.out.print((char) bajt);
            }

            while (bajt != -1);

        }

        catch (IOException e)
        {
            System.out.println("Error reading Tile");
        }
    }

}
