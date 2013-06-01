package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the {@link Mountain} class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class MountainTest {
  @Test
  public void testPointInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Mountain desert = new Mountain(expectedCenter);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.ORE, desert.getResource());
  }

  @Test
  public void testTwoValueInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Mountain desert = new Mountain(0, 3);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.ORE, desert.getResource());
  }
}