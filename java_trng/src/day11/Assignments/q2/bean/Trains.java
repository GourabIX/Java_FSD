package day11.Assignments.q2.bean;

public class Trains {
	
	private int trainId;
	private String trainName;
	private String startingStation;
	private String endingStation;
	
	public Trains ()
	{
		// There's nothing here.
	}
	
	public Trains (int trainId, String trainName, String startingStation, String endingStation)
	{
		this.trainId = trainId;
		this.trainName = trainName;
		this.startingStation = startingStation;
		this.endingStation = endingStation;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getEndingStation() {
		return endingStation;
	}

	public void setEndingStation(String endingStation) {
		this.endingStation = endingStation;
	}

	@Override
	public String toString() {
		return "Trains [trainId=" + trainId + ", trainName=" + trainName + ", startingStation=" + startingStation
				+ ", endingStation=" + endingStation + "]";
	}
	
}
