package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. No resources are produced by
 * a Forest hex.
 */
public class Forest extends Hex {
	public Forest(Point2D center) {
		super(center, Resource.WOOD);
	}

	public Forest(double x, double y) {
		super(x, y, Resource.WOOD);
	}
}