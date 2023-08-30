package ua.youTubeVideo.swingVideoPractice;

import javax.swing.*;
import java.awt.*;

public class Swing1HelloWorld {
    public static void main(String[] args) {
        //Створюємо вікно
        JFrame jFrame = new JFrame(){};

        //Робимо вікно видиме
        jFrame.setVisible(true);

        //Даємо можливість закривати програму
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Задаємо розмір вікна програми
    //    jFrame.setSize(500, 300);

        //Задаємо місце появи вікна програми
    //    jFrame.setLocation(500, 300);

        //Дізнаємо ширину та висону екрану пристрою
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        //Задаємо розмір вікна програми та місце появи вікна програми
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);

        //Задаємо назву програмі
        jFrame.setTitle("This my app");
    }
}
