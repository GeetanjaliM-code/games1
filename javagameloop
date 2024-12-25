import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends JPanel implements ActionListener {
    private Timer timer;
    private int playerX = 50;
    private int playerY = 50;
    private int playerSpeed = 5;

    public SimpleGame() {
        timer = new Timer(16, this); // ~60 FPS
        timer.start();

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_UP) playerY -= playerSpeed;
                if (key == KeyEvent.VK_DOWN) playerY += playerSpeed;
                if (key == KeyEvent.VK_LEFT) playerX -= playerSpeed;
                if (key == KeyEvent.VK_RIGHT) playerX += playerSpeed;
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillOval(playerX, playerY, 30, 30); // Draw the player
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Game logic updates
        repaint(); // Redraw the screen
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Game");
        SimpleGame game = new SimpleGame();
        frame.add(game);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
