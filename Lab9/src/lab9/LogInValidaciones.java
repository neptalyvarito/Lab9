/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author neptaly
 */
public class LogInValidaciones {
    
    public static Integer EXISTE(MiembroFamilia mf, String user, String contraseña){
        Integer flag = null;
        if((mf.getUser().equals(user)) && (mf.getContraseña().equals(contraseña))){
            return flag = 1;
        }
        else{
            for(MiembroFamilia bs : mf.getListaFamiliares()){
                if((mf.getUser().equals(user)) && (mf.getContraseña().equals(contraseña))){
                    return flag = 2;
                }
            }
        }
        return flag;
    }
}
