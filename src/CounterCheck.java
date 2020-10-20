import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CounterCheck {
	public String strain;
	public String tseat;
	public String sold;
	public String available;
	
	public CounterCheck(String strain,String tseat, String sold, String available){
		
		this.strain=strain;
		this.tseat= tseat;
		this.sold= sold;
		this.available=available;
		
	
		
	}
	public void writeToFile2(){ // write the student records from array to file
		try {
			File f = new File("E:\\Study\\Course\\CSE215L\\Project\\src\\Counter.txt");
			FileWriter fw = new FileWriter(f);
			
			CounterCheck a = new CounterCheck ("DHUMKETU", "50", "0", "50");
			CounterCheck b = new CounterCheck ("Nill Shagor", "50", "0", "50");
			CounterCheck c = new CounterCheck ("Parabat Express", "50", "0", "50");
			CounterCheck d = new CounterCheck ("Silkcity Express", "50", "0", "50");
			CounterCheck e = new CounterCheck ("SHUNDARBAN", "50", "0", "50");
			CounterCheck g = new CounterCheck ("Subarna Express", "50", "0", "50");
			
			fw.write("Train name :" +a.strain+ "Total Seat :" +a.tseat+ "Sold Ticket :" +a.sold+ "Available Ticket :" +a.available+"\n");
			fw.write("Train name :" +b.strain+ "Total Seat :" +b.tseat+ "Sold Ticket :" +b.sold+ "Available Ticket :" +b.available);
			fw.write("Train name :" +c.strain+ "Total Seat :" +c.tseat+ "Sold Ticket :" +c.sold+ "Available Ticket :" +c.available);
			fw.write("Train name :" +d.strain+ "Total Seat :" +d.tseat+ "Sold Ticket :" +d.sold+ "Available Ticket :" +d.available);
			fw.write("Train name :" +e.strain+ "Total Seat :" +e.tseat+ "Sold Ticket :" +e.sold+ "Available Ticket :" +e.available);
			fw.write("Train name :" +g.strain+ "Total Seat :" +g.tseat+ "Sold Ticket :" +g.sold+ "Available Ticket :" +g.available);
			
			
		
			
			fw.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

	
	

	@Override
	public String toString() {
		return "Cancel_Reservation [strain=" + strain + ", tseat=" + tseat
				+ ", sold=" + sold + ", available=" + available + "]";
	}
	

}