package clases.roddom.operaciones;

import java.io.*;
import java.util.Scanner;

public class Preactivacion {


    public static void preactivacion() {
        {
            Scanner scanner = new Scanner(System.in);
            int lada, numero1, numero2, numero3, numero4, numero5, numero6, numero7;
            File f ;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try{
                f = new File("registroactivacion.txt");


                if(!f.exists()){
                    f.createNewFile();
                }

                fw=new FileWriter(f.getAbsoluteFile(),true);
                bw=new BufferedWriter(fw);

                    System.out.println("Ingrese la lada:");
                    lada = scanner.nextInt();

                    numero1 = (int) (Math.random() * 8);
                    numero2 = (int) (Math.random() * 8);
                    numero3 = (int) (Math.random() * 8);
                    numero4 = (int) (Math.random() * 8);
                    numero5 = (int) (Math.random() * 8);
                    numero6 = (int) (Math.random() * 8);
                    numero7 = (int) (Math.random() * 8);


                    System.out.println("El numero es:");
                    System.out.print("Con lada: " + lada+ " " + numero1 + numero2 + numero3 + " " + numero4 + numero5 + " " + numero6+numero7 + "\n");

                    bw.write("El numero es: " + lada +" "+ numero1+numero2+numero3+" "+numero4+numero5+" "+numero6+numero7 + "\n");



            }catch (IOException e) {
                System.out.println(e);
            }finally {
                try {
                    //Cierra instancias de FileWriter y BufferedWriter
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                        fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}




