package pl.imiajd.rajewska;

import java.awt.*;

public class BetterReactangle extends Rectangle {

    public double getPerimeter(){
        return (getHeight() + getWidth()) * 2;
    }

    public double getArea(){
        return getHeight() * getWidth();
    }

    public BetterReactangle(int w, int h){
        //setLocation(0,0);
        //setSize(w, h);
        super(w,h);
    }

}
