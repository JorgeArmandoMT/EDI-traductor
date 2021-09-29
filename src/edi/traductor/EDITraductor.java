package edi.traductor;

public class EDITraductor {

    public static void main(String[] args) {
        String ediDocument = "C:\\Users\\Windows\\Documents\\NetBeansProjects\\X214_sample.txt";
        Traductor traductor = new Traductor(ediDocument);
        System.out.println(traductor.Validator());
    }
    
}
