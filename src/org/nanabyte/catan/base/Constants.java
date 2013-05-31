package org.nanabyte.catan.base;

/**
 * A class of constants used inside of the game.
 *
 * @author nanabyte (gnanabyte@gmail.com)
 */
public class Constants {
  private Constants() {}

  /**
   * The total number of desert hexes on the board.
   */
  public static final int NUM_DESERTS = 1;

  /**
   * The total number of field hexes on the board.
   */
  public static final int NUM_FIELDS = 4;

  /**
   * The total number of forest hexes on the board.
   */
  public static final int NUM_FORESTS = 4;

  /**
   * The total number of hill hexes on the board.
   */
  public static final int NUM_HILLS = 3;

  /**
   * The total number of mountain hexes on the board.
   */
  public static final int NUM_MOUNTAINS = 3;

  /**
   * The total number of pasture hexes on the board.
   */
  public static final int NUM_PASTURES = 4;

  /**
   * The total number of hexes on the board
   */
  public static final int NUM_HEXES = 19;

  /**
   * The distance in units between the centers of two adjacent rows.
   */
  public static final double ROW_DIFFERENCE = 1.5;

  /**
   * The distance in units between the centers of two adjacent columns.
   */
  public static final double COL_DIFFERENCE = Math.sqrt(3) / 2;

  public static final String DESERT_STRING = "Desert";

  public static final String FIELD_STRING = "Field";

  public static final String FOREST_STRING = "Forest";

  public static final String HILL_STRING = "Hill";

  public static final String MOUNTAIN_STRING = "Mountain";

  public static final String PASTURE_STRING = "Pasture";
}