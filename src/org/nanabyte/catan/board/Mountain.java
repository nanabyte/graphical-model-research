package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. No resources are produced by
 * a Mountain hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Mountain extends Hex {
	public Mountain(Point2D center) {
		super(center, Resource.ORE);
	}

	public Mountain(double x, double y) {
		super(x, y, Resource.ORE);
	}
}