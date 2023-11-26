package prototype;

public class Client {
    public static void main(String[] args) {
        //Creating first object
        BookShop bookShop = new BookShop("A1");
        bookShop.loadBook();

        //Creating second object and cloning
        BookShop newShop = bookShop.clone();

        //Deleting book form first object
        bookShop.getBookList().remove(2);

        System.out.println(bookShop.getBookList());
        System.out.println(newShop.getBookList());
    }
}
