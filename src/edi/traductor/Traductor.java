package edi.traductor;

import java.io.File;
import java.util.Scanner;

public class Traductor {
    private String edidocument;

    //Constructor
    public Traductor(String edidocument) {
        this.edidocument = edidocument;
    }
    
    //Validador
    public String Validator () {
        try {
            File ediFile = new File(edidocument);
            Scanner ediRead = new Scanner(ediFile);
            String ediContent = "";
            while (ediRead.hasNextLine() == true) {
                ediContent += ediRead.nextLine();
            }
            if (ediContent.length() != 0) {
                return "Archivo con contnido";
            } else {
                return "Archivo vacio";
            }
        } catch (Exception e) {
            return "Archivo invalido o corrupto \nError: " + e;
        }
    }
}