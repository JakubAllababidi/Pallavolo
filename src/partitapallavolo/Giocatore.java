package partitapallavolo;

public class Giocatore implements Runnable {
    private int idGiocatore;
    private int numeroPassaggi;
    
    public Giocatore(int id){
        this.idGiocatore = id;
        this.numeroPassaggi = 0;
    }

    public int getId(){
        return idGiocatore;
    }
 
    public int getNumeroPassaggi(){
        return numeroPassaggi;
    }

    public void run() {

        while (true) {
            System.out.println("Giocatore " + idGiocatore + " ha fatto " + numeroPassaggi + " passaggi e gli è arrivata la palla.");
            numeroPassaggi++;
            System.out.println("Giocatore " + idGiocatore + " ha passato la palla e ha fatto " + numeroPassaggi + " passaggi.");
            Thread.currentThread().yield();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
