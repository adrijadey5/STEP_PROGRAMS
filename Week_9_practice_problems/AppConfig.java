public class AppConfig {

    private String appName = "MyApplication";

    // Static nested class
    public static class NetworkConfig {
        private String host;
        private int port;

        // Constructor
        public NetworkConfig(String host, int port) {
            this.host = host;
            this.port = port;
        }

        // Method to display network configuration
        public void displayConfig() {
            System.out.println("---- Network Configuration ----");
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
            System.out.println("(Static nested class can access outer static members, "
                    + "but not instance members like appName.)");
        }
    }

    // Main method (AppConfigurator logic inside same file)
    public static void main(String[] args) {
        // Create instance of static nested class
        AppConfig.NetworkConfig config = new AppConfig.NetworkConfig("localhost", 8080);
        // Display configuration details
        config.displayConfig();
    }
}
