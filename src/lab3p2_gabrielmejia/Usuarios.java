/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielmejia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Usuarios {

    private String nombreCompleto, nombreUsuario, password;

    private ArrayList<String> nombreGrupos = new ArrayList<>();
    private HashMap<String, ArrayList> mapaMensajes = new LinkedHashMap<>();



    public enum TipoDeUsuario {
        DIRECTIVO, EMPLEADO
    }

}
