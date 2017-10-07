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
    int capacidad;
    ImageIcon imagen;
    boolean disponibilidad;
    String horamax;
    String horamin;
    ArrayList <String> fechas;
    
public boolean estaDisponible(String fecha){
    for (String a:fechas){
        if (a==fecha) {
            return false;
        }
    }
    return true;
}
    public Sala(int capacidad, String imagen, boolean disponibilidad, String horamax, String horamin) {
        this.capacidad = capacidad;
        this.imagen = new ImageIcon(imagen);
        this.disponibilidad = disponibilidad;
        this.horamax = horamax;
        this.horamin = horamin;
        this.fechas = new ArrayList();
    }
    
}
