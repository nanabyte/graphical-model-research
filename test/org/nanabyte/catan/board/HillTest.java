package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the Hill class.
 */
public class HillTest {
	@Test
  public void testPointInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Hill desert = new Hill(expectedCenter);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.BRICK, desert.getResource());
	}

	@Test
	public void testTwoValueInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Hill desert = new Hill(0, 3);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.BRICK, desert.getResource());
	}
}