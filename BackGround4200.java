import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class BackGround4200 extends Applet
{
String str=" Background color window";
public void init()
{
setSize(400,150);
setBackground(Color.pink);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString(str,60,50);
}
}
/*
 <applet code="BackGround4200.class" height=200 width=320>
 </applet>
 */
