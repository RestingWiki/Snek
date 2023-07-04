import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int GAME_UNIT = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    private static final int DELAY = 75;        // HIGHER IS SLOWER
    private  final int[] x = new int[GAME_UNIT];        // Snake body parts x-coords
    private  final int[] y = new int[GAME_UNIT];        // Snake body parts y-coords

    int bodyParts = 6;  // Initial parts
    int appleEaten;
    int appleX;
    int appleY;
    char direction = 'R';      //   Initial direction
    boolean running = false;
    Timer timer;
    Random random;



    // Constructor
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    // Start game
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        for (int i = 0; i < SCREEN_WIDTH; i++){
            g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGHT);
            g.drawLine(0,i*UNIT_SIZE,SCREEN_WIDTH,i*UNIT_SIZE);
        }
    }

    public void newApple(){

    }

    public void move(){

    }

    public void checkApple(){

    }

    public void checkCollision(){

    }

    public void gameOver(Graphics g){

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}
