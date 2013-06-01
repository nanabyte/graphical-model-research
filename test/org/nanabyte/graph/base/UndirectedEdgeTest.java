package org.nanabyte.graph.base;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for the {@link UndirectedEdge} class.
 */
public class UndirectedEdgeTest {
  @Test
  public void testInitializeVertex() {
    String start = "start";
    Vertex<String> vertex1 = new Vertex<String>(start);

    String end = "end";
    Vertex<String> vertex2 = new Vertex<String>(end);

    UndirectedEdge<String> edge =
      new UndirectedEdge<String>(vertex1, vertex2, 23);
    assertEquals(vertex1, edge.getVertex(0));
    assertEquals(vertex2, edge.getVertex(1));
    assertEquals(23, edge.getWeight(), 1e6);

    List<Vertex<String>> vertices = edge.getVertices();
    assertEquals(2, vertices.size());
    assertEquals(vertex1, vertices.get(0));
    assertEquals(vertex2, vertices.get(1));
  }
}