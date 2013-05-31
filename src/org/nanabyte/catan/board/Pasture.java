package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. Sheep are produced by
 * a Pasture hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Pasture extends Hex {
  public Pasture() {
    super(Resource.SHEEP);
  }

  public Pasture(Point2D center) {
    super(center, Resource.SHEEP);
  }

  public Pasture(double x, double y) {
    super(x, y, Resource.SHEEP);
  }
}