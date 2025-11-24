/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casolarodiegoconcessionario;

import java.util.*;

/**
 *
 * @author diego
 */
public class Test {
    public void avvia(){
        Scanner input = new Scanner(System.in);
        GestoreMessaggi errore= new GestoreMessaggi();
        System.out.println("Inserisci la Ragione Sociale:");
        String ragioneSociale=input.next();
        System.out.println("Inserire la partita IVA:");
        String partitaIVA=input.next();
        System.out.println("Inserire il numero massimo di spazio auto nel concessionario:");
        int maxAuto =input.nextInt();
        System.out.println("Inserire il quantitativo di denaro nel conto:");
        double conto=input.nextDouble();
        Concessionario concessionario=new Concessionario(ragioneSociale, maxAuto,  partitaIVA, conto);
        int scelta,tempoTasse=0,sTasse;
        boolean tassePagate=false;
        do {
            if(tempoTasse>4&&!tassePagate){
                System.out.println("Devi pagare 1000€ di tasse entro 4 operazioni! premi 1 per pagare");
                sTasse=input.nextInt();
                if(sTasse==1){
                    conto-=1000;
                    tassePagate=true;
                    tempoTasse=0;
                }
                if(tempoTasse>9){
                    System.out.println("Non hai pagato le tasse, abbiamo pignorato il Concessionario!");
                    conto=0;
                    System.out.println(concessionario);
                    return;
                }
            }
            System.out.println("Scegli cosa fare:");
            System.out.println("1. Compra auto");
            System.out.println("2. Vendi auto");
            System.out.println("3. Mostra Conto");
            System.out.println("4. Esci");
            scelta = input.nextInt();
            if (scelta == 1) {
                concessionario.compraAuto(errore.setEgetAuto());
            } else if (scelta == 2) {
                System.out.println("Inserisci la targa della macchina:");
                String targa = input.next();
                concessionario.vendiAuto(targa);
            } else if (scelta==3){
                System.out.println("Al momento hai: "+concessionario.getConto()+"$");
            }
            tempoTasse++;
        } while (scelta != 4);
        System.out.println(concessionario);
    }
}
