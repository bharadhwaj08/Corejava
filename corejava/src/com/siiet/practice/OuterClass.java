package com.siiet.practice;

public class OuterClass {
	  public interface NestedInterface {
	    void printMessage();
	  }

	  public static class NestedClass implements NestedInterface {
	    @Override
	    public void printMessage() {
	      System.out.println("Hello from nested interface!");
	    }
	  }
	}

