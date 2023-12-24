package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //obs sempre declarar a minha lista com o tipo da minha superclasse que é a classe Shape. instancio uma lista com a lista vazia.
        //obs atencao! eu posso sim criar variaveis de colecoes com o tipo abstrato. nesse caso a classe Shape é a classe abstrata.
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + "data: ");
            System.out.print("Rectangle os circle ( r / c ) ? ");
            char rORc = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (rORc == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            }
            else if (rORc == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                list.add(circle);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
