package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the {@link Field} class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class FieldTest {
  @Test
  public void testPointInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Field desert = new Field(expectedCenter);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.GRAIN, desert.getResource());
  }

  @Test
  public void testTwoValueInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Field desert = new Field(0, 3);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.GRAIN, desert.getResource());
  }
}