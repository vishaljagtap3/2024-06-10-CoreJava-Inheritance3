public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(100, 100, 50);
        c1.draw();
        System.out.println();

        Rect r1 = new Rect(200, 200, 60, 80);
        r1.draw();
        System.out.println();

        Screen.printToScreen(c1);
        System.out.println();

        Screen.printToScreen(r1);
        System.out.println();
    }
}
