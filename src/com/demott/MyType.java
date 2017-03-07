package com.demott;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyType implements Serializable {

    private static final long serialVersionUID = -8737842418024012979L;

    @Override
    public String toString() {
        return "This is a MyType";
    }

    public static void main(String[] args) {
        try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("myType.ser"))) {
            outStream.writeObject(new MyType());
            outStream.flush();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}