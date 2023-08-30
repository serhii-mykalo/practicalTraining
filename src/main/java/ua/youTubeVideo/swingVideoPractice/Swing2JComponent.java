package ua.youTubeVideo.swingVideoPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Swing2JComponent {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
            g2.drawString("hello world", 40, 30);
            Point2D p1 = new Point2D.Float(40, 40);
            Point2D p2 = new Point2D.Float(150, 150);
            Line2D l2 = new Line2D.Float(p1, p2);
            g2.draw(l2);
            Ellipse2D el = new Ellipse2D.Float();
            el.setFrameFromDiagonal(p1, p2);
            g2.setPaint(Color.red);
            g2.draw(el);
            Rectangle2D r2 = new Rectangle2D.Float();
            r2.setFrameFromDiagonal(p1, p2);
            g2.draw(r2);
            try {
                URL url = new URL("http://webdiz.com.ua/wp-content/uploads/2018/01/svg.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 170, 0, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        return jFrame;
    }
}

//        //Перегляд доступний шрифнів у системі
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s : fonts) {
//            System.out.println(s);
//        }
