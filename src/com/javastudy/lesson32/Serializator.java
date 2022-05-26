package com.javastudy.lesson32;

import java.io.*;
import java.util.Objects;

public class Serializator {

    public boolean serialization(Cat cat) {

        boolean flag = false;

        File file = new File("D:/JAVA Projects/Classes and objects/Lesson32_Cat.data");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
           if (fos!=null) {
               oos = new ObjectOutputStream(fos); //принемает объект класса OutputStream
               oos.writeObject(cat);
               flag = true;
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

    public Cat deserialization() throws InvalidObjectException {
        File file = new File("D:/JAVA Projects/Classes and objects/Lesson32_Cat.data");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis!=null) {
                ois = new ObjectInputStream(fis); //принемает объект класса OutputStream
                Cat cat =(Cat) ois.readObject();
                return cat;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail");

    }
}
