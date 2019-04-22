import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjw
 */
public class PersistantArrayList<T extends Serializable> extends ArrayList<T> {
    
    public boolean saveList(String filename) {
        try {
            File f = new File(filename);
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(f));
            fout.writeInt(this.size());
            Object [] values = this.toArray();
            for (Object value : values) {
                fout.writeObject((T)value);
            }
            fout.close();
        } catch (FileNotFoundException e) {
            System.err.println("Unable to open file for writing");
            return false;
        } catch (IOException ex) {
            System.err.println("Unable to open file for writing");
            return false;
        }
        return true;
    }
    
    public boolean loadList(String filename) {
        try {
            File f = new File(filename);
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(f));
            int size = fin.readInt();
            this.clear();
            for (int i = 0; i < size; i++) {
                this.add((T)fin.readObject());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return false;
        } catch (IOException e) {
            System.err.println("File IO Error");
            return false;
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
            return false;
        }
        return true;
    }
    
}