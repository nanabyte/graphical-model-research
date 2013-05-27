package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the Hex class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class HexTest {
	@Test
  public void testPointInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Hex hex = new Hex(expectedCenter, Resource.WOOD);
		assertEquals(expectedCenter, hex.getCenter());
		assertEquals(Resource.WOOD, hex.getResource());
	}

	@Test
	public void testTwoValueInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Hex hex = new Hex(0, 3, Resource.WOOD);
		assertEquals(expectedCenter, hex.getCenter());
		assertEquals(Resource.WOOD, hex.getResource());
	}
}