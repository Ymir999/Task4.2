package Task42;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.getProducts(100));
        System.out.println(shop.containsProduct("ice Cream"));
        System.out.println(shop.findTheCheapest());
    }
}
