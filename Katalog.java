public class Katalog extends Material {
    private int stSkatelj;
    private int stKartic;

    public Katalog() {
        this.stSkatelj = 0;
        this.stKartic = 0;
    }

    public void setStSkatelj(int st) {
        this.stSkatelj = st;
    }

    public int getStSkatelj() {
        return this.stSkatelj;
    }

    public void setStKartic(int st) {
        this.stKartic = st;
    }

    public int getStKartic() {
        return this.stKartic;
    }

    public int vseKartice(int stSkatelj, int stKartic) {
        int sum = stSkatelj * stKartic;
        return sum;
    }

    @Override
    public String toString() {
        String str = "****Z-KATALOG****" + "\n";
        str += "Število škatelj: " + this.stSkatelj + "\n";
        str += "Število kartic v škatlji: " + this.stKartic + "\n";
        str += "Število vseh kartic: " + this.vseKartice(stSkatelj, stKartic) + "\n";
        str += "****K-KATALOG****" + "\n";
        return str;
    }

    public String storeDescription() {
        String str = "ZK*" + "\n";
        str += this.stSkatelj + "\n";
        str += this.stKartic + "\n";
        str += this.vseKartice(stSkatelj, stKartic) + "\n";
        str += "KK*";
        return str;

    }
}