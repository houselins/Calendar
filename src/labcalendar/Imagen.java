/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcalendar;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    int x, y;

    public Imagen(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    public void paint(Graphics g, String imagen) {
        ImageIcon Img = new ImageIcon(getClass().getResource(imagen));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
