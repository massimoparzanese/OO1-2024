package ar.edu.unlp.info.oo1.JobScheduler10;

import java.util.List;

public class Fifo implements Strategy{
	
	
	public JobDescription next(List<JobDescription> jobs) {
		
		return jobs.get(0);
		
	}

	
	
}
