package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static List<Author> authors = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int choose;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả \n" +
                    "2. Nhập số sách và nhập thông tin các sách \n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sách theo tên tác giả sách \n" +
                    "5. Thoát ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter number of authors:");
                    int numberOfAuthors = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter info of author:");
                    for (int i = 0; i < numberOfAuthors; i++) {
                        System.out.println("Enter info of author " + (i + 1) + " :");
                        authors.add(new Author());
                        authors.get(i).inputData();
                    }

                    break;
                case 2:
                    System.out.println("Enter number of books");
                    int numberOfBook = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter info of book");
                    for (int i = 0; i < numberOfBook; i++) {
                        System.out.println("Enter info of book " + (i + 1) + " :");
                        books.add(new Book());
                        books.get(i).inputData();
                    }
                    break;
                case 3:
                    Collections.sort(books);
                    break;
                case 4:
                    System.out.println("Enter the name-author of book to find:");
                    String findNameAuthor= sc.nextLine();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getAuthor().contains(findNameAuthor))
                            books.get(i).displayData();
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    cont=false;
            }
        } while (cont);
    }
}
