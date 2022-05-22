public class TextBook {
    
    private String title, author, publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public TextBook(TextBook textBookToCopy) {
        this.title = textBookToCopy.title;
        this.author = textBookToCopy.author;
        this.publisher = textBookToCopy.publisher;
    }

    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPublisher: " + this.publisher;
    }
}
