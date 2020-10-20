
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Menu implements ActionListener{
	
	//WINDOW FRAME
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frame4;
	private JFrame frame5;
	private JFrame frame6;
	private JFrame frame7;
	
	//SET MENUBAR.....
	private JMenuBar menubar;
	private JMenu file;
	private JMenu edit;
	private JMenu source;
	private JMenu refactor;
	private JMenu navigate;
	private JMenu window;
	private JMenu help;
	
	//file item
	private JMenuItem n;
	private JMenuItem open;
	private JMenuItem save;
	private JMenuItem saveas;
	private JMenuItem rename;
	private JMenuItem exit;
	
	//edit item
	private JMenuItem undo;
	private JMenuItem copy;
	private JMenuItem cut;
	private JMenuItem paste;
	private JMenuItem delete;
	
	
	
	private JButton reservation;
	private JButton counter;
	private JButton traininfo;
	private JButton fare;
	private JButton cancel;
	private JButton term;
	private JButton home;
	private JButton submit;
	private JButton clear;
	private JButton previous;
	
	//RESERVATION'S INTERFACE
	//LABELS
	
	private JLabel  strain;
	private JLabel destination;
	private JLabel stpoint;
	private JLabel sclass;
	private JLabel fareL;
	private JLabel name;
	private JLabel phn;
	private JLabel age;
	
	//RESERVATION'S JTEXTFIELDS
	private JTextField fareT;
	private JTextField nseat;
	private JTextField nameT;
	private JTextField phnT;
	private JTextField ageT;
	
	//RESERVATION'S JCOMBOBOX
	private JComboBox strainC;
	private JComboBox destinationC;
	private JComboBox stpointC;
	private JComboBox sclassC;
	
	//COUNTER CHECK INTERFACE
	//LEBELS
	private JLabel tseat;
	private JLabel sold;
	private JLabel aseat;
	
	//TEXTFIELDS
	private JTextField tseatT;
	private JTextField soldT;
	private JTextField aseatT; 
	//TRAIN INFORMATION INTERFACE
	
	
	//Cancel reservation interface
	
	private JTextField srchT;
	private JButton srch;
	
	
	private Person[] persons;
	
	public Menu(){
		frame = new JFrame();
		
		reservation = new JButton("RESERVATION");
		 counter= new JButton("COUNTER CHECK");
		 traininfo = new JButton("TRAIN INFORMATION");
		 fare = new JButton("FARE");
		 cancel = new JButton("CANCEL RESERVATION");
		 term = new JButton("TERM & POLICY");
		 

			menubar = new JMenuBar();
			
			file = new JMenu("File");
			
			n = new JMenuItem("New");
			n.addActionListener(this);
	
			open = new JMenuItem("Open");
			open.addActionListener(this);
			
			save = new JMenuItem("Save");
			save.addActionListener(this);
			
			saveas = new JMenuItem("Save as");
			saveas.addActionListener(this);
			
			rename = new JMenuItem("Rename");
			rename.addActionListener(this);
			
			exit = new JMenuItem("Exit");
			exit.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 					 
				 }
			 });
			
			edit= new JMenu("Edit");
			edit.addActionListener(this);
			
			undo = new JMenuItem("Undo Typing");
			undo.addActionListener(this);
			
			copy = new JMenuItem("Copy");
			copy.addActionListener(this);
			
			cut= new JMenuItem("Cut");
			cut.addActionListener(this);
			
			paste= new JMenuItem("Paste");
			paste.addActionListener(this);
			
			delete= new JMenuItem("Delete");
			delete.addActionListener(this);
			
			
			
			source= new JMenu("Source");
			refactor= new JMenu("Refactor");
			navigate= new JMenu("Navigate");
			window = new JMenu("Window");
			help = new JMenu("Help");
			
		 reservation.addActionListener(this);
		 counter.addActionListener(this);
		 traininfo.addActionListener(this);
		 fare.addActionListener(this);
		 cancel.addActionListener(this);
		 term.addActionListener(this);
		 
		 GridLayout g = new GridLayout(3,2);
		 frame.setLayout(g);
		 
		 frame.add(reservation);
		 frame.add(counter);
		 frame.add(traininfo);
		 frame.add(fare);
		 frame.add(cancel);
		 frame.add(term);
		 
		 	
			frame.setJMenuBar(menubar);
			
			menubar.add(file);
			menubar.add(edit);
			menubar.add(source);
			menubar.add(refactor);
			menubar.add(navigate);
			menubar.add(window);
			menubar.add(help);
			
			file.add(n);
			file.add(open);
			file.add(save);
			file.add(saveas);
			file.add(rename);
			file.add(exit);
			
			edit.add(undo);
			edit.add(copy);
			edit.add(cut);
			edit.add(paste);
			edit.add(delete);
		
		 
		 frame.setVisible(true);
		 	
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 260);
			frame.setLocation(200, 100);
			frame.setTitle("বাংলাদেশ রেলওয়ে");
	}


	public void writeToFile(){ // write the student records from array to file
		try {
			File f = new File("E:\\Study\\Course\\CSE215L\\Project\\src\\Railway.txt");
			FileWriter fw = new FileWriter(f);
			
			for(int i = 0; i < persons.length; i++){
				if(persons[i] != null){
					fw.write("Name :" +persons[i].getName()); // write id in one line
					fw.write("\n");
					fw.write("Phone Number :"+persons[i].getPhn()); // write name in another line
					fw.write("\n");
					fw.write("Age :"+persons[i].getAge());
					fw.write("\n");
					fw.write("Train Name :"+persons[i].getStrain());
					fw.write("\n");
					fw.write("Destination :"+persons[i].getDestination());
					fw.write("\n");
					fw.write("Starting Point :"+persons[i].getStpoint());
					fw.write("\n");
					fw.write("Seat Class :"+persons[i].getSclass());
					fw.write("\n");
					fw.write("Fare :"+persons[i].getFare());
					fw.write("\n");
				}
			}
			
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readFromFile(){ // read the students records from file and store in an array
		try {
			File f = new File("E:\\Study\\Course\\CSE215L\\Project\\src\\Railway.txt");
			Scanner s = new Scanner(f);
			persons = new Person [50]; // since we don't know the exact number of records, initialize the array to a reasonably sized one
			int i = 0;
			
			while(s.hasNextLine()){
				String a = s.nextLine(); // read id;
				String b = s.nextLine();
				String c = s.nextLine();
				String d = s.nextLine();
				String e = s.nextLine();
				String g = s.nextLine();
				String h = s.nextLine();
				String j = s.nextLine();
				Person temp = new Person (a,b,c,d,e,g,h,j); // create Student object
				persons[i] = temp; // store in array
				i++;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
 
	public void addPerson(Person p){ // adds the student object into array
		// find an available index first
		int index = 0;
		persons = new Person[50];
		
		for(int i = 0; i < persons.length; i++){
			if(persons[i] == null){ // location available
				index = i;
				break;
			}
		}
		
		if(index < persons.length){
			persons[index] = p;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == reservation){
			
			frame2 = new JFrame();
			
			menubar = new JMenuBar();
			
			file = new JMenu("File");
			
			n = new JMenuItem("New");
			n.addActionListener(this);
	
			open = new JMenuItem("Open");
			open.addActionListener(this);
			
			save = new JMenuItem("Save");
			save.addActionListener(this);
			
			saveas = new JMenuItem("Save as");
			saveas.addActionListener(this);
			
			rename = new JMenuItem("Rename");
			rename.addActionListener(this);
			
			exit = new JMenuItem("Exit");
			exit.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 					 
				 }
			 });
			
			edit= new JMenu("Edit");
			edit.addActionListener(this);
			
			undo = new JMenuItem("Undo Typing");
			undo.addActionListener(this);
			
			copy = new JMenuItem("Copy");
			copy.addActionListener(this);
			
			cut= new JMenuItem("Cut");
			cut.addActionListener(this);
			
			paste= new JMenuItem("Paste");
			paste.addActionListener(this);
			
			delete= new JMenuItem("Delete");
			delete.addActionListener(this);
			
			source= new JMenu("Source");
			refactor= new JMenu("Refactor");
			navigate= new JMenu("Navigate");
			window = new JMenu("Window");
			help = new JMenu("Help");
			
			
			
			 strain = new JLabel("SELECT TRAIN");
			 destination = new JLabel("DESTINATION");
			 stpoint = new JLabel("START TRAVELING ");
			 sclass = new JLabel("Class");
			 fareL = new JLabel("FARE");
			 name= new JLabel("NAME");
			 phn = new JLabel("CONTRACT NUMBER");
			 age = new JLabel("AGE");
			 
			 String [] option1 = new String[]{"NONE","Subarna Express","Parabat Express","Turna Express","Lalmoni Express","Nill Shagor","Silkcity Express","DHUMKETU","CHITRA","Padma Express","Chittra Express",
					 "SHUNDARBAN","MOHANAGAR","Ekota Express","Rangpur Express","Agnibina Express"};
			 strainC = new JComboBox(option1);
			 String[] option2 = new String[]{"NONE","RAJSHAHI","NATORE","TANGAIL","DHAKA","ISHWARDI","CHATMOHOR","RANGPUR","KHULNA","NILPHAMARY"};
			 destinationC = new JComboBox(option2);
			 String[] option3 = new String[]{"NONE","RAJSHAHI","DHAKA","RANGPUR","KHULNA","NILPHAMARY","NATOR"};
			 stpointC = new JComboBox(option3);
			 String[] option4 = new String[]{"NONE","FIRST","SECOND","THIRD"};
			 sclassC = new JComboBox(option4);
			 
			 fareT= new JTextField();
			 nseat = new JTextField();
			 nameT = new JTextField();
			 phnT = new JTextField();
			 ageT = new JTextField();
			 
			 home= new JButton("Home");
			 home.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					frame2.setVisible(false);
					 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 
					 frame.setVisible(true);
					 
				 }
			 });
			 
			 
			 submit = new JButton("SUBMIT");
			 submit.setBackground(Color.white);
			 submit.setForeground(Color.red);
			 submit.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					 String y1 = nameT.getText();
					 String y2 = phnT.getText();
					 String y3 = ageT.getText();
					 String y4 = fareT.getText();
							
					 String x1 = strainC.getSelectedItem().toString();
					 String x2 = destinationC.getSelectedItem().toString();
					 String x3 = stpointC.getSelectedItem().toString();
					 String x4 = sclassC.getSelectedItem().toString();
					
					 Person p = new Person(y1,y2,y3,y4,x1,x2,x3,x4);
						System.out.println(p);
						
						addPerson(p);
						
						writeToFile();
					 
				 }
			 });
			 
			 
			 clear = new JButton("CLEAR");
			 clear.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					 fareT.setText("");
					 nameT.setText("");
					 nseat.setText("");
					 phnT.setText("");
					 ageT.setText("");
					 
						strainC.setSelectedIndex(0);
						destinationC.setSelectedIndex(0);
						stpointC.setSelectedIndex(0);
						sclassC.setSelectedIndex(0);
					 
				 }
			 });
			 
			
			 previous = new JButton("<");
			 previous.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					 
					 
					 frame.setVisible(true);
					 
					 
					frame2.setVisible(false);
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
					 
					 
				 }
			 });
			 
			 
			 GridLayout g = new GridLayout(5,2);
			 frame2.setLayout(g);
			 
			 frame2.add(strain);
			 frame2.add(strainC);
			 
			 frame2.add(name);
			 frame2.add(nameT);
			 
			 frame2.add(destination);
			 frame2.add(destinationC);
			 
			 frame2.add(phn);
			 frame2.add(phnT);
			 
			 frame2.add(stpoint);
			 frame2.add(stpointC);
			 
			 frame2.add(fareL);
			 frame2.add(fareT);
			 
			 frame2.add(sclass);
			 frame2.add(sclassC);
			 
			 
			 frame2.add(age);
			 frame2.add(ageT);
			 
			 frame2.add(home);
			 frame2.add(submit);
			 frame2.add(clear);
			 frame2.add(previous);
			 
			 frame2.setJMenuBar(menubar);
			 
			 	menubar.add(file);
			 	menubar.add(edit);
				menubar.add(source);
				menubar.add(refactor);
				menubar.add(navigate);
				menubar.add(window);
				menubar.add(help);
				
				file.add(n);
				file.add(open);
				file.add(save);
				file.add(saveas);
				file.add(rename);
				file.add(exit);
				
				edit.add(undo);
				edit.add(copy);
				edit.add(cut);
				edit.add(paste);
				edit.add(delete);
			 
			 
			 
			 frame.setVisible(false);
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setVisible(true);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setSize(500, 260);
				frame2.setLocation(200, 200);
				frame2.setTitle("RESERVATION");	
				
				
				
				
					}
		
			
		if(e.getSource() == counter){
			frame3 = new JFrame();
			strain = new JLabel("Select Train");
			tseat = new JLabel("Total Seat");
			sold = new JLabel("Sold Out");
			aseat = new JLabel("Available Seat");
			
			CounterCheck c= new CounterCheck(null,null,null,null);
			c.writeToFile2();
			
			String [] option1 = new String[]{"NONE","Subarna Express","Parabat Express","Turna Express","Lalmoni Express","Nill Shagor","Silkcity Express","DHUMKETU","CHITRA","Padma Express","Chittra Express",
					 "SHUNDARBAN","MOHANAGAR","Ekota Express","Rangpur Express","Agnibina Exxpress"};
			strainC= new JComboBox(option1);
			tseatT = new JTextField();
			soldT =new  JTextField();
			aseatT = new JTextField();
			
			
			
			if(strainC.getSelectedItem().toString().equals("Subarna Express")){
				tseatT = new JTextField();
				soldT =new  JTextField();
				aseatT = new JTextField();
			}
			
			
			home= new JButton("Home");
			 
			 home.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					frame3.setVisible(false);
					 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 
					 frame.setVisible(true);
					 
				 }
			 });
			 
			 
			 
			 submit= new JButton("SUBMIT");
			 submit.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					 String y1 = tseatT.getText();
					 String y2 = soldT.getText();
					 String y3 = aseatT.getText();
					
							
					 String x1 = strainC.getSelectedItem().toString();
					
					
					 CounterCheck c = new CounterCheck(y1,y2,y3,x1);
						System.out.println(c);
					 
				 }
			 });
			 
			 
			 
			 clear =new JButton("CLEAR");
			 clear.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
						strainC.setSelectedIndex(0);
				 }
			 });
			 
			 
			 previous = new JButton("<");
			 previous.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
					 
					 
					 frame3.setVisible(false);
					 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 
					frame2.setVisible(true);
					//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
					 
					 
				 }
			 });
			 
			 
			
			
			GridLayout g = new GridLayout(3,2);
			 frame3.setLayout(g);
			 
			 frame3.add(strain);
			 frame3.add(strainC);
			 
			 frame3.add(tseat);
			 frame3.add(tseatT);
			 
			 frame3.add(sold);
			 frame3.add(soldT);
			 
			 frame3.add(aseat);
			 frame3.add(aseatT);
			 
			 frame3.add(home);
			 frame3.add(submit);
			 frame3.add(clear);
			 frame3.add(previous);
			 
			 frame.setVisible(false);
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.setVisible(true);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setSize(500, 260);
				frame3.setLocation(200, 200);
				frame3.setTitle("COUNTER CHECK");
			 
			
		}	
		if(e.getSource() == traininfo){
			frame4= new JFrame();
			
			GridLayout g =new GridLayout(1,1);
			frame4.setLayout(g);
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame4.setVisible(true);
				frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame4.setSize(500, 260);
				frame4.setLocation(200, 200);
				frame4.setTitle("TRAIN INFORMATION");
		}	
		if(e.getSource() == fare){
			frame5= new JFrame();
			
			GridLayout g= new GridLayout(1,1);
			frame5.setLayout(g);
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame5.setVisible(true);
				frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame5.setSize(500, 260);
				frame5.setLocation(200, 200);
				frame5.setTitle("FARE");
			
			
		}	
		if(e.getSource() == cancel){
			frame6= new JFrame();
			
			srchT = new JTextField();
			srch = new JButton("Search");
			srch.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
						
				 }
			 });
			
			
			GridLayout g= new GridLayout(2,2);
			frame6.setLayout(g);
			
			
			frame6.add(srchT);
			frame6.add(srch);
			
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame6.setVisible(true);
				frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame6.setSize(500, 260);
				frame6.setLocation(200, 200);
				frame6.setTitle("CANCEL RESERVATION");
			
		}	
		if(e.getSource() == term){
			frame7= new JFrame();
			
			
			
			GridLayout g= new GridLayout(1,1);
			frame7.setLayout(g);
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame7.setVisible(true);
				frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame7.setSize(500, 260);
				frame7.setLocation(200, 200);
				frame7.setTitle("TERM & POLICY");
		
			
		}
		
		
		}	
		
	
}
	



