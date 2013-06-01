package org.nanabyte.graph.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for the {@link Vertex} class.
 */
public class VertexTest {
  @Test
  public void testInitializeVertex() {
    String value = "Walrus";
    Vertex<String> vertex = new Vertex<String>(value);
    assertEquals(value, vertex.getData());
  }
}