/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion7.Entidades;

import java.util.List;

/**
 *
 * @author arodr
 */
public class Medico {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
    private String nombre;
    private String CMP;

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
    private List<String> especialidades;
    
    public String getTexto(){
        
        String especs="";
        if(especialidades!=null){
            for(String es : especialidades){
                especs+=", "+es;
            }
        }
        return "Nombre: " + nombre + "CMP: " + CMP + "ESP:  " + especs;
    }
    
}
