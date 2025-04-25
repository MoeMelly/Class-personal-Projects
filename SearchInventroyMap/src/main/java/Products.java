public class Products {
    String name;
    double price;
    int id;






    public Products(int id, double price, int id1, double price1, String name) {
        this.id = id;
        this.price = price;
        this.id = id1;
        this.price = price1;
        this.name = name;
    }

    public Products(int id, String name, double price) {
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
