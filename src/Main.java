import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //anropar Item och sale klass och sätter värden på alla parametrar
        Item mask = new Item("Mask", 235.5, 14);
        Item knife = new Item("Plastic knife", 45.5, 3);
        Sale blood = new Sale("Fake blood", 95, 44);
        //anropar customer klass och sätter värden till 0 som utgångsläge
        Customer customer = new Customer(0, 0);

        System.out.println("Hi! Welcome to the Halloween store");
        System.out.println("What do you want to today?");

        //scanner för att man ska kunna välja vara eller avsluta handlingen
        Scanner input = new Scanner(System.in);

        //för att veta om allt
        boolean shop = true;

        //do-while loop som fortsätter så länge vi handlar mer
        do {
            //skriver ut alla varor med rätt lagersaldo efter varje loop
            //på priset har jag lagt till .2f, hade många extra nollor från början VARFÖR?
            System.out.printf("1. %s, %.2f SEK, %d left\n", mask.item, mask.cost, mask.stock);
            System.out.printf("2. %s, %.2f SEK, %d left\n", knife.item, knife.cost, knife.stock);
            System.out.printf("3. %s, %.2f SEK, %d left\n", blood.item, blood.cost, blood.stock);
            System.out.println("4. Quit");
            // scanner som hämtar info från användaren om man vill handla mer eller avsluta
            int choice = input.nextInt();

            if (choice == 1) {
                if (mask.stock > 0) {
                    //sparar antal köpta varor
                    customer.bought();
                    //sparas till totalsumman
                    customer.setTotalSum(customer.getTotalSum() + mask.cost);
                    //räknar ner på saldot om man väljer detta alternativ
                    mask.stock -= 1;
                } else {
                    //skriver ut att det inte finns i lager och lägger till en igen för att saldo inte ska hamna på minus
                    System.out.println("I'm sorry, we're out of masks");
                }
            } else if (choice == 2) {
                if (knife.stock > 0) {
                    //sparar antal köpta varor
                    customer.bought();
                    //sparas till totalsumman
                    customer.setTotalSum(customer.getTotalSum() + knife.cost);
                    //räknar ner på saldot om man väljer detta alternativ
                    knife.stock -= 1;
                } else {
                    //skriver ut att det inte finns i lager och lägger till en igen för att saldo inte ska hamna på minus
                    System.out.println("I'm sorry, we're out of knives");
                }
            } else if (choice == 3) {
                if (blood.stock > 0) {
                    //sparar antal köpta varor
                    customer.bought();
                    //sparas till totalsumman
                    customer.setTotalSum(customer.getTotalSum() + blood.cost);
                    //räknar ner på saldot om man väljer detta alternativ
                    blood.stock -= 1;
                } else {
                    //skriver ut att det inte finns i lager och lägger till en igen för att saldo inte ska hamna på minus
                    System.out.println("I'm sorry, we're out of fake blood");
                }
            } else if (choice == 4) {
                //do-while loopen avslutas då shop är false
                shop = false;
            }
        }
        while (shop);
        //lägg till detta som en metod istället för att ha det i koden
        System.out.printf("You purchased a total of %d items. Total sum %.2f SEK\n\n", customer.getItemsBought(), customer.getTotalSum());
    }

}