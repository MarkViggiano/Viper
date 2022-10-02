package me.mark.test;

import com.viper.ViperWindow;

public class Main {

  private final ViperWindow window;

  public Main() {
    this.window = ViperWindow.createWindow("Testing1234");
  }

  public static void main(String[] args) {
    new Main();
  }

}
