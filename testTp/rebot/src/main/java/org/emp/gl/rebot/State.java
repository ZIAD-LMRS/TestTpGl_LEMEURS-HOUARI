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
public abstract class State {
    protected Rebot rebot;

    public State(Rebot rebot) {
        this.rebot = rebot;
    }
    
    public void move(){};
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
    
}
