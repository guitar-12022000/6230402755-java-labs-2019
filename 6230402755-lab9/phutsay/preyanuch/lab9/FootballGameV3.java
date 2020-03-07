/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 7/3/2020
 */
package phutsay.preyanuch.lab9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FootballGameV3 extends FootballGameV2 {
    protected CanvasDrawerV5 canvasPanel5;

    private static final long serialVersionUID = 1L;

    public FootballGameV3(String windowName) {
        super(windowName);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object click = e.getSource();
        if (click == moveUp) {
            canvasPanel5.keeperLeft.moveUp();
            setFocusable(true);
            requestFocus();

        } else if (click == moveDown) {
            canvasPanel5.keeperLeft.moveDown();
            setFocusable(true);
            requestFocus();
        } else if (click == moveRight) {
            canvasPanel5.keeperRight.moveUp();
            setFocusable(true);
            requestFocus();

        } else if (click == moveLeft) {
            canvasPanel5.keeperRight.moveDown();
            setFocusable(true);
            requestFocus();

        } else if (click == reset) {
            textFieldKK.setText("0");
            textFieldUD.setText("0");

            canvasPanel5.ball.x = (canvasPanel5.getWidth() / 2) - (Ball.BALL_DIAMETER / 2);
            canvasPanel5.ball.y = (canvasPanel5.getHeight() / 2) - (Ball.BALL_DIAMETER / 2);

            setFocusable(true);
            requestFocus();

            canvasPanel5.ball.setxVelocity(canvasPanel5.randomVelocity());
            canvasPanel5.ball.setyVelocity(canvasPanel5.randomVelocity());
        }
    }

    @Override
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case (KeyEvent.VK_UP):
                canvasPanel4.keeperRight.moveUp();
            case (KeyEvent.VK_DOWN):
                canvasPanel4.keeperRight.moveDown();
            case (KeyEvent.VK_LEFT):
                canvasPanel4.keeperLeft.moveUp();
            case (KeyEvent.VK_RIGHT):
                canvasPanel4.keeperLeft.moveDown();
        }
    }

    public void drawPanel() {
        super.drawPanel();
        canvasPanel5 = new CanvasDrawerV5();
    }

    public void addComponents() {
        super.addComponents();
        drawPanel();

        bigPanel.add(canvasPanel5, BorderLayout.CENTER);
        bigPanel.add(panelButton, BorderLayout.SOUTH);

        window.add(bigPanel);
    }

    public static void createAndShowGUI() {
        FootballGameV3 fGameV3 = new FootballGameV3("Football Game V3");
        fGameV3.drawPanel();
        fGameV3.setFrameFeatures();
        fGameV3.addComponents();
        fGameV3.addListeners();
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
