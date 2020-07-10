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
public class Main {
    
    public static void main(String args[]) {
        // Membuka akun Giggle Email dan Giggle Drive sebelum login
        GiggleEmail GEmail = new GiggleEmail();
        GiggleDrive GDrive = new GiggleDrive();
        GEmail.DisplayGEmail();
        GDrive.DisplayGDrive();
        
        // Login satu akun (Giggle saja)
        Giggle Account = Giggle.getInstance();
        GEmail = new GiggleEmail(Account.getInstance());
        GDrive = new GiggleDrive(Account.getInstance());
        
        // Membuka akun Giggle Email dan Giggle Drive setelah login
        GEmail.DisplayGEmail();
        GDrive.DisplayGDrive();
    }
}
