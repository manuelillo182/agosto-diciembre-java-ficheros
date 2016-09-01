/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author teto_
 */
public class Prueba_ficheros {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw;//buffer de escritura
        String so = System.getProperty("os.name");//obtiene la version de sistema operativo
        CharSequence cs = "win";//secuencia de caracteres para comparar version SO
        so = so.toLowerCase();//convierte a minusculas
        File carpeta;//variable para crear carpeta
        File archivo;//variable para crear archivo

        if (so.contains(cs)) {//version windows
            carpeta = new File(File.separator + "ficheros_checador" + File.separator);//asignamos ruta en raiz
            if (carpeta.exists()) {//si existe la carpeta
                archivo = new File(File.separator + "ficheros_checador" + File.separator + "checador_ip.txt");
                if (!archivo.exists()) {//si no existe el archivo
                    try {
                        archivo.createNewFile();//creamos archivo
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.toString());
                    }
                }
                archivo = new File(File.separator + "ficheros_checador" + File.separator + "checador_log.txt");
                if (!archivo.exists()) {//si no existe el archivo
                    try {
                        archivo.createNewFile();//creamos archivo
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.toString());
                    }
                }
            } else {
                carpeta.mkdir();//crear carpeta con ruta
                
                archivo = new File(File.separator + "ficheros_checador" + File.separator + "checador_ip.txt");
                try {
                    archivo.createNewFile();//creamos archivo
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.toString());
                }
                
                archivo = new File(File.separator + "ficheros_checador" + File.separator + "checador_log.txt");
                try {
                    archivo.createNewFile();//creamos archivo
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.toString());
                }
            }
        } else {//version linux
            System.out.println("es linux");
        }
    }
}