package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. No resources are produced by
 * a Hill hex.
 */
public class Hill extends Hex {
	public Hill(Point2D center) {
		super(center, Resource.BRICK);
	}

	public Hill(double x, double y) {
		super(x, y, Resource.BRICK);
	}
}