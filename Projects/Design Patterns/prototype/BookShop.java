package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String bookShopName;
    private List<Book> bookList;

    public BookShop(String name){
        this.bookShopName = name;
        bookList = new ArrayList<>();
    }

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBook(){
        for (int i=0;i<10;i++){
            Book book = new Book("Book",i);
//            System.out.println(book);
            bookList.add(book);
        }
    }
    public BookShop clone(){
        BookShop shop = new BookShop("A2");
        for (int i = 0;i<this.bookList.size();i++){
            shop.bookList.add(this.bookList.get(i));
        }
        return shop;
    }


}
