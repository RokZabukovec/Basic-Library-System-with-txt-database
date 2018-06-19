import java.util.*;
import java.io.*;

public class Material {

    private int ISBN;
    private String author;
    private int year;
    private String title;

    public void Gradivo() {
        author = new String();
    }

    /**
     * Indicates that a method declaration is intended to override a method
     * declaration in a supertype.
     */
    @Override
    public String toString() {
        String str = "";
        str += "ISBN: " + this.ISBN + "\n";
        str += "Title: " + this.title + "\n";
        str += "Author: " + this.author + "\n";
        str += "Year: " + this.year + "\n";
        return str;
    }

    // string format for writting to a file
    public String storeDescription() {
        String str = "";
        str += this.ISBN + "\n";
        str += this.title + "\n";
        str += this.author + "\n";
        str += this.year + "\n";
        return str;
    }

    /** Set methods for easier setup */
    public void setIsbn(int isbn) {
        this.ISBN = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get methods for retreiving properties of an object
     */
    public int getISBN() {
        return this.ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }
}