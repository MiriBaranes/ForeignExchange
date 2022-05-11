import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.function.Supplier;

public class BasicPanel extends JPanel {
    private ImageIcon imageIcon;

    public BasicPanel(int x, int y, int w, int h, Color color,String filename) {
        this.setBounds(x, y, w, h);
        this.setBackground(color);
        this.imageIcon=new ImageIcon(filename);
        init();
    }
protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.imageIcon.paintIcon(this,graphics,0,0);
}
    public void init() {
        this.setLayout(null);
        this.setDoubleBuffered(true);
    }

}
