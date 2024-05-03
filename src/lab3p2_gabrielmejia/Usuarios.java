/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielmejia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabri
 */
public class Usuarios {

    private String nombreCompleto, nombreUsuario, password;
    private ArrayList<String> nombreGrupos = new ArrayList<>();
    private Map<String, ArrayList<String>> mapaMensajes = new LinkedHashMap<>();
 

    public Usuarios(String nombreCompleto, String nombreUsuario, String password) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getNombreGrupos() {
        return nombreGrupos;
    }

    public void setNombreGrupos(ArrayList<String> nombreGrupos) {
        this.nombreGrupos = nombreGrupos;
    }

    public Map<String, ArrayList<String>> getMapaMensajes() {
        return mapaMensajes;
    }

    public void setMapaMensajes(Map<String, ArrayList<String>> mapaMensajes) {
        this.mapaMensajes = mapaMensajes;
    }

    public enum TipoDeUsuario {
        DIRECTIVO, EMPLEADO
    }

}
