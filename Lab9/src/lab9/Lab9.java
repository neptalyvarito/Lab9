/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;
import java.util.Scanner;
/**
 *
 * @author neptaly
 */
public class Lab9 {
    public static MiembroFamilia user = new MiembroFamilia("Alvaro", "Padre", "nepta", "123");
    
    public static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        Dispositivo dis1 = new Dispositivo("Tv", "ParaVerTv");
        Dispositivo dis2 = new Dispositivo("Radio", "Escuchar");
        Dispositivo dis3 = new Dispositivo("Refri", "ParaCongelar");
        ListaDispositivo.agregarDispositivo(dis1);
        ListaDispositivo.agregarDispositivo(dis2);
        ListaDispositivo.agregarDispositivo(dis3);
        user.agregarDispositivo(dis3);
        user.agregarDispositivo(dis2);
        
        MiembroFamilia obj = new MiembroFamilia("Elias", "Hermano", "Elias", "321");
        
        obj.agregarDispositivo(dis2);
        obj.agregarDispositivo(dis1);
        
        user.agregarFamiliar(obj);
        new LogIn(user).setVisible(true);
    }
    
    public static void escribirConsola(String text){
        System.out.println(text);
    }
    public static String leerConsola(){
        return sn.nextLine();
    }
}
