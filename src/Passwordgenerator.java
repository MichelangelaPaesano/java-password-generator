
import java.util.Scanner;

public class Passwordgenerator {
    public static void main(String[] args) {
        //devo chiedere all'utente di inserire:
        //nome
        //cognome
        //colore preferito
        //data di nascita di un utente suddivisa in giorno, mese e anno in numero

        //Scanner per chiedere all'utente di inserire dati durante l'esecuzione
        Scanner scan = new Scanner (System.in);
        //chiedere all'utente:
        System.out.println("Inserisci il tuo nome");
        //mettiamo string in modo che l'utente possa farlo:
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
        //generare (e stampare a video) una password  concatenando nome, cognome, 
        //colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -

        
    }
}
