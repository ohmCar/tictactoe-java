package com.tw.tic_tac_toe;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositionsTest {
  @Test
  public void shouldReturnTrueForIfItHasPosition() {
    Positions positions = new Positions();
    Position position = new Position(3);
    positions.add(position);
    assertTrue(positions.hasPosition(position));
  }

  @Test
  public void shouldAssertFalseForAbsenceOfPositionInPositions() {
    Positions positions = new Positions();
    assertFalse(positions.hasPosition(new Position(3)));
  }
}
