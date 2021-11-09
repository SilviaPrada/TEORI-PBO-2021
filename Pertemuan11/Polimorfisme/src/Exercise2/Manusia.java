package Exercise2;

public class Manusia {
    
    public void nyalakanPerangkat(Elektronik perangkat){
        if (perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul)perangkat).getModeInput());
            System.out.println("Voltase televisi: " + ((TelevisiJadul)perangkat).voltase);
        }
        else if (perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi modern dengan input: " + ((TelevisiModern)perangkat).getModeInput());
            System.out.println("Voltase televisi: " + ((TelevisiModern)perangkat).voltase);
        }
    }
}
