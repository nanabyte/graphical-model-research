package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the Forest class.
 */
public class ForestTest {
	@Test
  public void testPointInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Forest desert = new Forest(expectedCenter);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.WOOD, desert.getResource());
	}

	@Test
	public void testTwoValueInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Forest desert = new Forest(0, 3);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.WOOD, desert.getResource());
	}
}