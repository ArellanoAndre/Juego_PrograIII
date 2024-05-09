/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 *
 * @author Arell
 */
public class Personaje {
    int x,y;
    JPanel miJP;
    String dir;

    public Personaje(JPanel miJP) {
        this.miJP = miJP;
        this.x = 20;
        this.y = 180;
    }
    
    
    public void Dibujar(Graphics g,int x, int y, String dir){
    this.x = x;
    this.y = y;
    this.dir = dir;
    ImageIcon MiImagen = new ImageIcon(getClass().getResource(dir));
    g.drawImage(MiImagen.getImage(), x, y, miJP);
    }
    
    public int coordX(){
    return this.x;}
    public int coordY(){
    return y;
    }
    public String Direction(){
    return this.dir;
    }
    
}
