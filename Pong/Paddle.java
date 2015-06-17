/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author PC
 */
class Paddle extends JPanel implements Runnable {
        int vy = 1;
        int paddleY = 20;
        
        public void paintComponent(Graphics g){
            drawPaddle(g);
        }
        public void drawPaddle(Graphics g){
            g.setColor(Color.white);
            g.fillRect(10,paddleY,20,60);
         }
        
        public void movePaddle(){
            if (vy == 1)
                 paddleY++;
            else if (vy == -1)
                 paddleY--;
        }
        
        public void setVy(int vy){
            this.vy = vy;
        }
        
        public void run(){
           // initComponents();
            movePaddle();
            System.out.println("HI");
            this.repaint();
        }
        
        
}
