
package lab9;

import java.util.ArrayList;
import java.util.List;
import static lab9.ListaDispositivo.LISTA;

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
    public void eliminarDispositivo(int indice){
        listaDispositivos.remove(indice);
    }
    @Override
    public String prenderDispositivo(Dispositivo dispositivo) {
       return "Usuario " + this.nombre +" está prendiendo "+ dispositivo.getNombre();
    }
    
    @Override
    public String apagarDispositivo(Dispositivo dispositivo) {
       return "Usurio " + this.nombre + " está apagando " + dispositivo.getNombre();
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
    public void agregarFamiliar(MiembroFamilia mf){
        if(this.listaFamiliares == null){
            this.listaFamiliares = new ArrayList<>();
        }
        this.listaFamiliares.add(mf);
    }
     public void eliminarFamiliar(MiembroFamilia mf){
        this.listaFamiliares.add(mf);
    }
    public void agregarDispositivo(Dispositivo dispositivo){
        if(this.listaDispositivos == null){
            this.listaDispositivos = new ArrayList<>();
        }
        this.listaDispositivos.add(dispositivo);
    }
}
