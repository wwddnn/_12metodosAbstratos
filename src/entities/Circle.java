package entities;


import entities.enums.Color;

//essa classe circle nao é abstrata, entao ela tem que fazer override do metodo abstrato que tem na classe shape, que é o metodo area.
public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
    }
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
