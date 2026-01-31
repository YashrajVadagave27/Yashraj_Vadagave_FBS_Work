package util;

import java.io.*;

public class FileUtil {

    private static final String FILE = "smarthome.dat";

    public static void save(Object obj) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(obj);
        } catch (Exception e) {}
    }

    public static Object load() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE))) {
            return ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
