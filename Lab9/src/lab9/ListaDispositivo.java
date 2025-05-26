/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.List;
import java.util.ArrayList;

public class ListaDispositivo {
    
    public static List<Dispositivo> LISTA = new ArrayList<>();
    
    public static void agregarDispositivo(Dispositivo disposi){
        LISTA.add(disposi);
    }
    public static void eliminarDispositivo(String busqueda){
        int contador = 0;
        for(Dispositivo dispositivo : LISTA){
            if(dispositivo.getNombre().equals(busqueda)){ 
                
                LISTA.remove(contador);
                break;
            }
            contador ++;
        }
     
        for(MiembroFamilia busquedaFam : Lab9.user.getListaFamiliares()){
            contador = 0;
                for(Dispositivo dispositivo : busquedaFam.getListaDispositivo()){
                    if(dispositivo.getNombre().equals(busqueda)){
                    busquedaFam.eliminarDispositivo(contador);
                    }
                contador ++;
                }
            }
        }
    
    public static List<Dispositivo> getLista(){
        return LISTA;
    }
    public static Dispositivo buscarDispositivo(String nombre){
        for(Dispositivo dis : ListaDispositivo.getLista()){
            if(dis.getNombre().equals(nombre)) return dis;    
        }
        return null;
    }
}
