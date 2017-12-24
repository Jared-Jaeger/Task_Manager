
package model;

public class Books {

    private int bookID;
    private String title;
    private String author;
    private int pages;
    private String addedBy;

    
    public Books() {
        this.bookID = 0;
        this.title = "";
        this.author = "";
        this.pages = 0;
        this.addedBy = "";
    }
    
    public Books(int bookID, String title, String author, int pages, String addedBy) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.addedBy = addedBy;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    @Override
    public String toString() {
        return "Books{" + "bookID=" + bookID + ", title=" + title + ", author=" + author + ", pages=" + pages + ", addedBy=" + addedBy + '}';
    }
    

}
