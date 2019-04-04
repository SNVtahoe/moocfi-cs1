public class Main {
  public static void main(String[] args) {
    Product banana = new Product("Banana", 1.1, 13);
    banana.printProduct();
  }
}

/*
 * public class Product { private int amount; private String name; private
 * double price;
 * 
 * public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
 * this.name = nameAtStart; this.price = priceAtStart; this.amount =
 * amountAtStart; }
 * 
 * public void printProduct() { System.out.println(this.name + ", price " +
 * this.price + ", amount " + this.amount); } }
 */