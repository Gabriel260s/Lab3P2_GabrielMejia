/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_gabrielmejia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Lab3P2_GabrielMejia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(codificar("hola"));
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido\n\n1. Crear Usuario\n2.Ingresar  como empleado\n3.Ingresar como administrador\n4.Salir");
        boolean enMenu = true;
        while (enMenu) {
            try {
                System.out.println("Elija una opcion: ");
                int opt = input.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Seleccione una opcion: \n1 .Crear Empleado\n2. Crear directivo");
                        int optCrear = input.nextInt();
                        switch (optCrear) {
                            case 1:

                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Esa opcion no existe.");
                        }

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Fin del prgroma");
                        enMenu = false;
                        break;
                    default:
                        System.out.println("Esa opcion no existe.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo ingrese numeros validos.");
            }
        }
    }

    public static String codificar(String clave) {
        String claveCifrada = "";
        char letra;
        for (int i = 0; i < clave.length(); i++) {
            letra = (char) (int) (clave.charAt(i) + i);
            claveCifrada += (int) letra;
        }
        
        return claveCifrada;
    }

}
