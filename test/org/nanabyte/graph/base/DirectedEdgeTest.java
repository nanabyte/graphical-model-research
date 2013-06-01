package org.nanabyte.graph.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for the {@link DirectedEdge} class.
 */
public class DirectedEdgeTest {
  @Test
  public void testInitializeVertex() {
    String start = "start";
    Vertex<String> startVertex = new Vertex<String>(start);

    String end = "end";
    Vertex<String> endVertex = new Vertex<String>(end);

    DirectedEdge<String> edge =
      new DirectedEdge<String>(startVertex, endVertex, 23);
    assertEquals(startVertex, edge.getSource());
    assertEquals(endVertex, edge.getDestination());
    assertEquals(23, edge.getWeight(), 1e6);
  }
}