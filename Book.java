
public class Book extends Material {
    private String genre;

    public Book() {

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        String str = "****Z-BOOK****" + "\n";
        str += super.toString();
        str += "Book genre: " + this.genre + "\n";
        str += "****K-BOOK****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZB*" + "\n";
        str += super.storeDescription();
        str += this.genre + "\n";
        str += "KB*";
        return str;
    }
}