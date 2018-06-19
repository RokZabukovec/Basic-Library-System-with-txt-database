
public class Video extends Material {
    private int length;
    private String genre;

    public Video() {

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLength(int numOfMinutes) {
        this.length = numOfMinutes;
    }

    public String getGenre(String genre) {
        return this.genre;
    }

    public int getLength(int length) {
        return this.length;
    }

    @Override
    public String toString() {
        String str = "****Z-VIDEO****" + "\n";
        str += super.toString();
        str += "Movie genre: " + this.genre + "\n";
        str += "Movie length: " + this.length + " min" + "\n";
        str += "****K-VIDEO****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZV*" + "\n";
        str += super.storeDescription();
        str += this.genre + "\n";
        str += this.length + "\n";
        str += "KV*";
        return str;
    }

}