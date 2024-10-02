package Prog03_1;

import java.io.*;

public class BufferedWriterr {
    public static void main(String[] args) {

        /*try{
            File txt = new File("archivo.txt");
            if(!txt.exists()){
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e){
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }*/

        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("archivo.txt"))) {
            bfw.write("Hola, este es un ejemplo de BufferedWriter.");
            bfw.newLine(); // Escribe una nueva línea
            bfw.write("Agregando otra línea de texto.");
            System.out.println("Se ha escrito en el archivo");

            } catch (IOException e) {
            e.printStackTrace();
            }
        try(BufferedReader bfr = new BufferedReader(new FileReader("archivo.txt"))){
            String linea;
            while((linea = bfr.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

