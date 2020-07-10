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
public class Dasar_WebPage implements WebPage {

    public String html = "\\alisocial.html";
    public String styleSheet = "\\css\\Boostrap.css";
    public String script = "\\js\\JQuery.js";

    public void TampilkanWeb() {
        System.out.println("Rendering:"+html+" dengan:"+styleSheet+", dan "+script);
    }
}
