package com.viper.position;

public class Location {

  private int x;
  private int y;

  public Location(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Location(Location location) {
    this.x = location.getX();
    this.y = location.getY();
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public boolean isSameLocation(Location location) {
    return location.getX() == getX() && location.getY() == getY();
  }

}
