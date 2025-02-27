
public class LibraryTester {
    public static void main(String[] args) {
        Books book1 = new Books("The Heart of the Betrayed", "Crime");
        Books book2 = new Books("Our Hill of Stars", "Fantasy");
        Books book3 = new Books("One of a Kind", "Fiction");
        Books book4 = new Books("The Vision of Roses", "Romance");

        BookShelf bookshelf1 = new BookShelf("O");
        BookShelf bookshelf2 = new BookShelf("T");


        System.out.println(bookshelf1);
        System.out.println(bookshelf2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        bookshelf1.addBook(book1);
        bookshelf2.addBook(book1);
        bookshelf1.addBook(book2);
        bookshelf2.addBook(book2);
        bookshelf1.addBook(book3);
        bookshelf2.addBook(book3);
        bookshelf1.addBook(book4);
        bookshelf2.addBook(book4);

        System.out.println(bookshelf1);
        System.out.println(bookshelf2);

        
}
}
