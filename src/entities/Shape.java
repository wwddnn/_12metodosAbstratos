package entities;

import entities.enums.Color;

//é uma Classe abstrata porque ela tem um metodo chamado 'area' que é abstrato.
public abstract class Shape {

    private Color color;

    public Shape() {
    }
    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    //se meu metodo é abstrato, entao a minha Classe Shape também tem que ser abstrata!
    public abstract double area ();

}
