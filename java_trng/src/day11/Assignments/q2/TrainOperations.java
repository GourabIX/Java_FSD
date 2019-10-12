package day11.Assignments.q2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import day11.Assignments.q2.bean.Trains;

public class TrainOperations {
	
	public void iterateThroughMap(Map<Integer, Trains> trainList)
	{
	
		Iterator iter = trainList.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry train = (Map.Entry) iter.next();
			System.out.println(train.getKey() + ": " + train.getValue());
		}

//		Set<Integer> myTrainKeySet = new HashSet<Integer>();
//		myTrainKeySet = trainList.keySet();
//		for (int key: myTrainKeySet)
//		{
//			System.out.println(key + ": " + trainList.get(key));
//		}
	}

}
