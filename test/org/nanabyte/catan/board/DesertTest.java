package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the Desert class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class DesertTest {
  @Test
  public void testPointInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Desert desert = new Desert(expectedCenter);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.NONE, desert.getResource());
  }

  @Test
  public void testTwoValueInit() {
    Point2D expectedCenter = new Point2D.Double(0,3);
    Desert desert = new Desert(0, 3);
    assertEquals(expectedCenter, desert.getCenter());
    assertEquals(Resource.NONE, desert.getResource());
  }
}