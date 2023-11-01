package CopyFileText;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream();
            fos = new FileOutputStream();

            int copy;
            while ((copy = fis.read()) != -1){
                fos.write(copy);
            }
            System.out.println("Copies the file successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                fis.close();
            }
            if (fos != null){
                fos.close();
            }
        }
    }
}
