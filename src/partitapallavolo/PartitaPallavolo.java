package partitapallavolo;

public class PartitaPallavolo {
    public static void main(String[] args) {
        

        Giocatore g1 = new Giocatore(1);
        Giocatore g2 = new Giocatore(2);
        Giocatore g3 = new Giocatore(3);

        
        Thread t1 = new Thread(g1);
        t1.setPriority(Thread.MIN_PRIORITY); // Imposta priorità minima per il giocatore

        Thread t2 = new Thread(g2);
        t2.setPriority(Thread.MIN_PRIORITY); 

        Thread t3 = new Thread(g3);
        t3.setPriority(Thread.MIN_PRIORITY); 

        // Stampa le informazioni del primo giocatore e avvia il thread t1
        System.out.println("idGiocatore: " + g1.getId() + ", priorità del giocatore: " + t1.getPriority() + ", nome giocatore: " + t1.getName());
        t1.start(); // Avvia il thread per il primo giocatore
        
        System.out.println("idGiocatore: " + g2.getId() + ", priorità del giocatore: " + t2.getPriority() + ", nome giocatore: " + t2.getName());
        t2.start(); 

        System.out.println("idGiocatore: " + g3.getId() + ", priorità del giocatore: " + t3.getPriority() + ", nome giocatore: " + t3.getName());
        t3.start(); 
    }
}
