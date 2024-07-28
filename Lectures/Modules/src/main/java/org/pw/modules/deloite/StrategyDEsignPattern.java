package org.pw.modules.deloite;

interface PaymentStrategy {
    void pay(int amount);
}

public class StrategyDEsignPattern {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.pay(1000);
        paymentContext.setStrategy(new CryptoPayment());
        paymentContext.pay(1000);
        paymentContext.setStrategy(new PayPalPayment());
        paymentContext.pay(1000);

    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency");
    }
}