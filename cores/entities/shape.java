package entities;

import entities.color;

public abstract class shape {

    private color color;

    public shape(){   
    }

    public shape(entities.color color) {
        this.color = color;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public abstract double area();
}
