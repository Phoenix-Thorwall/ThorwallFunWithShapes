import java.awt.Graphics;

public class Arc extends Shape{
    private int startAngle;
    private int arcAngle;

    public Arc()
    {
        super();
        startAngle = 20;
        arcAngle = 75;
    }

    @Override
    public void draw(Graphics ick)
    {
        ick.setColor(getColor().BLUE);
        ick.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
