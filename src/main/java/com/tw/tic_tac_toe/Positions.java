package com.tw.tic_tac_toe;

import java.util.HashSet;

public class Positions {
  private HashSet<Position> allPositions;

  public Positions() {
    this.allPositions = new HashSet();
  }

  public Boolean hasPosition(Position position) {
    return allPositions.contains(position);
  }

  public void add(Position position) {
    allPositions.add(position);
  }
}
