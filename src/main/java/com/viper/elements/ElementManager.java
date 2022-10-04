package com.viper.elements;

import lombok.Getter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ElementManager {

  @Getter private final Hashtable<String, Element> elements;
  private final List<Element> elementsToAdd;
  private final List<Element> elementsToRemove;

  public ElementManager() {
    this.elements = new Hashtable<>();
    this.elementsToAdd = new ArrayList<>();
    this.elementsToRemove = new ArrayList<>();
  }

}
