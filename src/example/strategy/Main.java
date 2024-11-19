package example.strategy;


public class Main {

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        Item item = new Item(25);
        Item item2 = new Item(25);
        Item item3 = new Item(25);
        cart.addItem(item);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.setPaymentStrategy(new PaypalPayment("diegoespindola9404@gmail.com", "sad4as04dsa9d4"));
        cart.checkout();

        Item item4 = new Item(25);
        cart.addItem(item4);
        cart.setPaymentStrategy(new CreditCardPayment("Diego", "890523", "000", "10/12/2025"));
        cart.checkout();



    }
}
