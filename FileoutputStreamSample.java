package Streams;

import java.io.FileOutputStream;

public class FileoutputStreamSample {
    public static void main(String []args){
        try{
            FileOutputStream fos=new FileOutputStream("C:Text.txt");
            fos.write("Hi vignesh".getBytes());
            System.out.println("File has created");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
