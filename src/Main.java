// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle");

        circle.display();

        System.out.println("------------------");

        Diamond diamond = new Diamond("Diamond");

        diamond.display();

        System.out.println("------------------");

        Oval oval = new Oval("Oval");

        oval.display();

        System.out.println("------------------");

        Pentagon pentagon = new Pentagon("Pentagon");

        pentagon.display();

        System.out.println("------------------");

        Quad quad = new Quad("Quad");

        quad.display();

        System.out.println("------------------");

        Rhombus rhombus = new Rhombus("Rhombus");

        rhombus.display();

        System.out.println("------------------");

        Triangle triangle = new Triangle("Triangle");

        triangle.display();

        System.out.println("------------------");

        GiveColor colorShape = new GiveColor(Colors.WHITE);
        colorShape.changeColor();

    }
}