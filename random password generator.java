import java.util.Random;

public class Pasopport_generator {

    public static void main(String[] args) {
        Random rnd = new Random();
   
        for (int i = 0; i < 8; i++) {
        
        int guess = rnd.nextInt(3);
     
        
        
        switch (guess){
            case 0:
                
                String number = "0123456789";
                int stg = rnd.nextInt(number.length());
                char let = number.charAt(stg);
                
                System.out.print(let);
               
            break;
                
            case 1:
                
                String letter ="QWERTYUIOPĞÜASDFGHJKLŞİZXCVBNMÖÇ";
                int stg1 = rnd.nextInt(letter.length());
                char let1 = letter.charAt(stg1);
                 
                System.out.print(let1);
            break;
                
            case 2:
               
                
                String littleLetters = "qwertyuıopğüasdfghjklşizxcvbnmöç";
                int stg2 = rnd.nextInt(littleLetters.length());
                char let2 = littleLetters.charAt(stg2);
                 
                System.out.print(let2);
                 
            break;   
                
            case 3:
                
                String specail ="!@#$%&*()_+-=[]|,./?><";
                int stg3 = rnd.nextInt(specail.length());
                char let3 = specail.charAt(stg3);
                 
                System.out.print(let3);
            break;    
            } 
        }
         
        }            
    }