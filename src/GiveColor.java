public class GiveColor implements ChangeColor {
    Colors color;

    public GiveColor(Colors color) {
        this.color = color;
    }
    @Override
    public void changeColor() {
        switch(color){
            case BLUE:
                System.out.println("The circle is blue");
                break;
            case YELLOW:
                System.out.println("The diamond is yellow");
                break;
            case RED:
                System.out.println("The oval is red");
                break;
            case GREEN:
                System.out.println("The pentagon is green");
                break;
            case BLACK:
                System.out.println("The quad is black");
                break;
            case ORANGE:
                System.out.println("The rhombus is orange");
                break;
            case WHITE:
                System.out.println("The triangle is white");
                break;
            default:
                System.out.println("We don't have this color");
        }

    }
}
