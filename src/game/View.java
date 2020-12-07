package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

class View extends JFrame {
    private Model model;
    private Player player;
    public View(Model model) {
        super("Robot Game");
        this.model = model;
        createAndShowGUI();
    }

    void displayMessage(String message) { JOptionPane.showMessageDialog(this, message); }

    private void createAndShowGUI() {
        setSize(model.getScreenX(),model.getScreenY());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        player = new Player();
        player.setBounds(new Rectangle(model.getCurrentX(), model.getCurrentY()-model.getPlayerSize()/2, model.getPlayerSize(), model.getPlayerSize()));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        try {
            model.getLines().forEach((p, c) ->{
                graphics.setColor(c.color);
                graphics.drawLine(p.x, p.y, c.x, c.y);
            });
        }catch (ConcurrentModificationException e){}
        player.paint(graphics);
    }

    void refresh() {
        repaint();
    }

    class Player extends JLabel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Image image = null;
            try {
                image = ImageIO.read(new File("res\\MyRobot.png")).getScaledInstance(model.getPlayerSize(), model.getPlayerSize(), Image.SCALE_DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((Graphics2D) g).rotate(Math.toRadians(model.getAngle()),model.getCurrentX(),model.getCurrentY());
            g.drawImage(image, model.getCurrentX(), model.getCurrentY()-model.getPlayerSize()/2, null);
        }

    }
}