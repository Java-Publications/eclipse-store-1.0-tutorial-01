package com.svenruppert;


public class ApplicationREST {


  private ApplicationREST() {
  }

  public static void main(String[] args) {
    RestService restService = new RestService();
    restService.startService(7070);
  }


}
