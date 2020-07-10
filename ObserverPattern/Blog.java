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
import java.util.ArrayList;

class Blog {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    private String headline;

    public void registerSubscriber(Observer observer) {
        observers.add(observer);
    }

    public void unregisterSubscriber(Observer observer) {
        observers.remove(observer);
    }

    public void notifySubscriber() {
        observers.forEach((observer) -> {
            observer.update(headline);
        });
    }
    
    public void setNewHeadline(String Headline){
        this.headline = Headline;
    }
    
    public String getLatestHeadline(){
        return this.headline;
    }
}