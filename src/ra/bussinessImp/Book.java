package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.run.BookManagement;

import java.util.Scanner;

public class Book implements IShop,Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private String author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, String author, float importPrice, float exportPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        //Nhap ma sach:
        System.out.println("Enter code of book:");
        this.bookId = Integer.parseInt(sc.nextLine());

        //Nhap ten sach:
        System.out.println("Enter name of book:");
        this.bookName = sc.nextLine();

        //Nhap tieu de:
        System.out.println("Enter the title of book:");
        this.title = sc.nextLine();

        //Nhap so trang sach:
        System.out.println("Enter pages of book:");
        this.numberOfPages = Integer.parseInt(sc.nextLine());

        //Nhap gia nhap:
        System.out.println("Enter import price of book:");
        this.importPrice = Float.parseFloat(sc.nextLine());

        //Nhap so luong:
        System.out.println("Enter the numbers of book:");
        this.quantity = Integer.parseInt(sc.nextLine());

        //Nhap trang thai:
        System.out.println("Enter the status of book:");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());

        //Tinh gia xuat:
        this.exportPrice = importPrice * RATE;

        //Chon tac gia:
        System.out.println("Please choose the number of author:");
        for (int i = 0; i < BookManagement.authors.size(); i++) {
            System.out.println(i + 1 + ". " + BookManagement.authors.get(i).getAuthorName());
        }
        int choice = Integer.parseInt(sc.nextLine());
        this.author = BookManagement.authors.get(choice - 1).getAuthorName();
    }

    @Override
    public void displayData() {
        System.out.println("Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                ", bookStatus=" + bookStatus +
                '}');
    }

    @Override
    public int compareTo(Book book) {
        return (int) (this.exportPrice -book.exportPrice);
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", bookName='" + bookName + '\'' +
//                ", title='" + title + '\'' +
//                ", numberOfPages=" + numberOfPages +
//                ", author='" + author + '\'' +
//                ", importPrice=" + importPrice +
//                ", exportPrice=" + exportPrice +
//                ", quantity=" + quantity +
//                ", bookStatus=" + bookStatus +
//                '}';
//    }
}
