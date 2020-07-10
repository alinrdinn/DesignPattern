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
import java.util.Scanner;

public class Giggle {

    private static String UsernameAkun;
    private static Giggle AkunGiggle = null;

    private Giggle() {
        Scanner scanLine = new Scanner(System.in);
        System.out.print("Masukkan username (satu kata & tidak perlu password):\n");
        String Username = scanLine.next();
        UsernameAkun = Username;
    }

    public static Giggle getInstance() {
        if (AkunGiggle == null) {
            AkunGiggle = new Giggle();
        }
        return AkunGiggle;
    }

    public void changeUsername(String NamaBaru) {
        UsernameAkun = NamaBaru;
    }

    public String getNama() {
        return UsernameAkun;
    }

}
