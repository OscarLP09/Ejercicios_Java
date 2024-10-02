package Prog03_1;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        // Crear una File

        try {
            File myObj = new File("filename.txt");
            if (myObj.exists()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (RuntimeException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        // Escribir en una File

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("\n Files in Java might be tricky, but it is fun enough! \n");

            myWriter.write("\n Se ha sobreescrito \n");

            myWriter.write("\n Lo ha vuelto a hacer \n");

            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        // Leer una File

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Get File Information

        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File Name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("File does not exist!");


            // Eliminar un archivo

            myObj.delete();

            if(myObj.exists()){
                System.out.println("No se ha eliminado el archivo");
            } else {
                System.out.println("El archivo no existe");
            }

        }
    }
}
