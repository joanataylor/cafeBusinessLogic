import java.util.ArrayList;
class CafeUtil {
    int getStreakGoal() {
        int num = 0;
        for(int i = 0; i < 11; i++) {
            num += i;
        }
        return num;
    }

    double getOrderTotal(double[] prices) {
        double total = 0;
        for (double onePrice : prices) {
            total += onePrice;
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + " there are currently " + customers.size() + " in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}