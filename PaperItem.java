public class PaperItem extends LibraryItem{
    private int pageCount;
    private String author, publisher;

    public PaperItem(String title, String author, String publisher, int pageCount, int productionYear, int idNumber, String borrowLimit) {
        super(title, productionYear, idNumber, borrowLimit);
        this.pageCount = pageCount;
        this.author = author;
        this.publisher = publisher;
    }

    public int getPageCount()
}