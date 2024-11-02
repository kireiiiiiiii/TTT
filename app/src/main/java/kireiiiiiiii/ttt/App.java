/*
 * Author: Matěj Šťastný
 * Date created: 11/01/2024
 * GitHub: https://github.com/kireiiiiiiii/TTT
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package kireiiiiiiii.ttt;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;

import kireiiiiiiii.ttt.common.GPanel;
import kireiiiiiiii.ttt.common.GPanel.InteractableHandeler;

public class App implements InteractableHandeler {

    /////////////////
    /// Main method
    ////////////////

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }

    /////////////////
    /// Constants
    ////////////////

    private final String APP_NAME = "TTT";

    /////////////////
    /// Variables
    ////////////////

    private GPanel gPanel;

    /////////////////
    /// Contructor
    /////////////////

    public App() {
        System.out.println("nyya :3");
        this.gPanel = new GPanel(this, 60, 1600, 1000, true, APP_NAME);
    }

    /////////////////
    /// Interactable
    ////////////////

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
