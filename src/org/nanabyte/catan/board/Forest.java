package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the {@link Hex} class for the desert. Wood is produced by a
 * forest hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Forest extends Hex {
  public Forest() {
    super(Resource.WOOD);
  }

  public Forest(Point2D center) {
    super(center, Resource.WOOD);
  }

  public Forest(double x, double y) {
    super(x, y, Resource.WOOD);
  }
}