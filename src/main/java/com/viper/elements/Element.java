package com.viper.elements;

import lombok.Data;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Data
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

  public Element(Element parent, String name, String id) {
    this.parent = parent;
    this.name = name;
    this.id = id;
    this.classes = new ArrayList<>();
    this.childElements = new Hashtable<>();
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
    return getChildElements().getOrDefault(id, null);
  }

}
