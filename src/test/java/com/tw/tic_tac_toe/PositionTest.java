package com.tw.tic_tac_toe;

import com.tw.tic_tac_toe.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PositionTest {
  @Test
  public void shouldGivePosition3() throws NotValidException {
    Position position = Position.create(3);
    assertEquals(position,new Position(3));
  }

  @Test(expected = NotValidException.class)
  public void shouldCreatePosition() throws NotValidException {
    Position.create(-3);
  }

}
