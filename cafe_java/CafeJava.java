public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage); // Displays "Cindhuri, your order is ready"
        } else {
            System.out.println(customer1 + pendingMessage); // Displays "Cindhuri, your order will be ready shortly"
        }
        
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage); // Displays "Noah, your order is ready"
            System.out.println(displayTotalMessage + cappuccinoPrice); // Displays "Your total is $3.5"
        } else {
            System.out.println(customer4 + pendingMessage); // Displays "Noah, your order will be ready shortly"
        }
        
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        int latteQuantity = 2;
        double totalAmount = lattePrice * latteQuantity;
        System.out.println(displayTotalMessage + totalAmount); // Displays "Your total is $8.0"
        
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage); // Displays "Sam, your order is ready"
        } else {
            System.out.println(customer2 + pendingMessage); // Displays "Sam, your order will be ready shortly"
        }
        
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Jimmy"
        double correctTotalAmount = lattePrice * latteQuantity;
        System.out.println(displayTotalMessage + correctTotalAmount); // Displays "Your total is $8.0"
    }
}