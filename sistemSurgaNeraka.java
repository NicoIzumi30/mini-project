import java.util.Scanner;
public class pemilihanAkhirat {
    public static void main(String[] args) {
        int pahala;
        int dosa;
        int amalShaleh;
        int berbakti;
        
      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan Pahala Anda : ");
      pahala = input.nextInt();
      System.out.println("Masukkan Dosa Anda : ");
      dosa = input.nextInt();
      
      if(pahala > dosa) {
          System.out.println("Selamat Anda Masuk Surga");
      }else if(pahala < dosa) {
          System.out.println("Selamat Anda Masuk Neraka");
      }else if(pahala == dosa) {
          System.out.println("Masukkan Amal Shalleh Anda :");
          amalShaleh = input.nextInt();
          System.out.println("Masukkan Amal Berbakti Orang Tua");
          berbakti = input.nextInt();
          
          if(amalShaleh >= 75 && berbakti >= 75) {
              System.out.println("Selamat Anda Masuk Surga");
          }else if(amalShaleh <= 75 || berbakti <= 75) {
              System.out.println("Selamat Anda Masuk Neraka");
          }else {
              System.out.println("Mohon Maaf Sepertinya Anda Bukan Manusia");
          }
      }else {
          System.out.println("Mohon Masukkan Data Yang Benar");
      }
        
    }
    
}
