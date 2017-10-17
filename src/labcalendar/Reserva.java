/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcalendar;

/**
 *
 * @author house
 */
public class Reserva {
    Sala sala;
    String fecha;
    public Reserva(Sala sala, String fecha){
        this.sala=sala;
        this.fecha=fecha;
    }
}
