package com.test.vo;

public class Job implements Comparable<Job>{
	private int req;
	private int time;
	private int index;
	
	public Job(int req, int time, int index) {
		this.req = req;
		this.time = time;
		this.index = index;
	}

	public int getReq() {
		return req;
	}
	public void setReq(int req) {
		this.req = req;
	}

	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int compareTo(Job o) {
		if(this.getTime() > o.getTime()) return 1;
		if(this.getTime() < o.getTime()) return -1;
			
		return (this.getReq() > o.getReq() ? 1 : -1);
	}	

}
