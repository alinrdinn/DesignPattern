/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author Ali Nurdin
 */
class LayananWeb {

    private String web;
    
    LayananWeb(String web) {
        this.web = web;
    }
    
    public Json request(Json result){
        Json json = new Json();
        /*
        ... statement yang dilakukan
        */
        System.out.println("Requesting to "+ web);
        return json;
    }
    
}
