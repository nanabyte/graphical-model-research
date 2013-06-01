package org.nanabyte.graph.base;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * A class representing an undirected edge in a {@link Graph}.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class UndirectedEdge<E> {
  private static final Logger LOGGER =
    Logger.getLogger(UndirectedEdge.class.getName());

  /**
   * The list of two {@link Vertex} objects corresponding to this edge.
   */
  private List<Vertex<E>> vertices;

  /**
   * The weight of the edge.
   */
  public double weight;

  public UndirectedEdge(Vertex<E> vertex1, Vertex<E> vertex2, double weight) {
    this.vertices = new ArrayList<Vertex<E>>();
    vertices.add(vertex1);
    vertices.add(vertex2);
    this.weight = weight;
  }

  public List<Vertex<E>> getVertices() {
    return this.vertices;
  }

  public Vertex<E> getVertex(int index) {
    if (index >= 0 && index < this.vertices.size()) {
      return this.vertices.get(index);
    } else {
      LOGGER.severe("Improper call to getVertices with invalid index "
        + index + "!");
      return null;
    }
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}