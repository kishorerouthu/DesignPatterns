package com.csstack.dp.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kishore Routhu on 16/7/17 2:55 PM.
 */
public class BookShop implements Cloneable {

    private String shopName;
    private List<Book> books;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<Book>();
        }
        return books;
    }

    public void loadData() {
        for (int i = 1; i <= 5; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book" + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.getBooks().addAll(this.getBooks());
        return shop;
    }
}
