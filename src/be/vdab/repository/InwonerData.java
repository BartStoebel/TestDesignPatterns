/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.repository;

import be.vdab.model.Inwoner;
import be.vdab.model.InwonerFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinnie
 */
public class InwonerData {
    private File file;

    public InwonerData(File file) {
        this.file = file;
    }
    /**
     * Haal alle inwoners uit het bestand, en steek in een List. Gebruikt de 
     * InwonerFactory om de juiste objecten aan te maken!
     * @return de inwonerlijst van het eiland
     */
    public List<Inwoner> getInwonersUitBestand(){
        List <Inwoner> inwonerlijst = new ArrayList<>();
        InwonerFactory inwonerFactory = new InwonerFactory();
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
            String string = "";
            while ((string = br.readLine()) != null){
                inwonerlijst.add(inwonerFactory.maakInwoner(string));
            }
        }catch (IOException e){
            System.err.println("File niet gevonden");
        }
        return inwonerlijst;
    }
    
    
    
}
