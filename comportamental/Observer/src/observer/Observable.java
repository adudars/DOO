package observer;

import java.util.ArrayList;

/**
 *
 * @author eduarda
 */
public class Observable {
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer observer) {
        this.monitores.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.monitores.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : monitores){
          observer.update(this);
        }
    }
  
}
