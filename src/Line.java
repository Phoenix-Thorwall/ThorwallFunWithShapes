import java.awt.Graphics;

public class Line extends Shape{
    public Line() {
        super();
    }

    @Override
    public void draw(Graphics ick)
    {
        ick.setColor(getColor().BLUE);
        ick.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
    }


}
