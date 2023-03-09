package com.viper.page;

import com.viper.visuals.Camera;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Element {

  private int x;
  private int y;
  private int width;
  private int height;
  private boolean shown;
  private final String id;
  private final String name;
  private final Element parent;
  private final List<String> classes;
  private final Hashtable<String, Element> childElements;

  private static final Element NULL_ELEMENT = new Element(null, null, null);

  public Element(Element parent, String name, String id) {
    this.parent = parent;
    this.name = name;
    this.id = id;
    this.classes = new ArrayList<>();
    this.childElements = new Hashtable<>();
  }

  protected void tick() {

  }

  protected void render(Graphics g, Camera camera) {

  }

  /**
   * Check with this element is the child of another element
   * @param element | Element to check as the parent of 'this' element
   * @return | true if this is a child of 'element' otherwise return false
   */
  public boolean isChild(Element element) {
    return element.getChildElements().contains(this);
  }

  public Element getChild(String id) {
    return getChildElements().getOrDefault(id, NULL_ELEMENT);
  }

  public Hashtable<String, Element> getChildElements() {
    return childElements;
  }
}
