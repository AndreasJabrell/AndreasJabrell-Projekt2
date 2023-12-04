public class Customer {
    private int itemsBought;
    private double totalSum;

    Customer(int itemsBought, double totalSum) {
        this.itemsBought = itemsBought;
        this.totalSum = totalSum;
    }

    //get+set för köpta varor och total summa
    public int getItemsBought() {
        return itemsBought;
    }

    public void setItemsBought(int itemsBought) {
        this.itemsBought = itemsBought;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    //metod för att lägga till i köpta varor
    void bought() {
        itemsBought += 1;

    }
}
