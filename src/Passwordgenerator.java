
import java.util.Scanner;

public class Passwordgenerator {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        //chiedere all'utente:
        System.out.println("Inserisci il tuo nome");
        
        String nome = scan.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String cognome = scan.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito");
        String colore = scan.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita");
        int giorno = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita");
        int mese = scan.nextInt();
        
        System.out.println("Inserisci il tuo anno di nascita");
        int anno = scan.nextInt();

        int somma = giorno + mese + anno;

        System.out.println("La tua passaword è: " + nome + "-" +cognome + "-" +colore + "-" +somma);

        
    }
}
