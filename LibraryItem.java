public class LibraryItem {
    private String title, borrowLimit;
    private int idNumber, productionYear;

    public LibraryItem(String title, int idNumber, int productionYear, String borrowLimit) {
        this.title = title;
        this.idNumber = idNumber;
        this.productionYear = productionYear;
        this.borrowLimit = borrowLimit;
    }

    public String getTitle() {
        return title;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getBorrowLimit() {
        return borrowLimit;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public void setBorrowLimit(String borrowLimit) {
        this.borrowLimit = borrowLimit;
    }
}