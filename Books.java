public class Books {
    public String title;
    public String genre;
    

    public Books(){ 
        title = "title";
        genre = "genre";

    }

    public Books(String title, String genre){
        this.title = title;
        this.genre = genre;

    }

    @Override
    public String toString(){
        return title + "   ";

    }

}
