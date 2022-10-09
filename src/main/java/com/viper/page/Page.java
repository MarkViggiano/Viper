package com.viper.page;

import com.viper.page.elements.Element;
import com.viper.visuals.Camera;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Page {

  private final String name;
  private List<Element> elements;

  public Page(String name) {
    this.name = name;
    this.elements = new ArrayList<>();
  }

  public Page(String name, List<Element> elements) {
    this.name = name;
    this.elements = elements;
  }

  public void render(Graphics g, Camera camera) {
    List<Element> elements = getElements();
    for (Element element : elements) element.render(g, camera);

  }

  public String getName() {
    return name;
  }

  public List<Element> getElements() {
    return elements;
  }

  public void setElements(List<Element> elements) {
    this.elements = elements;
  }
}
