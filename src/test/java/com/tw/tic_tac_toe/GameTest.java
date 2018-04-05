package com.tw.tic_tac_toe;

import org.junit.Test;

public class GameTest {
  @Test
  public void shouldAddPlayers() {
    Game game = new Game();
    game.add(new Player("dhana",Sign.O));
  }
}
