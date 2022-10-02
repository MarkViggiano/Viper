package com.viper;

import lombok.Data;

@Data
public class ViperWindow {

  private String windowName;
  private int xSize;
  private int ySize;
  private boolean resizeable;
  public final static int DEFAULT_X_SIZE = 500;
  public final static int DEFAULT_Y_SIZE = 500;

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
   * @param windowName
   * @return
   */
  public static ViperWindow createWindow(String windowName) {
    return new ViperWindow(windowName, DEFAULT_X_SIZE, DEFAULT_Y_SIZE, true);
  }

  public static ViperWindow createWindow(String windowName, int xSize, int ySize, boolean resizeable) {
    return new ViperWindow(windowName, xSize, ySize, resizeable);
  }

  private ViperWindow(String windowName, int xSize, int ySize, boolean resizeable) {
    this.windowName = windowName;
    this.xSize = xSize;
    this.ySize = ySize;
    this.resizeable = resizeable;
  }



}
