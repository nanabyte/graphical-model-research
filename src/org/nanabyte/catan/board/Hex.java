package org.nanabyte.catan.board;

import java.awt.geom.Point2D;

import org.nanabyte.catan.base.Resource;

/**
 * Base class representing a hex tile in catan.
 *
 * <p>A hex tile in catan is defined by the position of its center and the
 * resource that it produces.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Hex {
  /**
   * The location of the center point of the hex.
   */
  protected Point2D center;

  /**
   * The resource produced by this hex.
   */
  protected Resource resource;

  public Hex(Point2D center, Resource resource) {
    this.center = center;
    this.resource = resource;
  }

  public Hex(double x, double y, Resource resource) {
    this(new Point2D.Double(x,y), resource);
  }

  public Point2D getCenter() {
    return this.center;
  }

  public Resource getResource() {
    return this.resource;
  }
}