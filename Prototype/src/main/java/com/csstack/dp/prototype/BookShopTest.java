package com.csstack.dp.prototype;

/**
 * @author Kishore Routhu on 16/7/17 2:56 PM.
 */
public class BookShopTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop1 = new BookShop();
        shop1.setShopName("Himalaya");
        shop1.loadData();

        BookShop shop2 = shop1.clone();
        shop2.setShopName("Jyothi Books");
        shop2.getBooks().remove(1);

        System.out.println(shop1);
        System.out.println(shop2);
    }
}
