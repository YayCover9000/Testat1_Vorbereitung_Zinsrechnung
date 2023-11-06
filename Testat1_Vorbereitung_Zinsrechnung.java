
public class Testat1_Vorbereitung_Zinsrechnung {
	public static void main(String [] args){
        double K0 = 200;
        double Kn = 0;
        int n = 1;
        double p = 5;
        double i = p/100;
        
        //Berechnung
        
        
        if(p<10) {
            Kn = K0 * Math.pow((1 + i), n);
            System.out.println(Kn);

        }else{
            System.out.println("Eingabefehler");
        }
    }
}

