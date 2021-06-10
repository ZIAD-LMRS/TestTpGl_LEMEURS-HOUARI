/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.rebot;



/**
 *
 * @author User
 */
public class DirectionUp extends State{

     public DirectionUp(Rebot rebot ) {
        super(rebot);
        super.rebot.setMark("A");
    }
     @Override
    public void move() {
        if(rebot.getX()>0)
       if(rebot.getPlace(rebot.getX()-1, rebot.getY())==0){
           rebot.setX(rebot.getX()-1);
           super.rebot.setMark("A");
           
       }
       
    }

    @Override
    public void moveUp() {
        
    }

    @Override
    public void moveDown() {
        
    }

    @Override
    public void moveLeft() {
       super.rebot.setState(new DirectionLeft(rebot));
    }

    @Override
    public void moveRight() {
       super.rebot.setState(new DirectionRight(rebot));
    }
    
    
}
