public class Sale extends Item {

    double discount = 0.9; //10% rabatt på varan

    Sale(String item, double cost, int stock) {
        super(item, cost, stock);
        this.cost = cost * discount;


    }
}
