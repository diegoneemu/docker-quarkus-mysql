package org.acme.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  private int id;
  private String text;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "{\"id\": \"" + this.getId() + "\", \"text\": \"" + this.getText() + "\"}";
  }
}