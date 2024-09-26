package ar.edu.unlp.info.oo1.JobScheduler10;

import java.util.ArrayList;
import java.util.List;

public interface Strategy {

		/*
		 * Te da el siguiente del tipo de estrategia
		 */
		JobDescription next(List<JobDescription> jobs);
}
