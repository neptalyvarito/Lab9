
package lab9;


public class Dispositivo {
    
    private String nombre;
    private String uso;
    private String estado = "apagado";
    
    public Dispositivo(String nombre, String uso){
        this.nombre = nombre;
        this.uso = uso;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getUso(){
        return this.uso;
    }
    public void setUso(String uso){
        this.uso = uso;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
