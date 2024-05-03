package lab3p2_gabrielmejia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Usuarios {

    private String nombreCompleto, nombreUsuario, password;
    public ArrayList<String> nombreGrupos;
    public Map<String, ArrayList<Lab3P2_GabrielMejia.Mensajes>> mapaMensajes;
    private TipoDeUsuario tipoDeUsuario; 
    private String Departamento;

  
    public enum TipoDeUsuario {
        DIRECTIVO, EMPLEADO
    }

   
    public Usuarios(String nombreCompleto, String nombreUsuario, String password,String departamento, TipoDeUsuario tipoDeUsuario, ArrayList<String> nombreGrupos, Map<String, ArrayList<Lab3P2_GabrielMejia.Mensajes>> mapaMensajes) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoDeUsuario = tipoDeUsuario;
        this.nombreGrupos = nombreGrupos; 
        this.mapaMensajes = mapaMensajes; 
        this.Departamento= departamento;
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

    public Map<String, ArrayList<Lab3P2_GabrielMejia.Mensajes>> getMapaMensajes() {
        return mapaMensajes;
    }

    public void setMapaMensajes(Map<String, ArrayList<Lab3P2_GabrielMejia.Mensajes>> mapaMensajes) {
        this.mapaMensajes = mapaMensajes;
    }

    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombreCompleto=" + nombreCompleto + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreGrupos=" + nombreGrupos + ", mapaMensajes=" + mapaMensajes + ", tipoDeUsuario=" + tipoDeUsuario + ", Departamento=" + Departamento + '}';
    }

    

}