import java.util.*;

class Product {
    static int nextID;
    int id;
    String descripcion;
    int stock;

    Product(String descripcion, int stock) {
        this.id = nextID++;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public String toString() {
        return "ID: " + id + ", Descripción: " + descripcion + ", Stock: " + stock;
    }

    int getId() {
        return id;
    }
}

class Inventory {
    Map<Integer, Product> inventario = new HashMap<>();

    String createProduct(String descripcion, int stock) {
        Product product = new Product(descripcion, stock);
        inventario.putIfAbsent(product.getId(), product);
        return "Producto añadido correctamente";
    }

    String removeProduct(int ID) {
        if (inventario.containsKey(ID)) {
            inventario.remove(ID);
            return "Producto eliminado correctamente";
        }
        return "No se ha encontrado el producto";
    }

    String addStock(int ID, int add) {
        if (inventario.containsKey(ID)){
            inventario.get(ID).stock += add;
            return "Stock añadido correctamente";
        }
        return "No se ha encontrado el producto";
    }

    String setStock(int ID, int stock) {
        if (inventario.containsKey(ID)){
            inventario.get(ID).stock = stock;
            return "Stock cambiado correctamente";
        }
        return "No se ha encontrado el producto";
    }

    List<Product> listProducts() {
        List<Product> products = new ArrayList<>(inventario.values());
        products.sort((a, b) -> {
            if (a.stock < b.stock){
                return -1;
            }
            return 1;
        });
        return products;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventario = new Inventory();

        while (true) {
            System.out.println("Commands: create, delete, add, set, list, exit");
            String option = scanner.nextLine().trim();

            String d;
            int s;
            int id;
            switch (option) {
                case "create":
                    System.out.print("Description: ");
                    d = scanner.nextLine();
                    System.out.print("Stock: ");
                    s = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(inventario.createProduct(d, s));
                    break;
                case "delete":
                    System.out.print("ID to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(inventario.removeProduct(id));
                    break;
                case "add":
                    System.out.print("Product ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Stock to add: ");
                    s = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(inventario.addStock(id, s));
                    break;
                case "set":
                    System.out.print("Product ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("New stock value: ");
                    s = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(inventario.setStock(id, s));
                    break;
                case "list":
                    List<Product> products = inventario.listProducts();
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
