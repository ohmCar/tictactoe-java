package com.tw.tic_tac_toe;

public class NotValidException extends Throwable {
  public NotValidException() {
    super("not valid position");
  }
}
