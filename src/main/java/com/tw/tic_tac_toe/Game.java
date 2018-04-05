package com.tw.tic_tac_toe;

import java.util.ArrayList;

public class Game {

  private ArrayList<Player> allPlayers;

  public Game() {
    this.allPlayers = new ArrayList<>();
  }

  public void add(Player player) {
    allPlayers.add(player);
  }
}
