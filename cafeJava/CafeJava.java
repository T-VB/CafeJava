public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (added int for drip to match data type)
        double mochaPrice = 3.5;
        int dripCoffeePrice = 2;
        double lattePrice = 3.25;
        double cappucinoPrice = 4.5;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Alexander Hamilton";
        String customer3 = "Aaron Burr";
        String customer4 = "Eliza";
    
        // Order completions 
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	System.out.println(customer1 + pendingMessage); 
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage + lattePrice*2);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice-dripCoffeePrice));
    }
}
