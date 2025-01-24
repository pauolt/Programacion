

class product {
    String name;
    int quantity;
    float price;

    void addProduct (String name, float price, int quantity){
        if (price > 0 && quantity > 0) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    boolean sellProduct (int units) {
        if (quantity > units){
            this.quantity -= units;
            return true;
        }
        return false;
    }

    void restockProduct (int units) {
        if (units > 0) {
            this.quantity += units;
        }
    }

    void setPrice (int price) {
        this.price = price;
    }

    void setQuantity (int quantity) {
        this.quantity = quantity;
    }


    String printInfo (){
        return  "Product: " + this.name + "\nPrice: " + this.price + "\nQuantity: " + this.quantity;
    }



}


public class Main {
    public static void main(String[] args){

        product milk = new product();
        product eggs = new product();

        milk.addProduct("milk", 0.75f, 50);
        eggs.addProduct("eggs", 1.20f, 120);

        System.out.println(milk.sellProduct(2));
        System.out.println(milk.sellProduct(48));

        System.out.println(eggs.sellProduct(60));
        System.out.println(eggs.sellProduct(20));
        System.out.println();

        System.out.println(milk.printInfo());
        System.out.println();
        System.out.println(eggs.printInfo());
        System.out.println();

        milk.restockProduct(20);
        eggs.restockProduct(40);

        System.out.println(milk.printInfo());
        System.out.println();
        System.out.println(eggs.printInfo());
        System.out.println();




    }
}