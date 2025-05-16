public class Main {
    public static void main(String[] args) {
        Electronic phone = new Electronic("Смартфон Samsung A55 5G", 33000, 9.1);
        Groceries yogurt = new Groceries("Йогурт", 129, 8.7);
        Clothes skirt = new Clothes("Юбка", 1899, 9.3);
        Customer Egor = new Customer("EgorV111", "Re232321");
        Seller Ruslan = new Seller("Rusl341", "2019G_21T");
        Admin admin = new Admin("Sanabyun", "admin134340");
        Purchase first = new Purchase("Oleg", "12345", "Йогурт", 129, 8.7);
        first.Display();
        People pp = new People("gdfgdf", 48512, "ghgh")
    }
}

interface Product {
    void setProductName(String productName);

    String getProductName();

    void setProductPrice(double productPrice);

    double getProductPrice();

    void setProductRating(double productRating);

    double getProductRating();
}

class Electronic implements Product {
    String productName;
    double productPrice;
    double productRating;

    Electronic(String productName, double productPrice, double productRating) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public double getProductRating() {
        return productRating;
    }
}

class Groceries implements Product {
    String productName;
    double productPrice;
    double productRating;

    Groceries(String productName, double productPrice, double productRating) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public double getProductRating() {
        return productRating;
    }
}

class Clothes implements Product {
    String productName;
    double productPrice;
    double productRating;

    Clothes(String productName, double productPrice, double productRating) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public double getProductRating() {
        return productRating;
    }
}

interface User {
    void setLogin(String login);

    String getLogin();

    void setPassword(String password);

    String getPassword();
}

class Customer implements User {
    String login;
    String password;

    Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Seller implements User {
    String login;
    String password;

    Seller(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Admin implements User {
    String login;
    String password;

    Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Purchase implements Product, User {
    String login;
    String password;
    String productName;
    double productPrice;
    double productRating;

    Purchase(String login, String password, String productName, double productPrice, double productRating) {
        this.login = login;
        this.password = password;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public double getProductRating() {
        return productRating;
    }

    public void Display() {
        System.out.printf("Пользователь %s купил %s", login, productName);
    }
}