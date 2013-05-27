package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. No resources are produced by
 * a Desert hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Desert extends Hex {
  public Desert(Point2D center) {
    super(center, Resource.NONE);
  }

  public Desert(double x, double y) {
    super(x, y, Resource.NONE);
  }
}