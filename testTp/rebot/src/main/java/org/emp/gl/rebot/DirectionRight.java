/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.rebot;

import java.beans.PropertyChangeEvent;


/**
 *
 * @author User
 */
public class DirectionRight extends State {
        
     public DirectionRight(Rebot rebot ) {
        super(rebot);
        super.rebot.setMark(">");
    }

     @Override
    public void move() {
        if(rebot.getY()<9)
       if(rebot.getPlace(rebot.getX(), rebot.getY()+1)==0){
           rebot.setY(rebot.getY()+1);
           super.rebot.setMark(">");
       }
    }

    @Override
    public void moveUp() {
        rebot.setState(new DirectionUp(rebot));
    }

    @Override
    public void moveDown() {
        rebot.setState(new DirectionDown(rebot));
    }

    @Override
    public void moveLeft() {
      
    }

    @Override
    public void moveRight() {
      
    }

    
}
