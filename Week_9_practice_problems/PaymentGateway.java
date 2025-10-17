class Payment {
    public void pay() {
        System.out.println("Generic payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class WalletPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Wallet");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        // 1. Create array of Payment references
        Payment[] payments = {
            new CreditCardPayment(),
            new WalletPayment(),
            new Payment()
        };

        // 2. Loop, call getClass().getSimpleName(), and pay()
        for (Payment p : payments) {
            System.out.println("Processing: " + p.getClass().getSimpleName());
            p.pay();
            System.out.println();
        }
    }
}
