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

    public static void main(String[] args) {

        Map<String, ArrayList<Mensajes>> chat = new HashMap<>();
        Map<String, ArrayList<Usuarios>> grupos = new HashMap<>();
        ArrayList<Usuarios> Empleados = new ArrayList<>();
        ArrayList<Usuarios> Directivos = new ArrayList<>();
        ArrayList<String> gruposUser = new ArrayList<>();
        ArrayList<Mensajes> MSG = new ArrayList<>();
        Usuarios usuario1 = new Usuarios("Jose ", "Jose5", codificar("barco"), "IT", Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, chat);
        Usuarios usuario2 = new Usuarios("Juan ", "Juan2", codificar("avion"), "IT", Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, chat);
        Empleados.add(usuario2);
        Empleados.add(usuario1);
        Usuarios directivo1 = new Usuarios("Carlos", "Carlos5", codificar("gato"), "IT", Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, chat);
        Usuarios directivo2 = new Usuarios("Pablo", "Pablo8", codificar("perro"), "IT", Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, chat);
        Directivos.add(directivo1);
        Directivos.add(directivo2);
        Scanner input = new Scanner(System.in);
        boolean enMenu = true;
        try {
            while (enMenu) {

                System.out.println("Elije una opcion: \n1. Crear Usuario\n2.Ingresar  como empleado\n3.Ingresar como administrador\n4.Salir");
                int opt = input.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Seleccione una opcion: \n1 .Crear Empleado\n2. Crear directivo");
                        int optCrear = input.nextInt();

                        switch (optCrear) {

                            case 1:
                                System.out.println("Ingrese el nombre del empleado: ");
                                input.nextLine();
                                String nombreEmp = input.nextLine();
                                System.out.println("Ingrese su nombre de usuario: ");
                                String nombreUserEmp = input.nextLine();

                                if (nombreEnLista(nombreUserEmp, Empleados) || nombreEnLista(nombreUserEmp, Directivos)) {
                                    System.out.println("Ese nombre de usuario ya existe.");
                                    break;
                                }
                                System.out.println("Ingrese su contraseña(sin espacios y sin usar el signo ~): ");
                                String password = codificar(input.next());
                                System.out.println("Ingrese su departamento: ");
                                input.nextLine();
                                String departamentoEmp = input.nextLine();
                                Usuarios empleado = new Usuarios(nombreEmp, nombreUserEmp, password, departamentoEmp, Usuarios.TipoDeUsuario.EMPLEADO, gruposUser, chat);
                                Empleados.add(empleado);
                                System.out.println("Usuario creado.");
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del empleado: ");
                                String nombreDirec = input.nextLine();
                                System.out.println("Ingrese su nombre de usuario: ");
                                String nombreUserDirect = input.nextLine();
                                if (nombreEnLista(nombreUserDirect, Empleados) || nombreEnLista(nombreUserDirect, Directivos)) {
                                    System.out.println("Ese nombre de usuario ya existe.");
                                    break;
                                }
                                System.out.println("Ingrese su contraseña(sin espacios y sin usar el signo ~): ");
                                String passwordDirect = codificar(input.next());
                                System.out.println("Ingrese su departamento: ");
                                String departamentoDir = input.nextLine();
                                Usuarios directivo = new Usuarios(nombreDirec, nombreUserDirect, passwordDirect, departamentoDir, Usuarios.TipoDeUsuario.DIRECTIVO, gruposUser, chat);
                                Directivos.add(directivo);
                                break;
                            default:
                                System.out.println("Esa opcion no existe.");
                        }

                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Ingrese su usuario: ");
                        String usuarioEmp = input.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseñaEmp = input.nextLine();

                        if (validarInicioSecion(usuarioEmp, contraseñaEmp, Empleados)) {

                            System.out.println("Que le gustaria hacer?\n1.Enviar un mensaje\n2. Ver mis chat\n3.Ver mis grupos");
                            int optUSER = input.nextInt();
                            switch (optUSER) {
                                case 1:

                                    input.nextLine();
                                    System.out.println("Ingrese el nombre de usuario del receptor:");
                                    String receptor = input.nextLine();
                                    System.out.println("Ingrese el contenido del mensaje:");
                                    String contenido = input.nextLine();
                                    Mensajes msj = new Mensajes(receptor, contenido);
                                    MSG.add(msj);
                                    chat.put(receptor, MSG);
                                    System.out.println("Mensaje enviado.");
                                    break;
                                case 2:
                                    if (MSG != null) {
                                        for (Mensajes msg : MSG) {
                                            System.out.println(" Mensaje: " + msg.getContenido());
                                        }
                                    } else {
                                        System.out.println("No tienes mensajes");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Tus grupos son");
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Ingrese su usuario: ");
                        String usuarioDirect = input.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseñaDirect = input.nextLine();
                        if (validarInicioSecion(usuarioDirect, contraseñaDirect, Directivos)) {

                            System.out.println("Que le gustaria hacer?\n1.Enviar un mensaje\n2. Ver mis chat\n3.Ver mis grupos\n4.Agregar un grupo");
                            int optUSER = input.nextInt();
                            switch (optUSER) {
                                case 1:

                                    input.nextLine();
                                    System.out.println("Ingrese el nombre de usuario del receptor:");
                                    String receptor = input.nextLine();
                                    System.out.println("Ingrese el contenido del mensaje:");
                                    String contenido = input.nextLine();
                                    Mensajes msj = new Mensajes(receptor, contenido);
                                    MSG.add(msj);
                                    chat.put(receptor, MSG);
                                    System.out.println("Mensaje enviado.");
                                    break;

                                case 2:
                                    if (MSG != null) {
                                        for (Mensajes msg : MSG) {
                                            System.out.println(" Mensaje: " + msg.getContenido());
                                        }
                                    } else {
                                        System.out.println("No tienes mensajes");
                                    }
                                    break;
                                case 3:
                                    break;
                                case 4:

                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Fin del programa");
                        enMenu = false;
                        break;
                    default:
                        System.out.println("Esa opcion no existe.");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Solo ingrese numeros validos.");
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

    public static boolean nombreEnLista(String Nombre, ArrayList<Usuarios> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombreUsuario().equals(Nombre)) {
                return true;
            }
        }
        return false;
    }

    public static String decodificar(String claveCodificada) {
        String claveDescifrada = "";
        String[] partes = claveCodificada.split("~");
        for (int i = 0; i < partes.length; i++) {
            int valorAscii = Integer.parseInt(partes[i]) - i;
            claveDescifrada += (char) valorAscii;
        }
        return claveDescifrada;
    }

    public static boolean validarInicioSecion(String usuario, String contraseña, ArrayList<Usuarios> usuarios) {
        for (Usuarios persona : usuarios) {
            if (usuario.equals(persona.getNombreUsuario()) && contraseña.equals(decodificar(persona.getPassword()))) {
                return true;
            }
        }
        return false;
    }

    public static class Mensajes {

        private String receptor;
        private String contenido;

        public Mensajes(String receptor, String contenido) {
            this.receptor = receptor;
            this.contenido = contenido;
        }

        public String getReceptor() {
            return receptor;
        }

        public void setReceptor(String receptor) {
            this.receptor = receptor;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

    }

}
