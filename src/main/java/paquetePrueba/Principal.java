/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrueba;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Roderick
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        //ImagenMatriz im = new ImagenMatriz();
        //im.guardarArchivo(im.aplanarMatriz(im.leerMatriz()));
        
        Ventana v1 = new Ventana();
        /*LeerArchivos LA = new LeerArchivos();
        File archivoprueba = new File("");
        String rutaarchivoprueba = archivoprueba.getAbsolutePath() + "\\imagenes";
        File archivofinal = new File(rutaarchivoprueba);
        LA.mostrarArray(LA.leerCarpeta(archivofinal));*/
        
        /*Ejecutar ejec = new Ejecutar();
        ejec.executeTrain();
        ejec.executeTest();*/
        
        /*RN prob = new RN(false,784,500,200,70,25,10);
        prob.entrenamiento_file("train_x.csv", "train_y.csv", 30);
        prob.guardaPesos();*/
        
        //Test prueba = new Test(784,500,200,70,25,10);
        //System.out.printf("%.2f\n",prueba.accuracy("test_x.csv","test_y.csv",5000));
        //System.out.printf("%.2f\n",prueba.accuracy("train_x.csv","train_y.csv",10000));
        //prueba.mostrarPrimerPeso();
        //prueba.mostrarSalidas();
    }
}
