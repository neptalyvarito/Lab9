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
    public static MiembroFamilia buscado = null;
    
    public static Integer EXISTE(MiembroFamilia mf, String user, String contraseña){
        
        Integer flag = null;
        if(mf.getUser() == null || mf.getContraseña() == null) return null;
        
        if((mf.getUser().equals(user)) && (mf.getContraseña().equals(contraseña))){
            buscado = mf;
            return flag = 1;
        }
        for(MiembroFamilia bs : mf.getListaFamiliares()){
            if((bs.getUser().equals(user)) && (bs.getContraseña().equals(contraseña))){
                buscado = bs;
                return flag = 2;
                    
            }
        }
        return flag;
    }
    public static MiembroFamilia getObj(){
        return buscado;
    }
}
