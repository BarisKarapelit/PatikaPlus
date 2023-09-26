package Week2;

public class Recursive {
        static int basamaklarToplami(int sayi){
            if (sayi == 0){
                return 0;
            }else
                return sayi % 10 + basamaklarToplami(sayi / 10);
        }
        public static void main(String[] args){
            System.out.println("Basamak toplami: "+basamaklarToplami(45612));
        }

}
