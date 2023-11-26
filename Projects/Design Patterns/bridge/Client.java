package bridge;

public class Client {
    public static void main(String[] args) {
        DrawingApi drawingApi1 = new DrawingApi1();
        DrawingApi drawingApi2 = new DrawingApi2();

        Shape circle1 = new Circle(drawingApi1);
        Shape square1 = new Square(drawingApi1);

        Shape circle2 = new Circle(drawingApi2);
        Shape square2 = new Square(drawingApi2);
        circle1.draw();
        circle2.draw();

        square1.draw();
        square2.draw();
    }
}
