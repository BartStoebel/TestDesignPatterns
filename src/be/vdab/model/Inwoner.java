/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.model;

import java.util.Observer;

/**
 *
 * @author Vinnie
 */
public abstract class Inwoner implements Observer{
    private String naam;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public Inwoner(String naam) {
        this.naam = naam;
    }
    
}
