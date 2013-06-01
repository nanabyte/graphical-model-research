package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the {@link Hex} class for the desert. Ore is produced by a
 * mountain hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Mountain extends Hex {
  public Mountain() {
    super(Resource.ORE);
  }

  public Mountain(Point2D center) {
    super(center, Resource.ORE);
  }

  public Mountain(double x, double y) {
    super(x, y, Resource.ORE);
  }
}