/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class Ball extends JPanel{
    int playSpaceHeight = 500;
    int playSpaceWidth = 800;
    int ballDia = 20;
    int ballLocationX = playSpaceWidth/2 - ballDia/2;
    int ballLocationY = playSpaceHeight/2 - ballDia/2;
    boolean ballDown = true;
    boolean ballRight = true;
    
    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(ballLocationX, ballLocationY, 20, 20);
        //moveBall();
    }
    
        public void moveBall(){
        if(ballDown==true){
            ballLocationY++;
        }
        else {
            ballLocationY--;
        }
        
        if(ballRight==true){
            ballLocationX++;
        }
        else{
            ballLocationX--;
        }
        
        if(ballLocationY == playSpaceHeight - ballDia){
            ballDown=false;
        }
        
        if(ballLocationY==0){
            ballDown=true;
        }
        
        if(ballLocationX==playSpaceWidth-ballDia-10){
            ballRight=false;
        }
        
        if(ballLocationX==0){
            ballRight=true;
        }  
        repaint();
    }
}
