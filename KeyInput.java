import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    
    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                //key events for player 1

                if (key == KeyEvent.VK_W) {
                    tempObject.setY(tempObject.getY() - 5);
                }

                if (key == KeyEvent.VK_S) {
                    tempObject.setY(tempObject.getY() + 5);
                }

                if (key == KeyEvent.VK_D) {
                    tempObject.setX(tempObject.getX() + 5);
                }

                if (key == KeyEvent.VK_A) {
                    tempObject.setX(tempObject.getX() - 5);
                }
            }
        }
    }

    public void keyReleased(keyEvent e) {
        int key = e.getKeyCode();


    }
}