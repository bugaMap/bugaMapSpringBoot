package de.hhn.se.labswp.bugaMap.responses;

public class StandardResponse {

  private final boolean success;

  private final String message;


  public StandardResponse(boolean success, String message) {
    this.success = success;
    this.message = message;
  }
}