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
public class Standar_WebPage extends WebPageDecorator {

    public Standar_WebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void StandarUser() {
        System.out.println("Akun Biasa...");
    }

    public void TampilkanWeb() {
        super.TampilkanWeb();
        this.StandarUser();
    }
}
