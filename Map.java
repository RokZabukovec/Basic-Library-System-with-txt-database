public class Map extends Material {
    private String author;

    public Map() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        String str = "****Z-MAP****" + "\n";
        str += super.toString();
        str += "****K-MAP****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZMAP*" + "\n";
        str += super.storeDescription();
        str += "KMAP*";
        return str;
    }
}