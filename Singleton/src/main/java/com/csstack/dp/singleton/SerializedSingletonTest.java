package com.csstack.dp.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serialization can also cause breakage of singleton property of singleton classes.
 * Serialization is used to convert an object of byte stream and save in a file or send
 * over a network. Suppose you serialize an object of a singleton class. Then if you
 * de-serialize  that object it will create a new instance.
 *
 * To overcome this we need to implement readResolve.
 *
 * @author Kishore Routhu on 16/7/17 11:42 AM.
 */
public class SerializedSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String tmpDirPath = System.getProperty("java.io.tmpdir");
        File file = new File(tmpDirPath, "singleton.txt");
        file.createNewFile();

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        /* Serializing the singleton instance */
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(instanceOne);

        /* De-Serializing the singleton instance */
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        SerializedSingleton instanceTwo = (SerializedSingleton) objectInputStream.readObject();

        System.out.println("Instance-One :: " + instanceOne.hashCode());
        System.out.println("Instance-Two :: " + instanceTwo.hashCode());
    }
}
