package interface_com_abstract.entities;

import interface_com_abstract.enums.Color;

public abstract class AbstractShape implements Shape {
    
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
