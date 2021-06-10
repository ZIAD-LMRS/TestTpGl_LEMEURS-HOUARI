/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.rebot;

import java.beans.PropertyChangeEvent;

import org.emp.gl.timeservice.*;
/**
 *
 * @author User
 */
public class Rebot implements TimerListner{
    int x;int y;
    State state;
    Environement envi;
    
    public Rebot(State state) {
        this.state = state;
    }

    public Environement getEnvi() {
        return envi;
    }

    public void setEnvi(Environement envi) {
        this.envi = envi;
    }

    public Rebot() {
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
     public int getPlace(int i,int j){
         return envi.getPlace(i, j);
     }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        state.move();
    }

    public void moveUp() {
        state.moveUp();
    }

   
    public void moveDown() {
        state.moveDown();
    }

    
    public void moveLeft() {
      state.moveLeft();
    }

    
    public void moveRight() {
      state.moveRight();
    }
    public void setMark(String mark){
        envi.setMark(mark);
    }
}
