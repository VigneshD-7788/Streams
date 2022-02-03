package Streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationSample {
    public static void main(String[] args) {
        try {
            //Creating the object
            Studentpojo s1 = new Studentpojo(10583, "Vignesh");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
