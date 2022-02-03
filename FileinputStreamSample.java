package Streams;

import java.io.FileInputStream;

public class FileinputStreamSample {
    public static void main(String [] args){
        try{
            FileInputStream fin=new FileInputStream("C:Text.txt");
            int read;
            while ((read= fin.read())!=-1){
                System.out.print((char) read);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
