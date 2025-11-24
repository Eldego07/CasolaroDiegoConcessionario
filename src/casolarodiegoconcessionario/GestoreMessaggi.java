/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casolarodiegoconcessionario;

import java.util.*;

/**
 *
 * @author casolaro.diego
 */
public class GestoreMessaggi {
    public void spazioInsufficiente(){
        System.out.println("Spazio insufficiente per inserire la macchina");
    }
    
    public Automobile setEgetAuto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il modello della macchina:");
        String modello=input.next();
        System.out.println("Inserisci la targa della macchina:");
        String targa=input.next();
        System.out.println("Inserisci il prezzo della macchina:");
        int prezzo=input.nextInt();
        System.out.println("Inserisci i km della macchina:");
        int km=input.nextInt();
        System.out.println("Inserisci la cilindrata della macchina:");
        int cilindrata=input.nextInt();
        System.out.println("Inserisci la potenza della macchina:");
        int potenza=input.nextInt();
        System.out.println("Inserisci il tipo di alimentazione della macchina");
        TipoAlimentazione alimentazione=TipoAlimentazione.valueOf(input.next());
        Automobile auto= new Automobile( prezzo,  modello,  targa,  km,  cilindrata,  potenza, alimentazione);
        return auto;
    }
}
