package com.viper;

import lombok.Data;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Toolkit;

@Data
public class ViperWindow extends Canvas {

  private String windowName;
  private int windowWidth;
  private int windowHeight;
  private boolean resizeable;
  private final JFrame window;
  public final static int DEFAULT_WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
  public final static int DEFAULT_WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

  /**
   * Create a non-resizable window with no name.
   * @param windowWidth | # of pixels wide
   * @param windowHeight | # of pixels tall
   * @return | ViperWindow instance
   */
  public static ViperWindow createWindow(int windowWidth, int windowHeight) {
    return new ViperWindow("ViperWindow", windowWidth, windowHeight, false);
  }

  /**
   * Create a resizable window using the default size parameters.
   * @param windowName | name of the window
   * @return | ViperWindow instance
   */
  public static ViperWindow createWindow(String windowName) {
    return new ViperWindow(windowName, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT, true);
  }

  /**
   * Create a ViperWindow with total customization at initialization
   * @param windowName | Name of the window
   * @param windowWidth | # of pixels wide
   * @param windowHeight | # of pixels tall
   * @param resizeable | allows user to resize the window
   * @return | ViperWindow instance
   */
  public static ViperWindow createWindow(String windowName, int windowWidth, int windowHeight, boolean resizeable) {
    return new ViperWindow(windowName, windowWidth, windowHeight, resizeable);
  }

  private ViperWindow(String windowName, int width, int height, boolean resizeable) {
    this.windowName = windowName;
    this.windowWidth = width;
    this.windowHeight = height;
    this.resizeable = resizeable;

    //create window
    JFrame window = new JFrame(windowName);
    window.setUndecorated(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(resizeable);
    window.setSize(width, height);
    window.setExtendedState(JFrame.MAXIMIZED_BOTH);
    window.setVisible(true);
    window.setFocusable(true);
    window.setLocationRelativeTo(null);
    this.window = window;
  }

}
