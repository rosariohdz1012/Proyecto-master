package clases.roddom.infousuario;

import java.io.*;
import java.util.Scanner;

public class InfoUsuario {

    public static void registro(){
        Scanner obj=new Scanner(System.in);
        String nombre;
        String apellidos;
        String correo;
        String datos;
        File f = null ;
        FileWriter fw=null;
        BufferedWriter bw = null;
        try{
            f = new File("registrousuario.txt");

            if(!f.exists()){
                f.createNewFile();

            }

            fw = new FileWriter(f.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);

                System.out.println("Ingrese nombre de usuario");
                nombre = obj.nextLine();
                System.out.println("Ingrese Apellidos del usuario");
                apellidos = obj.nextLine();
                System.out.println("Ingrese correo del usuario");
                correo = obj.nextLine();
                datos = nombre + " " + apellidos + " " + correo;

                bw.write("Usuario:" + " " + datos + "\n");

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
