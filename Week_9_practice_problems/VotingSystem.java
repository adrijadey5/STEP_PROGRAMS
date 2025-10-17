public class VotingSystem {

    public void processVote(String voterId, String candidate) {
        // Local Inner Class defined inside a method
        class VoteValidator {
            public boolean validate() {
                // Simple validation rule:
                // voterId must start with "VOTER" and have at least 8 characters
                return voterId != null && voterId.startsWith("VOTER") && voterId.length() >= 8;
            }
        }

        // Create instance of local inner class
        VoteValidator validator = new VoteValidator();

        System.out.println("Processing vote for candidate: " + candidate);
        if (validator.validate()) {
            System.out.println("Voter ID " + voterId + " is valid. Vote accepted.");
        } else {
            System.out.println("Voter ID " + voterId + " is INVALID. Vote rejected.");
        }
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        // Test with various voter IDs
        system.processVote("VOTER123", "Alice");
        system.processVote("123VOTER", "Bob");
        system.processVote("VOTER99", "Charlie");
    }
}
