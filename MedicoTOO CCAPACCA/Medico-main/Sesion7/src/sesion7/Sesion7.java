/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion7;

import java.util.ArrayList;
import java.util.List;
import sesion7.Entidades.Cita;
import sesion7.Entidades.Medico;
import sesion7.Entidades.Paciente;
import sesion7.Pantalla.PantallaListarMedico;

/**
 *
 * @author arodr
 */
public class Sesion7 {

   public static List<Cita> citaGlobal=new ArrayList<>();
   public static List<Medico> medicoGlobal=new ArrayList<>();
   public static List<Paciente> pacienteGlobal=new ArrayList<>();
    public static void main(String[] args) {
        
        PantallaListarMedico pantalla = new PantallaListarMedico();
        pantalla.setVisible(true);
    }
    
}
