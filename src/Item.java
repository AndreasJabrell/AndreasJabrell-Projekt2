public class Item {
    //deklarerar tre parametrar för våra artiklar, String för namn, double för kostnaden, int för saldo
    String item = "Mask";
    double cost = 235.5;
    int stock = 14;

    //sätter en konstruktor för att få in dem till main klassen
    Item(String item, double cost, int stock) {
        this.item = item;
        this.cost = cost;
        this.stock = stock;
    }

}
