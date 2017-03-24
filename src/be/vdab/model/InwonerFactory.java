/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.model;

/**
 *
 * @author Vinnie
 */
public class InwonerFactory {
    /**
     * Maakt een inwoner aan, van het type beschreven in de String, 
     * met de naam beschreven in de String
     * @param inwoner String waarbij eerste letter het type inwoner is: V voor
     * Vogel, Z voor Zoogdier! Rest van de String is de naam van het dier
     * @return de aangemaakte Inwoner (Vogel of Zoogdier)
     */
    public Inwoner maakInwoner(String inwoner){
        String type = inwoner.substring(0, 1);
        String naam = inwoner.substring(1, inwoner.length());
        switch(type){
            case "V": return new Vogel(naam);
            case "Z": return new Zoogdier(naam);
            default : throw new IllegalArgumentException();
        }
    }
    
}
