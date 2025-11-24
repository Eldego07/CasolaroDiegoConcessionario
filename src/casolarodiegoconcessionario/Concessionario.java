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
public class Concessionario {
    private String ragioneSociale;
    private int maxAuto;
    private double conto;
    private String partitaIVA;
    private Automobile[] parcoAuto;
    private GestoreMessaggi errore= new GestoreMessaggi();
    
    public Concessionario(String ragioneSociale, int maxAuto, String partitaIVA,double conto){
        if(ragioneSociale==null||ragioneSociale.isEmpty())throw new IllegalArgumentException("Inserisci una ragione sociale valida!");
        if(partitaIVA.length()!=11) throw new IllegalArgumentException("Inserisci una partita IVA valida!");
        if(maxAuto<=0)throw new IllegalArgumentException("inserisci un numero massimo di auto valido!");
        this.ragioneSociale=ragioneSociale;
        this.maxAuto=maxAuto;
        this.partitaIVA=partitaIVA;
        this.conto=conto;
        parcoAuto=new Automobile[maxAuto];
    }
    
    
    public void aggiungiAuto(Automobile auto, int i){
        parcoAuto[i]=auto;
    }
    
    public void rimuoviAuto( int i){
        parcoAuto[i]=null;
    }
    
    
    public void vendiAuto(String targa){
        for(int i=0;i<parcoAuto.length;i++){
            if(targa==parcoAuto[i].getTarga()){
                conto+=parcoAuto[i].getPrezzo();
                rimuoviAuto(i);
            }
        }
    }
    
    public void compraAuto(Automobile auto){
        conto-=auto.getPrezzo();
        if(trovaSpazio()!=-1&&!checkAuto(auto)){
            aggiungiAuto(auto,trovaSpazio());
        }
        else{
            errore.spazioInsufficiente();
        }
    }
    
    public int trovaSpazio(){
        for(int i=0;i<=parcoAuto.length;i++){
            if(parcoAuto[i]==null){
                return i;
            }
        }
        return -1;
    }
    
    public boolean checkAuto(Automobile auto){
        for(Automobile a :parcoAuto){
            if(a!=null&&a.equals(auto)){
                return true;
            }
        }
        return false;
    }
    
    public double getConto(){
        return conto;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Concessionario other = (Concessionario) obj;
        if (this.maxAuto != other.maxAuto) {
            return false;
        }
        if (Double.doubleToLongBits(this.conto) != Double.doubleToLongBits(other.conto)) {
            return false;
        }
        if (!Objects.equals(this.ragioneSociale, other.ragioneSociale)) {
            return false;
        }
        if (!Objects.equals(this.partitaIVA, other.partitaIVA)) {
            return false;
        }
        return Arrays.deepEquals(this.parcoAuto, other.parcoAuto);
    }

    @Override
    public String toString() {
        return "Concessionario{" + "ragioneSociale=" + ragioneSociale + ", maxAuto=" + maxAuto + ", conto=" + conto + ", partitaIVA=" + partitaIVA + ", parcoAuto=" + parcoAuto + '}';
    }
    
}
