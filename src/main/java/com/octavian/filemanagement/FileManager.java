package com.octavian.filemanagement;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //createTheFileIfItDoesNotExist(File file).
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The File already exists");
        } else {
            System.out.println("The file does not exist, it has to be created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception :  " + e.getMessage());
                ;
            }
        }

    }

    /* informIfTheFileExists(File file). */
    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else System.out.println("The file does not exists");

    }

    //PrintTheFileName.
    public static void printTheFileName(File file) {
        System.out.println("The file name is :" + file.getName());
    }

    //PrintTheFileAbsolutePath(File file).
    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolute path is " + file.getAbsolutePath());
    }

    //PrintIfTheFileIsADirectory(File file).
    public static void printIfTheFileIsADirectory(File inputfile) {
        System.out.println("The file is a directory: " + inputfile.isDirectory());
//       if(file.isDirectory()){
//           System.out.println("The file is a directory");
//       }else {
//            System.out.println("This is not a directory");
//        }
    }

    // deleteIfTheFileExists(File file).
    public static void deleteIfTheFileExists(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("The file is deleted");
            } else {
                System.out.println("The file exists, but not deleted");
            }
        } else {
            System.out.println("The file does not exists");
        }


    }
}




