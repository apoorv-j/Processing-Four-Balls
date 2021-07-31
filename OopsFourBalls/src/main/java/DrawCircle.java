import processing.core.PApplet;

public class DrawCircle{
    private PApplet applet;
    private float x;
    private float y;
    private float extent;
    private int speed;

    public DrawCircle(PApplet applet,float x, float y, float extent, int speed) {
        this.applet = applet;
        this.x = x;
        this.y = y;
        this.extent = extent;
        this.speed = speed;
    }
    void moveCircleFromLeftToRight()
    {
        paint();
        animate();
    }
    void paint()
    {
        applet.ellipse(x,y,extent,extent);
    }
    void animate()
    {
        x+=speed;
    }
}
