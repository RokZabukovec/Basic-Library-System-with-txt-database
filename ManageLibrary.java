import java.util.*;

import java.io.*;

public class ManageLibrary {

    private ArrayList<Material> rentReserveReturn;

    public ManageLibrary() {
        rentReserveReturn = new ArrayList<Material>();
    }

    // returns an ArrayList that holds material that is being borrowed
    public ArrayList<Material> managementList() {
        return this.rentReserveReturn;
    }

    public void addmaterial(Material material) {
        this.rentReserveReturn.add(material);
    }

    public int getSize() {
        return this.rentReserveReturn.size();
    }

    public void deleteMaterial(int i) {
        this.rentReserveReturn.remove(i);
    }
}
