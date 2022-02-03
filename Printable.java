package Streams;

public interface Printable {
    void print();
    }
    class Airtel implements Printable{
        @Override
        public void print() {
            System.out.println("Hi User,Welcome to interface");
        }
        public static void main(String []args){
            Airtel airtel= new Airtel();
            airtel.print();
        }
    }
