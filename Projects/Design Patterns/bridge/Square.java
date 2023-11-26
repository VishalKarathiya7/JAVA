package bridge;

public class Square implements Shape{
    private DrawingApi drawingApi;

    public Square(DrawingApi drawingApi){
        this.drawingApi = drawingApi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
        drawingApi.drawShape();
    }
}
