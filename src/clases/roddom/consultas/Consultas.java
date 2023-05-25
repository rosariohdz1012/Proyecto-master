package clases.roddom.consultas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Consultas {

    public static void Consultar() {
        Scanner obj = new Scanner(System.in);
        int eleccion;
        System.out.println("----CONSUTAR----");
        System.out.println("----Selecciona una opción----");
        System.out.println("1.Números Activados\n2.Información del usuario");
        eleccion=obj.nextInt();
        if(eleccion>=1 && eleccion<=2) {
            switch (eleccion) {
                case 1 -> {
                    System.out.println("---NúMEROS ACTIVADOS---");

                        File archivo = null;
                        FileReader fr = null;
                        BufferedReader br = null;

                        try {
                            archivo = new File("registroactivacion.txt");
                            fr = new FileReader(archivo, Charset.forName("UTF-8"));
                            br = new BufferedReader(fr);
                            String linea;
                            while ((linea = br.readLine()) != null)
                                System.out.println(linea);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (null != fr) {
                                    fr.close();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    case 2 ->{
                        System.out.println("---INFORMACION USUARIOS");

                            File archivo = null;
                            FileReader fr = null;
                            BufferedReader br = null;

                            try {
                                archivo = new File("registrousuario.txt");
                                fr = new FileReader(archivo, Charset.forName("UTF-8"));
                                br = new BufferedReader(fr);
                                String linea;
                                while ((linea = br.readLine()) != null)
                                    System.out.println(linea);
                            } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                try {
                                    if (null != fr) {
                                        fr.close();
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                        default -> {
                            System.out.println("Ingrese una opcion correcta");
                        }
                    }
                }
            }
        }


