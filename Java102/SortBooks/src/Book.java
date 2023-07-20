public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String Author;
    private String yearPublished;

    public Book(String title, int pageCount, String author, String datePublished) {
        this.title = title;
        this.pageCount = pageCount;
        Author = author;
        this.yearPublished = datePublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", Author='" + Author + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                '}';
    }
}
