package com.tw.tic_tac_toe;

import java.util.Objects;

//Understands valid position.
public class Position {
  private int pos;

  Position(int pos) {
    this.pos = pos;
  }


  public static Position create(int pos) throws NotValidException {
    validatePosition(pos);
    return new Position(pos);
  }

  private static void validatePosition(int pos) throws NotValidException {
    boolean isValid = pos > 0 && pos <= 9;
    if (!isValid) throw new NotValidException();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Position position = (Position) o;
    return pos == position.pos;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos);
  }
}
