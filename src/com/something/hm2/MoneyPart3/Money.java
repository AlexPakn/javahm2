package com.something.hm2.MoneyPart3;

public class Money {
    protected int wholePart;
    protected int fractionalPart;

    public Money(int wholePart, int fractionalPart) {
        this.wholePart = wholePart;
        this.fractionalPart = fractionalPart;
    }
  @Override
  public String toString() {
    return wholePart +
        "." + fractionalPart;
  }
}