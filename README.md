# Partita di Pallavolo

**Jakub Allababidi** 

---

## Obiettivo del Progetto

Il progetto simula una partita di pallavolo tra 3 giocatori che si passano la palla utilizzando i thread. Ogni giocatore:
- Conta i passaggi effettuati.
- Utilizza thread per alternarsi nella simulazione.

---

## Classi e Struttura del Codice

### Classe `Giocatore`
- **Scopo**: Rappresenta un giocatore e tiene traccia dei suoi passaggi.
- **Attributi**:
  - `id`: Identificativo univoco del giocatore.
  - `numeroPassaggi`: Contatore dei passaggi fatti dal giocatore.
- **Metodi**:
  - `getId()`: Restituisce l'ID del giocatore.
  - `getNumeroPassaggi()`: Restituisce il numero di passaggi.
  - `run()`: Incrementa i passaggi e simula il passaggio della palla.

### Classe `PartitaPallavolo`
- **Scopo**: Avvia e gestisce la simulazione.
- **Metodo**:
  - `main()`:Crea i giocatori, assegna i thread e avvia la simulazione.

---

## Flusso del Programma

1. Creazione di tre giocatori con ID univoco.
2. Creazione di un thread per ogni giocatore.
3. Alternanza dei passaggi tra i giocatori:
   - Ciascun giocatore incrementa e stampa il suo conteggio di passaggi.
   - I thread dormono per 3 secondi tra un passaggio e l'altro.

---

## Librerie Utilizzate

- `java.lang.Thread`: Per la gestione dei thread.
- `java.lang.Runnable`: Interfaccia per implementare il comportamento dei thread.
- `java.lang.InterruptedException`: Gestisce eventuali interruzioni dei thread.

