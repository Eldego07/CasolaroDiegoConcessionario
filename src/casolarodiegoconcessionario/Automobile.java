/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casolarodiegoconcessionario;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Automobile {
    private double prezzo;
    private String modello;
    private String targa;
    private int km;
    private int cilindrata;
    private int potenza;
    private TipoAlimentazione alimentazione;
    
    public Automobile(double prezzo, String modello, String targa, int km, int cilindrata, int potenza, TipoAlimentazione alimentazione){
        if(modello==null||modello.isEmpty())throw new IllegalArgumentException("Inserisci un modello valido!");
        if(targa==null||targa.isEmpty()||targa.length()!=7)throw new IllegalArgumentException("Inserisci una targa valida!");
        if(prezzo<=0)throw new IllegalArgumentException("inserisci un prezzo valido!");
        if(km<=0)throw new IllegalArgumentException("inserisci un quantitativo di km valido!");
        if(cilindrata<=0)throw new IllegalArgumentException("inserisci un quantitativo di cilindrata valido!");
        if(potenza<=0)throw new IllegalArgumentException("inserisci un quantitativo di potenza valido!");
        this.prezzo=prezzo;
        this.modello=modello;
        this.targa=targa;
        this.km=km;
        this.cilindrata=cilindrata;
        this.potenza=potenza;
        this.alimentazione=alimentazione;
    }
    
    public String getTarga(){
        return targa;
    }
    
    public double getPrezzo(){
        return prezzo;
    }
    
    public String getModello(){
        return modello;
    }
    
    public int getKm(){
        return km;
    }
    
    public int getcilindrata(){
        return cilindrata;
    }
    
    public int getPotenza(){
        return potenza;
    }
    
    public TipoAlimentazione getAlimentazione(){
        return alimentazione;
    }
    
    public void setTarga(String targa){
        this.targa=targa;
    }
    
    public void setModello(String modello){
        this.modello=modello;
    }
    
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    
    public void setKm(int km){
        this.km=km;
    }
    
    public void setCilindrata(int cilindrata){
        this.cilindrata=cilindrata;
    }
    
    public void setPotenza(int potenza){
        this.potenza=potenza;
    }
    
    public void setAlimentazione(TipoAlimentazione alimentazione){
        this.alimentazione=alimentazione;
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
        final Automobile other = (Automobile) obj;
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        if (this.km != other.km) {
            return false;
        }
        if (this.cilindrata != other.cilindrata) {
            return false;
        }
        if (this.potenza != other.potenza) {
            return false;
        }
        if (!Objects.equals(this.modello, other.modello)) {
            return false;
        }
        if (!Objects.equals(this.targa, other.targa)) {
            return false;
        }
        return this.alimentazione == other.alimentazione;
    }

    
    
    @Override
    public String toString() {
        return "Automobile{" + "prezzo=" + prezzo + ", modello=" + modello + ", targa=" + targa + ", km=" + km + ", cilindrata=" + cilindrata + ", potenza=" + potenza + ", alimentazione=" + alimentazione + '}';
    }
    
    
}
