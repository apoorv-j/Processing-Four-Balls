import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 800;
    public static final float BallOneY = HEIGHT / 5f;
    public static final int WIDTH = 1000;
    public static final int extent = 20;
    public static final int startX = 0;
    public static int BallOneX = startX;
    public static int BallTwoX = startX;
    public static int BallThreeX = startX;
    public static int BallFourX = startX;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        animateCircleOne();
        animateCircleTwo();
        animateCircleThree();
        animateCircleFour();
    }

    private void animateCircleOne() {
        drawCircle(BallOneX, BallOneY, extent);
        BallOneX += 1;
    }

    private void animateCircleTwo() {
        drawCircle(BallTwoX, BallOneY * 2, extent);
        BallTwoX += 2;
    }

    private void animateCircleThree() {
        drawCircle(BallThreeX, BallOneY * 3, extent);
        BallThreeX += 3;
    }

    private void animateCircleFour() {
        drawCircle(BallFourX, BallOneY * 4, extent);
        BallFourX += 4;
    }

    private void drawCircle(float x, float y, float extent) {
        ellipse(x, y, extent, extent);
    }
}
