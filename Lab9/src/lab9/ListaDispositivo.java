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
        for(Dispositivo diposi : LISTA){
            if(diposi.getNombre().equals(busqueda)){                
                LISTA.remove(contador);
                break;
            }
            contador ++;
        }
    }
    public static List<Dispositivo> getLista(){
        return LISTA;
    }
}
