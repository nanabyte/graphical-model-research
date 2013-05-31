package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. Brick is produced by a Hill
 * hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Hill extends Hex {
  public Hill() {
    super(Resource.BRICK);
  }

  public Hill(Point2D center) {
    super(center, Resource.BRICK);
  }

  public Hill(double x, double y) {
    super(x, y, Resource.BRICK);
  }
}