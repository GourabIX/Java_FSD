package day11.Assignments.q2;

import java.util.HashMap;
import java.util.Map;

import day11.Assignments.q2.bean.Trains;

public class TestTrainOperations {

	public static void main(String[] args) {
		
		Trains train1 = new Trains(101, "Uttar Banga Express", "SDAH", "NCB");
		Trains train2 = new Trains(102, "Kanchankanya Express", "SDAH", "GWH");
		Trains train3 = new Trains(103, "Teesta Torsa Express", "SDAH", "NJP");
		
		Map<Integer, Trains> trainMap = new HashMap<Integer, Trains>();
		trainMap.put(101, train1);
		trainMap.put(102, train2);
		trainMap.put(103, train3);
		
		TrainOperations iterator = new TrainOperations();
		iterator.iterateThroughMap(trainMap);
		
	}

}
