package org.pw.modules.deloite;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyUpdate(String message);
}

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Subject
class Stock implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;
    public Stock(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyUpdate("Price of " + stockName + " changed to: " + price);
    }

}
// Concrete Observer
class User implements Observer {

    private String name;
    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }

}
public class ObserverDesignPattern {
    public static void main(String[] args) {
Stock stock=new Stock("Tata");
        User user1 = new User("Pratap");
        User user2 = new User("User1");
        User user3 = new User("User2");
        User user4 = new User("User3");
        stock.attach(user1);
        stock.attach(user2);
        stock.attach(user3);
        stock.attach(user4);

        stock.setPrice(1500.0);


//stock.notifyUpdate("STocke name changes");
    }
}
