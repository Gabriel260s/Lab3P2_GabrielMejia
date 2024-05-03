/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_gabrielmejia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
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

        Map<String, ArrayList<Mensajes>> chat = new HashMap<>();
        Map<String, ArrayList<Usuarios>> grupos = new HashMap<>();
        System.out.println("Bienvenido\n\n1. Crear Usuario\n2.Ingresar  como empleado\n3.Ingresar como administrador\n4.Salir");
        Scanner input = new Scanner(System.in);
        boolean enMenu = true;
        while (enMenu) {
            try {
                System.out.println("Elija una opcion: ");
                int opt = input.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Seleccione una opcion: \n1 .Crear Empleado\n2. Crear directivo");
                        int optCrear = input.nextInt();
                        ArrayList<String> gruposUser = new ArrayList<>();
                        switch (optCrear) {

                            case 1:
                                System.out.println("Ingrese el nombre del empleado: ");
                                String nombreEmp = input.nextLine();
                                System.out.println("Ingrese su nombre de usuario: ");
                                String nombreUserEmp = input.nextLine();
                                System.out.println("Ingrese su contraseña(sin espacios y sin usar el signo ~): ");
                                String password = input.next();
                                Usuarios empleado = new Usuarios(nombreEmp, nombreUserEmp, password, Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, mapaMensajes);
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

    public static boolean validarInicioSecion(String usuario, String contraseña, Usuarios persona) {
        return usuario.equals(persona.getNombreUsuario()) && contraseña.equals(persona.getPassword());
    }

    public static class Mensajes {

        private String receptor;
        private String contenido;

    }

}
