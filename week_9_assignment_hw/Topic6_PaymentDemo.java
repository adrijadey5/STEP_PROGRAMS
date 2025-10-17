// Topic 6: Local and Anonymous Inner Classes

interface Discount {
    double applyDiscount(double amount);
}

class Payment {
    void processTransaction(double amount) {
        // Local Inner Class defined inside a method
        class Validator {
            boolean isValid(double amt) {
                return amt > 0;
            }
        }

        Validator validator = new Validator();
        if (!validator.isValid(amount)) {
            System.out.println("Invalid payment amount!");
            return;
        }

        System.out.println("Original Amount: ₹" + amount);

        // Anonymous Inner Class implementing Discount interface
        Discount discount = new Discount() {
            @Override
            public double applyDiscount(double amt) {
                System.out.println("Applying 10% festival discount...");
                return amt * 0.9; // 10% off
            }
        };

        double finalAmount = discount.applyDiscount(amount);
        System.out.println("Final Amount after Discount: ₹" + finalAmount);
    }
}

public class Topic6_PaymentDemo {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processTransaction(5000);
    }
}
