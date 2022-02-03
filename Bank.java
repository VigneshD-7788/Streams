package Streams;

public interface Bank {
    float rateOfInterest();
    }
    class SBI implements Bank{
        @Override
        public float rateOfInterest() {
            return 9.15f;
        }
        class IOB implements Bank{
            @Override
            public float rateOfInterest() {
                return 9.7f;
            }
        }
        public static void main(String[] args){
            Bank bank=new SBI();
            System.out.println("ROI:"+bank.rateOfInterest());
        }
    }
