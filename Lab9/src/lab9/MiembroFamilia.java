
package lab9;

import java.util.ArrayList;
import java.util.List;

public class MiembroFamilia extends Lab9 implements Usuario{
    
    private String nombre;
    private String parentesco;
    private List<Dispositivo> LISTADISPOSITIVO;
    private List<MiembroFamilia> LISTAFAMILIARES;
    
    public MiembroFamilia(String nombre, String parentesco,List<Dispositivo> LISTADISPOSITIVO,  List<MiembroFamilia> LISTAFAMILIARES ){
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.LISTADISPOSITIVO = LISTADISPOSITIVO;
        this.LISTAFAMILIARES = LISTAFAMILIARES;
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
        return this.LISTADISPOSITIVO;
    }
    public void setListaDispositivo(List<Dispositivo> LISTADISPO){
        this.LISTADISPOSITIVO = LISTADISPO;
    }
    public List<MiembroFamilia> getListaFamiliares(){
        return this.LISTAFAMILIARES;
    }
    public void setListaFamiliares(List<MiembroFamilia> LISTAFAM){
        this.LISTAFAMILIARES = LISTAFAM;
    }
    
}
