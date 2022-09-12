package Pr1;

public class Book {
    private String title;
    private int numberOfPages;

    public Book(){
        title = "red";
        numberOfPages = 100;
    }
    public Book(String c){
        title = c;
        numberOfPages = 100;
    }
    public Book(int n){
        title = "How to overcome depression";
        numberOfPages = n;
    }
    public Book(String c, int n){
        title = c;
        numberOfPages = n;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public double getNumberOfPages(){
        return numberOfPages;
    }

    public String toString(){
        return this.title + ". " + this.numberOfPages + " pages.";
    }
}
