interface Notifier {
    void send(String message);
}

public class Service {

    public void triggerAlert() {
        // Anonymous Inner Class implementing Notifier interface
        Notifier notifier = new Notifier() {
            @Override
            public void send(String message) {
                System.out.println("🔔 Notification Sent: " + message);
            }
        };

        // Use the anonymous class to send an alert
        notifier.send("System alert! Low battery detected.");
    }

    public static void main(String[] args) {
        new Service().triggerAlert();
    }
}
