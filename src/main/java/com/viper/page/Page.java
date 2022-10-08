package com.viper.page;

import com.viper.page.elements.Element;
import com.viper.visuals.Camera;
import lombok.Getter;
import lombok.Setter;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Page {

  @Getter private final String name;
  @Getter @Setter private List<Element> elements;

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

}
