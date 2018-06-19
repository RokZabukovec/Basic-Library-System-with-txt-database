
public class Magazine extends Material {

    private String publishYear;
    private String genre;

    public Magazine() {

    }

    public void setDatePublished(String publishYear) {

        this.publishYear = publishYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDatePublished() {
        return this.publishYear;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        String str = "****Z-MAGAZINE****" + "\n";
        str += super.toString();

        str += "Magazine genre: " + this.genre + "\n";
        str += "****K-MAGAZINE****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZM*" + "\n";
        str += super.storeDescription();
        str += this.genre + "\n";
        str += "KM*";
        return str;
    }
}