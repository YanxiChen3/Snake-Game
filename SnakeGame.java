import java.awt.*;

public class SnakeGame extends Frame{
    public SnakeGame(){
        Frame window = new Frame ("SnakeGame");
        Label text = new Label("Snake Game!!!");

        text.setBounds(450, 100, 500, 500);
        window.add(text);
        window.setSize(1000,600);
        window.setLayout(null);
        window.setVisible(true);
    }
    public static void main(String[] args){
        new SnakeGame();
    }




}
