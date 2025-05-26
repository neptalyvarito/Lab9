
package lab9;

import java.util.ArrayList;
import java.util.List;

public class MiembroFamilia extends Lab9 implements Usuario{
    
    private String nombre;
    private String parentesco;
    private String user;    
    private String contraseña;
    private List<Dispositivo> listaDispositivos;
    private List<MiembroFamilia> listaFamiliares;
    
    public MiembroFamilia(String nombre, String parentesco, String user, String contraseña){
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.contraseña = contraseña;
        this.user = user;

    }
    @Override
    public void prenderDispositivo(Dispositivo dispositivo) {
       escribirConsola("Usuario " + this.nombre +" está prendiendo "+ dispositivo.getNombre());
    }
    @Override
    public void apagarDispositivo(Dispositivo dispositivo) {
       escribirConsola("Usurio " + this.nombre + " está apagando " + dispositivo.getNombre());
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public List<Dispositivo> getListaDispositivo(){
        return this.listaDispositivos;
    }
    public void setListaDispositivo(List<Dispositivo> LISTADISPO){
        this.listaDispositivos = LISTADISPO;
    }
    public List<MiembroFamilia> getListaFamiliares(){
        return this.listaFamiliares;
    }
    public void setListaFamiliares(List<MiembroFamilia> LISTAFAM){
        this.listaFamiliares = LISTAFAM;
    }
    public String getUser(){
        return this.user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
}
