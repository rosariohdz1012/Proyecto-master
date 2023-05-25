import clases.roddom.consultas.Consultas;
import clases.roddom.infousuario.InfoUsuario;
import clases.roddom.operaciones.Preactivacion;
import clases.roddom.operaciones.RecargaSaldo;

import java.util.Scanner;

public class IniciarSesion {

    public static void inicioSesion() {
        System.out.println("  **ACCESO AL SISTEMA**");
        Scanner datos = new Scanner(System.in);
        int intento, contraseña = 2060, acceso = 0, eleccion, opcion;
        do {
            System.out.println("INGRESA PIN DE SEGURIDAD");
            intento = datos.nextInt();
            if (intento == contraseña) {
                System.out.println("NIP CORRECTO \n ");
                System.out.println("    BIENVENIDO    ");
                do {
                    System.out.println("Selecciona una opcion\n" +
                            " 1.Guardar Usuario,\n " +
                            "2.Activa tu línea,\n " +
                            "3.Recarga Saldo,\n " +
                            "4.Consultas,\n " +
                            "5.Salir,\n ");
                    eleccion = datos.nextInt();
                    switch (eleccion) {
                        case 1 -> {
                            System.out.println("Guardar Usuario");
                            do {
                                InfoUsuario.registro();
                                System.out.println("Agregar Nuevo Usuario 1.SI 2.No");
                                opcion = datos.nextInt();
                            } while (opcion != 2);
                        }
                        case 2 -> {
                            System.out.println("Activa tu línea");
                            Preactivacion.preactivacion();
                        }
                        case 3 -> {
                            System.out.println("Recarga Saldo");
                            RecargaSaldo.Recarga();
                        }
                        case 4 -> {
                            System.out.println("Consultas");
                            Consultas.Consultar();
                        }
                        case 5 -> {
                            System.out.println("Salir");

                        }

                    }
                    acceso = 3;
                }while (eleccion!=5);
                System.out.println("Powered by Console");
                } else{
                    System.out.println("Contraseña incorrecta");
                    acceso = acceso + 1;
                    if (acceso == 3) {
                        System.out.println("¡Accseso restringido!");
                        System.out.println("Supero el limite de intentos");
                    }
                }
            } while (acceso < 3) ;
        }
    }

