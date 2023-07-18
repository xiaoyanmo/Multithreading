package test.run;

import test.MyObject;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * 编译之后的target文件
 */
public class SaveAndRead {

    public static void main(String[] args) throws URISyntaxException {
        SaveAndRead saveAndRead = new SaveAndRead();
        URL resourceUrl = saveAndRead.getClass().getClassLoader().getResource("myObjectFile.txt");
        try {
            MyObject myObject = MyObject.getInstance();
            assert resourceUrl != null;
            FileOutputStream fosRef = new FileOutputStream(new File(resourceUrl.toURI()));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File(resourceUrl.toURI()));
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject) iosRef.readObject();
            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
