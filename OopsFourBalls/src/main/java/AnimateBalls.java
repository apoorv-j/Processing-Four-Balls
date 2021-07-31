import processing.core.PApplet;

public class AnimateBalls extends PApplet {

    public static final int HEIGHT = 800;
    public static final int WIDTH = 1000;
    public static final int extent = 20;
    public static final int startX = 0;
    private DrawCircle ball1,ball2,ball3,ball4;

    public static void main(String[] args) {
        PApplet.main("AnimateBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        float ballOneY = HEIGHT / 5f;
        ball1 = new DrawCircle(this, startX, ballOneY, extent, 1);
        ball2 = new DrawCircle(this, startX, ballOneY*2, extent, 2);
        ball3 = new DrawCircle(this, startX, ballOneY*3, extent, 3);
        ball4 = new DrawCircle(this, startX, ballOneY*4, extent, 4);
    }

    @Override
    public void draw() {
        animateBall(ball1);
        animateBall(ball2);
        animateBall(ball3);
        animateBall(ball4);
    }

    private void animateBall(DrawCircle circle)
    {
        circle.moveCircleFromLeftToRight();
    }
}
