package org.nanabyte.graph.base;

/**
 * A class representing a vertex in a {@link Graph}.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Vertex<E> {
  /**
   * The data stored by the vertex.
   */
  private E data;

  public Vertex(E data) {
    this.data = data;
  }

  public E getData() {
    return this.data;
  }
}