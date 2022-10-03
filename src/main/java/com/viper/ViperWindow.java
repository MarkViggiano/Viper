package com.viper;

import lombok.Data;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Toolkit;

@Data
public class ViperWindow extends Canvas {

  private String windowName;
  private int xSize;
  private int ySize;
  private boolean resizeable;
  private final JFrame window;
  public final static int DEFAULT_X_SIZE = Toolkit.getDefaultToolkit().getScreenSize().width;
  public final static int DEFAULT_Y_SIZE = Toolkit.getDefaultToolkit().getScreenSize().height;

  /**
   * Create a non-resizable window with no name.
   * @param xSize | # of pixels wide
   * @param ySize | # of pixels tall
   * @return | ViperWindow instance
   */
  public static ViperWindow createWindow(int xSize, int ySize) {
    return new ViperWindow("ViperWindow", xSize, ySize, false);
  }

  /**
   * Create a resizable window using the default size parameters.
   * @param windowName | name of the window
   * @return | ViperWindow instance
   */
  public static ViperWindow createWindow(String windowName) {
    return new ViperWindow(windowName, DEFAULT_X_SIZE, DEFAULT_Y_SIZE, true);
  }

  /**
   * Create a ViperWindow with total customization at initialization
   * @param windowName | Name of the window
   * @param xSize | # of pixels wide
   * @param ySize | # of pixels tall
   * @param resizeable | allows user to resize the window
   * @return
   */
  public static ViperWindow createWindow(String windowName, int xSize, int ySize, boolean resizeable) {
    return new ViperWindow(windowName, xSize, ySize, resizeable);
  }

  private ViperWindow(String windowName, int width, int height, boolean resizeable) {
    this.windowName = windowName;
    this.xSize = width;
    this.ySize = height;
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
