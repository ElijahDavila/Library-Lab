public class PaperItem extends LibraryItem{
    private int pageCount;
    private String author, publisher;

    public PaperItem(String title, String author, String publisher, int pageCount, int productionYear, int idNumber, String borrowLimit) {
        super(title, productionYear, idNumber, borrowLimit);
        this.pageCount = pageCount;
        this.author = author;
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}