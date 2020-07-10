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
public class Bisnis_WebPage extends
        WebPageDecorator {

    public Bisnis_WebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void BisnisUser() {
        System.out.println("Akun Bisnis...");
    }

    public void TampilkanWeb() {
        super.TampilkanWeb();
        this.BisnisUser();
    }
}
