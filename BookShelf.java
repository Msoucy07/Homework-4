import java.util.ArrayList;

public class BookShelf {
    public String firstCharTitle;
    static Books book1 = new Books("title", "genre");    
    
    ArrayList<Books> bookshelf = new ArrayList<Books>(8);
    
        
        public BookShelf(String firstCharTitle){
            this.firstCharTitle = firstCharTitle;
            ArrayList<Books> bookshelf = new ArrayList<Books>(8);
    
        }
    
        public void addBook(Books Book){
           if (Book.title.startsWith(firstCharTitle)){
                bookshelf.add(Book);
           }
           else{
                return;
           }  
        }

        public void removeBook(Books Book){
            bookshelf.remove(Book);
        }

    String books = "";
    @Override
    public String toString(){
        for (int i = 0; i < bookshelf.size(); i++){
            books += bookshelf.get(i) + " ";
           
        }
            
            if (bookshelf.isEmpty() == true){
                return "Empty";
            }

        return books + "";
    }
}
