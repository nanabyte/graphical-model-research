 package org.nanabyte.catan.board;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;
import java.util.Map;

import org.junit.Test;
import org.nanabyte.catan.base.Resource;

/**
 * Unit tests for the {@link HexLayout} class.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class HexLayoutTest {
  @Test
  public void testInitializeCoordinateMap() {
    HexLayout layout = new HexLayout(false);
    Map<String,Hex> coords = layout.getCoordinateMap();

    // There should be 19 elements in the map, corresponding to the 19 hexes
    // on the board.
    assertEquals(19, coords.size());

    assertEquals(new Point2D.Double(-2,-2), coords.get("A0").getCenter());
    assertEquals(new Point2D.Double(-2,-0), coords.get("A1").getCenter());
    assertEquals(new Point2D.Double(-2,2), coords.get("A2").getCenter());

    assertEquals(new Point2D.Double(-1,-3), coords.get("B0").getCenter());
    assertEquals(new Point2D.Double(-1,-1), coords.get("B1").getCenter());
    assertEquals(new Point2D.Double(-1,1), coords.get("B2").getCenter());
    assertEquals(new Point2D.Double(-1,3), coords.get("B3").getCenter());

    assertEquals(new Point2D.Double(0,-4), coords.get("C0").getCenter());
    assertEquals(new Point2D.Double(0,-2), coords.get("C1").getCenter());
    assertEquals(new Point2D.Double(0,0), coords.get("C2").getCenter());
    assertEquals(new Point2D.Double(0,2), coords.get("C3").getCenter());
    assertEquals(new Point2D.Double(0,4), coords.get("C4").getCenter());

    assertEquals(new Point2D.Double(1,-3), coords.get("D0").getCenter());
    assertEquals(new Point2D.Double(1,-1), coords.get("D1").getCenter());
    assertEquals(new Point2D.Double(1,1), coords.get("D2").getCenter());
    assertEquals(new Point2D.Double(1,3), coords.get("D3").getCenter());

    assertEquals(new Point2D.Double(2,-2), coords.get("E0").getCenter());
    assertEquals(new Point2D.Double(2,-0), coords.get("E1").getCenter());
    assertEquals(new Point2D.Double(2,2), coords.get("E2").getCenter());
  }

  @Test
  public void testReadLayoutFromFile() {
    HexLayout layout = new HexLayout();
    Map<String,Hex> coords = layout.getCoordinateMap();

    assertEquals(Resource.WOOD, coords.get("A0").getResource());
    assertEquals(Resource.SHEEP, coords.get("A1").getResource());
    assertEquals(Resource.GRAIN, coords.get("A2").getResource());

    assertEquals(Resource.BRICK, coords.get("B0").getResource());
    assertEquals(Resource.ORE, coords.get("B1").getResource());
    assertEquals(Resource.BRICK, coords.get("B2").getResource());
    assertEquals(Resource.SHEEP, coords.get("B3").getResource());

    assertEquals(Resource.NONE, coords.get("C0").getResource());
    assertEquals(Resource.WOOD, coords.get("C1").getResource());
    assertEquals(Resource.GRAIN, coords.get("C2").getResource());
    assertEquals(Resource.WOOD, coords.get("C3").getResource());
    assertEquals(Resource.GRAIN, coords.get("C4").getResource());

    assertEquals(Resource.BRICK, coords.get("D0").getResource());
    assertEquals(Resource.SHEEP, coords.get("D1").getResource());
    assertEquals(Resource.SHEEP, coords.get("D2").getResource());
    assertEquals(Resource.ORE, coords.get("D3").getResource());

    assertEquals(Resource.ORE, coords.get("E0").getResource());
    assertEquals(Resource.GRAIN, coords.get("E1").getResource());
    assertEquals(Resource.WOOD, coords.get("E2").getResource());
  }
}