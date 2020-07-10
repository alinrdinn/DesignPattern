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
class Subscriber implements Observer {
    
    private String Name;
    private String headlineHasBeenReceived;
    
    public Subscriber(String Name){
        this.Name = Name;
    }
    
    @Override
    public void update(String headline) {
        this.headlineHasBeenReceived = headline;
    }
    
    public String getHeadlineHasBeenReceived(){
        return this.headlineHasBeenReceived;
    }
    
    public String getName(){
        return this.Name;
    }
}
