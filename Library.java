import java.util.*;
import java.io.*;

public class Library {
    private ArrayList<Material> allMaterial;

    public Library() {
        allMaterial = new ArrayList<Material>();
    }

    // Returns an ArrayList that holds objects of type Material
    public ArrayList<Material> getAllMaterial() {
        return this.allMaterial;
    }

    // adds new Material material to an ArrayList of type Material
    public void addMaterial(Material material) {
        this.allMaterial.add(material);
    }

    // returns size of an ArrayList
    public int getSize() {
        return this.allMaterial.size();
    }

    // delets object from an ArrayList at index i
    public void deleteMaterial(int i) {
        this.allMaterial.remove(i);
    }

}