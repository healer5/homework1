public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapePrinter.printShapeName(circle);

        System.out.println("------------------");

        Shape diamond = new Diamond();
        ShapePrinter.printShapeName(diamond);

        System.out.println("------------------");

        Shape oval = new Oval();
        ShapePrinter.printShapeName(oval);

        System.out.println("------------------");

        Shape pentagon = new Pentagon();
        ShapePrinter.printShapeName(pentagon);

        System.out.println("------------------");

        Shape quad = new Quad();
        ShapePrinter.printShapeName(quad);

        System.out.println("------------------");
        Shape rhombus = new Rhombus();
        ShapePrinter.printShapeName(rhombus);

        System.out.println("------------------");
        Shape triangle = new Triangle();
        ShapePrinter.printShapeName(triangle);

        System.out.println("------------------");

        GiveColor colorShape = new GiveColor(Colors.WHITE);
        colorShape.changeColor();

    }
}