package bridge;

public class Circle implements Shape{
    private DrawingApi drawingApi;

    public Circle(DrawingApi drawingApi){
        this.drawingApi = drawingApi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle ");
        drawingApi.drawShape();
    }
}
