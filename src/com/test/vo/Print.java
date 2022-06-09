package com.test.vo;

public class Print implements Comparable<Print> {
	private int priority;
	private char alpha;
	
	public Print(int priority, char alpha) {
		this.priority = priority;
		this.alpha = alpha;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public char getAlpha() {
		return this.alpha;
	}

	@Override
	public int compareTo(Print o) {
		return this.priority <= o.getPriority() ? 1 : -1;
	}
}
