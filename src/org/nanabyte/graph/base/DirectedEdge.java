package org.nanabyte.graph.base;

/**
 * A class representing a directed edge in a {@link Graph}.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class DirectedEdge<E> {
  /**
   * The source {@link Vertex}.
   */
  private Vertex<E> source;

  /**
   * The destination {@link Vertex}.
   */
  private Vertex<E> destination;

  /**
   * The weight of the edge.
   */
  public double weight;

  public DirectedEdge(Vertex<E> source, Vertex<E> destination, double weight) {
    this.source = source;
    this.destination = destination;
    this.weight = weight;
  }

  public Vertex<E> getSource() {
    return this.source;
  }

  public Vertex<E> getDestination() {
    return this.destination;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}