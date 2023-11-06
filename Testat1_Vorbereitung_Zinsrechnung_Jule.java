import java.util.Scanner;
public class Testat1_Vorbereitung_Zinsrechnung_Jule {
	
	    
	    public static void main(String[] args) {
	        
	        float anfangskapital;
	        float jahre; 
	        float zinssatz;
	        int laufzeit; 
	        float i; 
	        float endkapital; 
	        
	        Scanner sc = new Scanner(System.in);
	        
	        anfangskapital = sc.nextFloat();
	        laufzeit = sc.nextInt();
	        zinssatz = sc.nextFloat();
	        if(zinssatz < 10){
	            i = zinssatz/ 100.0f;
	            float i2 = (i * laufzeit+1);
	            endkapital = anfangskapital * i2;
	            
	            System.out.println(endkapital);
	        }else{
	            System.out.println("Eingabefehler");
	        }
	        sc.close();
	    }
	}

