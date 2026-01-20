package generics;

abstract class Category {
    abstract String getName();
}

class BookCategory extends Category {
    String getName() { return "Books"; }
}

class ClothingCategory extends Category {
    String getName() { return "Clothing"; }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void show() {
        System.out.println(name + " | " + category.getName() + " | ₹" + price);
    }
}

class DiscountUtil {
    static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}

public class MarketplaceDemo {
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        DiscountUtil.applyDiscount(book, 10);
        book.show();
    }
}

