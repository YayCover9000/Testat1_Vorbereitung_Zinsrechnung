import java.util.Scanner;
public class Testat1_Vorbereitung_Zinsrechnung {
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float AnfangsKapital = sc.nextFloat();
        float EndKapital;
        int Laufzeit = sc.nextInt();
        float Zinssatz = sc.nextFloat();
        float i;
        float i2;
        
        if(Zinssatz<10) {
            i = Zinssatz/100.0f;
            i2 = (i * Laufzeit + 1);
            EndKapital = AnfangsKapital * i2;
            //EndKapital = AnfangsKapital * Math.pow((Laufzeit + 1),i);
            System.out.println(EndKapital);
        }else{
            System.out.println("Eingabefehler");
        }
        sc.close();
        
    }
}

