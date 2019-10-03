package contoh.pkgif.pkgelse;
import java.util.*;
public class ContohIfElse {
public static void main(String[] args) {

    String Ulasan;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nombor pertama: " );
    int nom1=input.nextInt();
    
    System.out.print("Masukkan nombor kedua: " );
    int nom2=input.nextInt();
    
    if (nom2 > nom1){
        
            Ulasan="Nombor kedua adalah lebih besar";
            
    }else if(nom1 > nom2){
        
            Ulasan="Nombor pertama adalah lebih besar";
            
    }else {
        
            Ulasan="Nombor pertama dan kedua sama besar";
            }
        
        System.out.println(Ulasan);
    }
    }