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

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener {

    protected JPanel allPanel;
    protected CanvasDrawerV4 canvasPanel4;

    private static final long serialVersionUID = 1L;

    public FootballGameV2(String windowName) {
        super(windowName);
        setFocusable(true);
        requestFocus();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
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

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void addListeners() {
        moveUp.addActionListener(this);
        moveDown.addActionListener(this);
        moveRight.addActionListener(this);
        moveLeft.addActionListener(this);
        reset.addActionListener(this);
        addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (moveUp == source) {
            canvasPanel4.keeperLeft.moveUp();
            setFocusable(true);
            requestFocus();
        } else if (moveDown == source) {
            canvasPanel4.keeperLeft.moveDown();
            setFocusable(true);
            requestFocus();
        } else if (moveRight == source) {
            canvasPanel4.keeperRight.moveUp();
            setFocusable(true);
            requestFocus();
        } else if (moveLeft == source) {
            canvasPanel4.keeperRight.moveDown();
            setFocusable(true);
            requestFocus();
        }
    }

    public void drawPanel() {
        super.drawPanel();
        canvasPanel4 = new CanvasDrawerV4();
    }

    public void addComponents() {
        super.addComponents();
        drawPanel();

        bigPanel.add(canvasPanel4, BorderLayout.CENTER);
        bigPanel.add(panelButton, BorderLayout.SOUTH);

        window.add(bigPanel);
    }

    public static void createAndShowGUI() {
        FootballGameV2 fGameV2 = new FootballGameV2("Football Game Version 2");
        fGameV2.drawPanel();
        fGameV2.setFrameFeatures();
        fGameV2.addComponents();
        fGameV2.addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
