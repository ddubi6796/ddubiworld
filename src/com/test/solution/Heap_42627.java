package com.test.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.test.vo.Job;

public class Heap_42627 {
	public static int solution(int[][] jobs) {		
		List<Job> jobQ = new ArrayList<>();
        for(int i=0; i<jobs.length; i++) {
        	jobQ.add(new Job(jobs[i][0], jobs[i][1], i));
        }
        
        jobQ.sort(new Comparator<Job>() {
			@Override
			public int compare(Job o1, Job o2) {
				if(o1.getReq() > o2.getReq()) return 1;
				if(o1.getReq() < o2.getReq()) return -1;
				return (o1.getTime() > o2.getTime() ? 1 : -1);
			}
        	
		});
        
        Job first = jobQ.get(0);
        return getFastJob(first, jobQ, first.getReq() + first.getTime(), first.getTime()) / jobs.length;
    }
	
	//다음에 실행될 대상을 찾음
	public static int getFastJob(Job thisJob, List<Job> jobs, int cnt, int totCnt){
		jobs.removeIf(j -> (j.getIndex()==thisJob.getIndex()));
		if(jobs.size() == 0) return totCnt;
		
	    Job nextJob = jobs.get(0);
	    int wait = 0;
	    
		PriorityQueue<Job> jobQ = new PriorityQueue<>();
	    for(Job job : jobs) {
	    	if(job.getReq() < cnt) {
		    	jobQ.add(new Job(job.getReq(), job.getTime(), job.getIndex()));
	    	}
	    }
	    
	    if(jobQ.size() > 0) {
		    nextJob = jobQ.poll();
		    wait = cnt-nextJob.getReq();
	    }
	    
		return getFastJob(nextJob, jobs, cnt+nextJob.getTime(), totCnt+(wait+nextJob.getTime()));
	}
}
