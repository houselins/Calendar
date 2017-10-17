/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcalendar;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author house
 */
public class Sala {
    String nombre;
    int capacidad;
    ImageIcon imagen;
    boolean disponibilidad;
    String horamax;
    String horamin;
    ArrayList <String> fechas;
    
public boolean estaDisponible(String fecha){
    if (this.fechas.isEmpty()) {
        return true;
    }
    if (fecha.substring(11,15+1).compareTo(horamin)<0||fecha.substring(11,16).compareTo(horamax)>0) {
            return false;
        }
    for (String a:fechas){
        if (a.equalsIgnoreCase(fecha)) {
            return false;
        } 
        if (a.substring(0,2).equals(fecha.substring(0,2)) && ( a.substring(11,16).compareTo(fecha.substring(11,16))<0 || a.substring(13,18).compareTo(fecha.substring(13,18))>0)) {
            return false;
        }
    }
    return true;
}
    public Sala(int capacidad, String imagen, boolean disponibilidad, String horamax, String horamin,String nombre) {
        this.capacidad = capacidad;
        this.imagen = new ImageIcon(imagen);
        this.disponibilidad = disponibilidad;
        this.horamax = horamax;
        this.horamin = horamin;
        this.fechas = new ArrayList();
        this.nombre = nombre;
    }
    
}
