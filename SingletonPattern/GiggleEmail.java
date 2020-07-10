/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author Ali Nurdin
 */
public class GiggleEmail{
    private static Giggle AkunGiggle;
    
    public GiggleEmail(){
        AkunGiggle = null;
    }
    
    public GiggleEmail(Giggle Akun){
        AkunGiggle = Akun;
    }
    
    public void DisplayGEmail(){
        if(AkunGiggle == null){
            System.out.println("Anda belum login...");
        }else{
            System.out.println("Selamat datag di Giggle Email "+ (AkunGiggle).getNama());
        }
    }
    
}
