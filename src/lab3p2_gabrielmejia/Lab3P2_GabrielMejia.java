/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_gabrielmejia;

import java.util.ArrayList;
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
        System.out.println(codificar("HOLA"));
        String Clave = codificar("HOLA");
        System.out.println(decodificar(Clave));
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
                        System.out.println("Ingrese su usuario: ");
                        String usuarioEmp = input.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseñaEmp = input.nextLine();

                        break;
                    case 3:
                        System.out.println("Ingrese su usuario: ");
                        String usuarioDirect = input.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseñaDirect = input.nextLine();
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
        for (int i = 0; i <= clave.length() - 1; i++) {
            letra = (char) (int) (clave.charAt(i) + i);
            if (i == clave.length() - 1) {
                claveCifrada += (int) letra;
            } else {
                claveCifrada += (int) letra + "~";
            }
        }

        return claveCifrada;
    }

    public static String decodificar(String claveCodificada) {
        String claveDescifrada = "";
        String[] partes = claveCodificada.split("~");
        for (int i = 0; i < partes.length; i++) {
            int valorAsci = Integer.parseInt(partes[i]) - i;
            claveDescifrada += (char) valorAsci;
        }
        return claveDescifrada;
    }
    public static boolean validarInicioSecion(String usuario, String contraseña, Usuarios persona){
        if(usuario.equals(persona.getNombreUsuario())&&contraseña.equals(persona.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
