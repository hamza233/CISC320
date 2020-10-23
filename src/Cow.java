
public class Cow implements Comparable<Cow> {

	int id;
	int latestWeight;
	int lowestWeight;
	int avgMilk;
	int totalMilk;
	int numOfMilkings; // to compute avgMilk
	int timestamp; // has to be the latest

	public Cow(int id) {
		this.id = id;
		this.latestWeight = 0;
		this.lowestWeight = Integer.MAX_VALUE;
		this.avgMilk = 0;
		this.totalMilk = 0;
		this.numOfMilkings = 0;
		this.timestamp = 0;
	}

	public int getTotalMilk() {
		return totalMilk;
	}

	public void setTotalMilk(int totalMilk) {
		this.totalMilk += totalMilk;
		// System.out.println("Total Milk for "+this.id+" updated to "+this.totalMilk);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLatestWeight() {
		return latestWeight;
	}

	public void setLatestWeight(int latestWeight) {
		this.latestWeight = latestWeight;
	}

	public int getLowestWeight() {
		return lowestWeight;
	}

	public void setLowestWeight(int lowestWeight) {
		this.lowestWeight = lowestWeight;
	}

	public int getAvgMilk() {
		return avgMilk;
	}

	public void setAvgMilk() {
		this.avgMilk = this.totalMilk / this.numOfMilkings;
		// System.out.println("Average Milk for "+this.id+" updated to "+this.avgMilk);
	}

	public int getNumOfMilkings() {
		return numOfMilkings;
	}

	public void incNumOfMilkings() {
		this.numOfMilkings = this.numOfMilkings + 1;
		// System.out.println("Number of Milkings for "+this.id+" updated to
		// "+this.numOfMilkings);

	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return id + " " + lowestWeight + " " + latestWeight + " " + avgMilk + "\n";
	}

	@Override
	public int compareTo(Cow a) {
		if (this.getLowestWeight() - a.getLowestWeight() == 0) {
			return this.getLatestWeight() - a.getLatestWeight();
		} else if (this.getLatestWeight() - a.getLatestWeight() == 0) {
			return this.getAvgMilk() - a.getAvgMilk();
		} else
			return this.getLowestWeight() - a.getLowestWeight();
	}

}
