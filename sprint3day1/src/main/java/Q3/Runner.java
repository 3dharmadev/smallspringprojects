package Q3;

public class Runner {
     private DrawShapes shapes;

    public void setShapes(DrawShapes shapes) {
        this.shapes = shapes;
    }

    public void shape(){
        shapes.draw();
    }
}
