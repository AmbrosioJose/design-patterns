package Structural.Decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;


/**
 * The InputTest class tests the LowerCaseInputStream to demonstrate the decorator pattern within the Java I/O api.
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/Structural/Decorator/LowerCaseInputStream/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
