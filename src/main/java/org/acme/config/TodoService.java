package org.acme.config;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.acme.entities.Todo;

@RequestScoped
public class TodoService {
  @Inject
  EntityManager entityManager;

  @Transactional
  public void create() {
    Todo todo = new Todo();

    todo.setText("New Todo");
    todo.setId(1);

    entityManager.persist(todo);
  }
}