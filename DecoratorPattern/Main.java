/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author Ali Nurdin
 */
public class Main {

    public static void main(String args[]) {
        WebPage Page = new Dasar_WebPage();
        Page = new Standar_WebPage(Page);
        Page = new Bisnis_WebPage(Page);
        Page.TampilkanWeb();
    }
}
