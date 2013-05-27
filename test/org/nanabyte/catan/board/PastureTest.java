package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the Pasture class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class PastureTest {
	@Test
  public void testPointInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Pasture desert = new Pasture(expectedCenter);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.SHEEP, desert.getResource());
	}

	@Test
	public void testTwoValueInit() {
		Point2D expectedCenter = new Point2D.Double(0,3);
		Pasture desert = new Pasture(0, 3);
		assertEquals(expectedCenter, desert.getCenter());
		assertEquals(Resource.SHEEP, desert.getResource());
	}
}