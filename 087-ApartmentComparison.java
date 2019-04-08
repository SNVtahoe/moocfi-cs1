public class Main {
  public static void main(String[] args) {
    Apartment studioManhattan = new Apartment(1, 16, 5500);
    Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
    Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

    System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn)); // false
    System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn)); // true
  }
}

/*
 * public class Apartment { private int rooms; private int squareMeters; private
 * int pricePerSquareMeter;
 * 
 * public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
 * this.rooms = rooms; this.squareMeters = squareMeters;
 * this.pricePerSquareMeter = pricePerSquareMeter; }
 * 
 * public boolean larger(Apartment otherApartment) { return this.squareMeters >
 * otherApartment.squareMeters; }
 * 
 * public int priceDifference(Apartment otherApartment) { return
 * Math.abs((this.pricePerSquareMeter * this.squareMeters) -
 * (otherApartment.pricePerSquareMeter * otherApartment.squareMeters)); }
 * 
 * public boolean moreExpensiveThan(Apartment otherApartment) { int currentPrice
 * = this.pricePerSquareMeter * this.squareMeters; int otherPrice =
 * otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
 * 
 * return currentPrice > otherPrice; } }
 */