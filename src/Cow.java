/**
 * Cow class
 */
public class Cow implements Comparable<Cow> {

	int id;
	int latestWeight;
	int lowestWeight;
	int avgMilk;
	int totalMilk;
	int numOfMilkings; // to compute avgMilk
	int timestamp; // has to be the latest

	/**
	 * Constructor for Cow class. Initializes the values for cow object.
	 * 
	 * @param id the id of the cow object
	 */
	public Cow(int id) {
		this.id = id;
		this.latestWeight = 0;
		this.lowestWeight = Integer.MAX_VALUE;
		this.avgMilk = 0;
		this.totalMilk = 0;
		this.numOfMilkings = 0;
		this.timestamp = 0;
	}

	/**
	 * Gets the total milk produced by the cow in pounds
	 * 
	 * @return the total milk produced by the cow in pounds
	 */
	public int getTotalMilk() {
		return totalMilk;
	}

	/**
	 * Sets the total milk produced by the cow in pounds
	 * 
	 * @param totalMilk the total milk produced by the cow in pounds to be set
	 */
	public void setTotalMilk(int totalMilk) {
		this.totalMilk += totalMilk;
	}

	/**
	 * Gets the ID of the cow
	 * 
	 * @return the ID of the cow
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the ID of the cow
	 * 
	 * @param id the ID to be set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the latest weight of the cow in pounds
	 * 
	 * @return the latest weight of the cow in pounds
	 */
	public int getLatestWeight() {
		return latestWeight;
	}

	/**
	 * Sets the latest weight of the cow in pounds
	 * 
	 * @param latestWeight the latest weight of the cow in pounds to be set
	 */
	public void setLatestWeight(int latestWeight) {
		this.latestWeight = latestWeight;
	}

	/**
	 * Gets the lowest weight of the cow in pounds
	 * 
	 * @return the lowest weight of the cow in pounds
	 */
	public int getLowestWeight() {
		return lowestWeight;
	}

	/**
	 * Sets the lowest weight of the cow in pounds
	 * 
	 * @param lowestWeight the lowest weight of the cow in pounds to be set
	 */
	public void setLowestWeight(int lowestWeight) {
		this.lowestWeight = lowestWeight;
	}

	/**
	 * Gets the average amount of milk produced by the cow in pounds
	 * 
	 * @return the average amount of milk produced by the cow in pounds
	 */
	public int getAvgMilk() {
		return avgMilk;
	}

	/**
	 * Sets the average amount of milk produced by the cow in pounds. This is
	 * calculated by taking the sum of all the milkings and dividing it by the
	 * number of milkings.
	 */
	public void setAvgMilk() {
		this.avgMilk = this.totalMilk / this.numOfMilkings;
	}

	/**
	 * Gets the number of milkings
	 * 
	 * @return the number of milkings
	 */
	public int getNumOfMilkings() {
		return numOfMilkings;
	}

	/**
	 * Increments the number of milkings
	 */
	public void incNumOfMilkings() {
		this.numOfMilkings = this.numOfMilkings + 1;
	}

	/**
	 * Gets the timestamp representing when a record was made
	 * 
	 * @return the timestamp
	 */
	public int getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp representing when a record was made
	 * 
	 * @param timestamp the timestamp
	 */
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
