/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttriisa010218;

/**
 *
 * @author zeus
 */
public class Pall {
    protected double x;
    protected double y;
    protected double r;
    
    public Pall(double x, double y, double r) {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    
    public Pall(double x, double y) {
        this.x=x;
        this.y=y;
        r = 0;
    }
    
    public Pall() {
        x = 0;
        y = 0;
        r = 0;
    }
    
    
    public double kaugusNullist() {
        return Math.sqrt(x*x+y*y);
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getR() {
        return r;
    }
    
    public double kaugusPallist(Pall teine) {
        double dx=getX()-teine.getX();
        double dy=getY()-teine.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public boolean collision(Pall teine) {
        if(kaugusPallist(teine) <= (getR()+teine.getR())) {
            return true;
        } else return false;
    }
    
    @Override
    public String toString(){
        return "Pall kohal ("+x+", "+y+", "+r+")";
    }
}
