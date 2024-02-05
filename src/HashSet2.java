import java.util.HashSet;

/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetRiempito();
        String oggettoDaVerificare = creaOggetto("5");
        VerificaStampaResult(hashSet, oggettoDaVerificare);


    }
    public static HashSet<String> hashSetRiempito(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        return hashSet;



    }
    public static String creaOggetto(String value){
        String oggetto = new String(value);
        return oggetto;

    }
    public static void VerificaStampaResult(HashSet<String> hashSet, String oggettoVerifica) {
        if (hashSet.contains(oggettoVerifica)) {
            System.out.println("L'oggetto è parte dell'HashSet: " + oggettoVerifica);
        } else {
            System.out.println("L'oggetto non è parte dell'HashSet: " + oggettoVerifica);
        }
    }
}
