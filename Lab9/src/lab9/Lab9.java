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
    
    public static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        new LogIn().setVisible(true);
    }
    
    public static void escribirConsola(String text){
        System.out.println(text);
    }
    public static String leerConsola(){
        return sn.nextLine();
    }
}
