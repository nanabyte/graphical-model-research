package org.nanabyte.catan.board;

import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.nanabyte.catan.base.Constants;

/**
 * Class that represents the Catan layout of {@link Hex} tiles.
 *
 * <p>In Catan, the hex part of the board is comprised rows of 3-4-5-4-3 tiles.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class HexLayout {
  public static final List<Hex> HEXES;

  // TODO(nanabyte): This is pretty terrible style, but the default board
  // doesn't change. Consider implementing this more sanely.
  static {
    HEXES = new ArrayList<Hex>();
    HEXES.add(new Forest());
    HEXES.add(new Pasture());
    HEXES.add(new Field());

    HEXES.add(new Hill());
    HEXES.add(new Mountain());
    HEXES.add(new Hill());
    HEXES.add(new Pasture());

    HEXES.add(new Desert());
    HEXES.add(new Forest());
    HEXES.add(new Field());
    HEXES.add(new Forest());
    HEXES.add(new Field());

    HEXES.add(new Hill());
    HEXES.add(new Pasture());
    HEXES.add(new Pasture());
    HEXES.add(new Mountain());

    HEXES.add(new Mountain());
    HEXES.add(new Field());
    HEXES.add(new Forest());
  }

  /**
   * A map where the keys are coordinate names in canonical form and the values
   * are the {@link Hex}s at that coordinate position.
   */
  private Map<String, Hex> coordinateMap;

  /**
   * Initialize the hex layout using the default configuration.
   */
  public HexLayout() {
    this(false);
  }

  /**
   * Initializes the hexLayout using a random initial configuration.
   */
  public HexLayout(boolean useRandomLayout) {
    List<Hex> hexes;
    if (useRandomLayout) {
      hexes = initializeLayoutRandomly();
    } else {
      // Use the default layout.
      hexes = HEXES;
    }
    coordinateMap = initializeCoordinateMap(hexes);
  }

  /**
   * Returns the coordinate map.
   */
  public Map<String, Hex> getCoordinateMap() {
    return this.coordinateMap;
  }

  /**
   * Initializes the coordinate map.
   *
   * <p> For the purpose of simplicity, we say that C2 is at (0,0) and the side
   * length of a hex is 1. Then, each row is 1.5 units above the row below it
   * and each column is sqrt(3) / 2 units to the right of the previous column.
   * Note that two adjacent hexes in a row are actually two columns apart.
   *
   * <p> However, in order to deal exclusively with integers, we will change the
   * scale of the axes to force all values to be integers.
   */
  private HashMap<String,Hex> initializeCoordinateMap(List<Hex> hexes) {
    Iterator<Hex> iterator = hexes.iterator();
    HashMap<String,Hex> coordinateMap =
      new HashMap<String,Hex>(Constants.NUM_HEXES);
    char centerRow = 'C';
    int initialCol = -4;

    int numColumns = 3;
    for (char c = 'A'; c < 'F'; ++c) {
      int correctionTerm = c - centerRow;
      for (int i = 0; i < numColumns; ++i) {
        String canonicalCoordinateName = c + "" + i;
        int tileColumn = initialCol + Math.abs(correctionTerm) + 2 * i;
        Point2D position = new Point2D.Double(correctionTerm, tileColumn);

        Hex resource = iterator.next();
        resource.setCenter(position);
        coordinateMap.put(canonicalCoordinateName, resource);
      }

      // If the correctionTerm is non-negative, then decrement numColumns.
      // Otherwise, increment numColumns.
      if (correctionTerm >= 0) {
        --numColumns;
      } else {
        ++numColumns;
      }
    }

    return coordinateMap;
  }

  private ArrayList<Hex> initializeLayoutRandomly() {
    ArrayList<Hex> allHexes = listAllHexes();
    Collections.shuffle(allHexes);
    return allHexes;
  }


  /**
   * Returns an ArrayList representing the hexes on the board.
   */
  private ArrayList<Hex> listAllHexes() {
    ArrayList<Hex> allHexes = new ArrayList<Hex>(Constants.NUM_HEXES);
    for (int i = 0; i < Constants.NUM_DESERTS; ++i) {
      allHexes.add(new Desert());
    }

    for (int i = 0; i < Constants.NUM_FIELDS; ++i) {
      allHexes.add(new Field());
    }

    for (int i = 0; i < Constants.NUM_FORESTS; ++i) {
      allHexes.add(new Forest());
    }

    for (int i = 0; i < Constants.NUM_HILLS; ++i) {
      allHexes.add(new Hill());
    }

    for (int i = 0; i < Constants.NUM_MOUNTAINS; ++i) {
      allHexes.add(new Mountain());
    }

    for (int i = 0; i < Constants.NUM_PASTURES; ++i) {
      allHexes.add(new Pasture());
    }

    return allHexes;
  }
}