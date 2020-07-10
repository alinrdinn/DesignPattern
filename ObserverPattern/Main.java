/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author Ali Nurdin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Di bawah ini adalah Subcriber
        Subscriber Observer1 = new Subscriber("Ali");
        Subscriber Observer2 = new Subscriber("Nurdin");
        
        // Membuat blog
        Blog Worldpress = new Blog();
        
        // Register Subscriber di blog
        Worldpress.registerSubscriber(Observer1);
        Worldpress.registerSubscriber(Observer2);
        
        // Post blog dengan judul baru
        System.out.println("Worldpress telah memm-publish headline baru berjudul 'Polban akan mengadakan UAS'");
        Worldpress.setNewHeadline("Polban akan mengadakan UAS");
        
        //Beritahu Subscriber bahwa Blog ada headline baru
        Worldpress.notifySubscriber();
        
        //Apakah subscriber telah mendapatkan update?
        System.out.println(Observer1.getName()+" telah mendapat headline berjudul '"+Observer1.getHeadlineHasBeenReceived() +"'");
        System.out.println(Observer2.getName()+" telah mendapat headline berjudul '"+Observer2.getHeadlineHasBeenReceived() +"'");
    }

}
