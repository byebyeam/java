public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String regnum;

    public Car(int id, String brand, String model, int year, String color, int price, String regnum) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this. regnum = regnum;
    }
    
    //id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //price
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //regnum
    public String getReNum() {
        return regnum;
    }
    public void setRegNum(String regnum) {
        this.regnum = regnum;
    }
}
