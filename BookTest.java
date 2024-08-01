package lab1;
 class Book {
     String bookName;
     String isbnNumber;
     String authorName;
     String publisher;
     Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }
     String getBookName() {
        return bookName;
    }
     void setBookName(String bookName) {
        this.bookName = bookName;
    }
     String getIsbnNumber() {
        return isbnNumber;
    }
     void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
     String getAuthorName() {
        return authorName;
    }
     void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
     String getPublisher() {
        return publisher;
    }
     void setPublisher(String publisher) {
        this.publisher = publisher;
    }
     String getBookInfo() {
        return "Book Name: " + this.bookName + "\n" +
               "ISBN Number: " + this.isbnNumber + "\n" +
               "Author Name: " + this.authorName + "\n" +
               "Publisher: " + this.publisher;
    }
}
public class BookTest {
    public static void main(String[] args) {
    	Book[] books = new Book[30];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(
                "Book " + (i + 1),
                "ISBN-" + (i + 1000),
                "Author " + (i + 1),
                "Publisher " + (i + 1)
            );
        }
        for (Book book : books) {
            System.out.println(book.getBookInfo());
            System.out.println();
        }
    }
}
