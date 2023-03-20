package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private boolean sex;
    private int year;


    public Author() {
    }

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        //Nhap ma tac gia:
        System.out.println("Enter id of author:");
        this.authorId= Integer.parseInt(sc.nextLine());

        //Nhap ten tac gia:
        System.out.println("Enter name of author:");
        this.authorName = sc.nextLine();

        //Nhap gioi tinh:
        System.out.println("Enter sex of author (true/false):");
        this.sex = Boolean.parseBoolean(sc.nextLine());

        //Nhap nam sinh:
        System.out.println("Enter year-born of author:");
        this.year = Integer.parseInt(sc.nextLine());





    }

    @Override
    public void displayData() {
        System.out.println("Author{" +
                "authorId=" + this.authorId +
                ", authorName='" + this.authorName + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", sex=" + sex +
                ", year=" + year +
                '}';
    }
}
