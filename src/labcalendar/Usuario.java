/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcalendar;

import java.util.ArrayList;

/**
 *
 * @author house
 */
public class Usuario {
    String nick;
    String contraseña;
    ArrayList <Reserva> reservas=new ArrayList();
    public Usuario(String nick, String contraseña){
        this.contraseña = contraseña;
        this.nick =  nick;
    }
}
