import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		  BufferedReader inFile = new BufferedReader(new FileReader("data.txt"));
		  String[] info;
		  String nextLine;
		  int id;
		  String type;
		  int val;
		  int time;
		  HashMap<Integer, Cow> cows = new HashMap<Integer, Cow>();
		  while((nextLine = inFile.readLine()) != null)
		  {
			  if(nextLine.length()<5)continue; // skips first line that has number of records
			  
		      info  = nextLine.split(" ");
		      id = Integer.parseInt(info[0]);
		      type = info[1];
		      val = Integer.parseInt(info[2]);
		      time = Integer.parseInt(info[3]);
		      //check if the cow is in hashset, if it is then update it
		      //else make  a new object and update it.
		      if(cows.containsKey(id)) { 
		    	  if(type.equals("M")) {

		    		  cows.get(id).incNumOfMilkings();
		    		  cows.get(id).setTotalMilk(val);
		    		  cows.get(id).setAvgMilk();

		    	  }
		    	  if(type.equals("W")) {
		    		  if(time<cows.get(id).getTimestamp()) {
		    			  cows.get(id).setTimestamp(time);
		    			  cows.get(id).setLatestWeight(val);
		    		  }
		    		  if(val<cows.get(id).getLowestWeight()) {
		    			  cows.get(id).setLowestWeight(val);
		    		  }
		    	  }
		    	  
		      }else {
		    	  cows.put(id, new Cow(id));
		    	  if(type.equals("M")) {

		    		  cows.get(id).incNumOfMilkings();
		    		  cows.get(id).setTotalMilk(val);
		    		  cows.get(id).setAvgMilk();

		    	  }
		    	  if(type.equals("W")) {
		    		  if(time<cows.get(id).getTimestamp()) {
		    			  cows.get(id).setTimestamp(time);
		    			  cows.get(id).setLatestWeight(val);
		    		  }
		    		  if(val<cows.get(id).getLowestWeight()) {
		    			  cows.get(id).setLowestWeight(val);
		    		  }
		    	  }
		      }

		  }
		  System.out.println(cows);
	}

}
