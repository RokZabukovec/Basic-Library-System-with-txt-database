public class Audio extends Material {
    private String genre;

    public Audio() {
        this.genre = "none";
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    public String getGenre(String genre) {
        return this.genre;
    }

    @Override
    public String toString() {
        String str = "****Z-AUDIO****" + "\n";
        str += super.toString();
        str += "Album genre: " + this.genre + "\n";
        str += "****K-AUDIO****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZA*" + "\n";
        str += super.storeDescription();
        str += this.genre + "\n";
        str += "KA*";
        return str;
    }
}