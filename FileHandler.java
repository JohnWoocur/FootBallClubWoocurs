import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FileHandler {
    private File file;

    public FileHandler(File file) { // future Gen Type
        this.file = file;
        file.mkdir();

        if (!file.exists()) {
            file.mkdir();
        }
    }

    // destructor

    public Boolean backup(Object object) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
            oos.close();

            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found ...........  manual");
            // if not create file
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOexception ...........  manual");
            e.printStackTrace();
        }
        return false;
    }

    public Object restore() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Object data = (Object) ois.readObject();
            ois.close();

            return data;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new ArrayList<FootballClub>();
    }
}
