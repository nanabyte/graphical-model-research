package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Implementation of the Hex class for the desert. Grain is produced by a Field
 * hex.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Field extends Hex {
  public Field() {
    super(Resource.GRAIN);
  }

  public Field(Point2D center) {
    super(center, Resource.GRAIN);
  }

  public Field(double x, double y) {
    super(x, y, Resource.GRAIN);
  }
}