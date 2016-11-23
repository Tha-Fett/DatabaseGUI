import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.awt.*;


public class Frame{

public static void main(String args[]){

JFrame window = new JFrame();
window.setLayout(new BorderLayout(2,1));

JPanel panel = new JPanel();
panel.setLayout(null);
panel.setPreferredSize(new Dimension(200,205));
Color myColor = new Color(255,102,0);
panel.setBackground(myColor);

JButton Button1 = new JButton("Weekly Earnings");
Button1.setBounds(20,170,150,30);
panel.add(Button1);

JButton Button2 = new JButton("Add Customer");
Button2.setBounds(200,170,150,30);
panel.add(Button2);

JButton Button3 = new JButton("Add Vehicle");
Button3.setBounds(380,170,150,30);
panel.add(Button3);

JButton Button4 = new JButton("Add/Modify Rent Rates");
Button4.setBounds(560,170,200,30);
panel.add(Button4);

JButton Button5 = new JButton("Rentals");
Button5.setBounds(790,170,150,30);
panel.add(Button5);

JButton Button6 = new JButton("Rental Return");
Button6.setBounds(970,170,150,30);
panel.add(Button6);

final JPanel ParentPanel = new JPanel();
ParentPanel.setBackground(new Color(0,51,255));
ParentPanel.setLayout(new CardLayout());
final JPanel FirstPanel = new JPanel();
final JPanel SecondPanel = new JPanel();
final JPanel ThirdPanel = new JPanel();
final JPanel FourthPanel = new JPanel();
final JPanel FifthPanel = new JPanel();
final JPanel SixthPanel = new JPanel();
FirstPanel.setLayout(null);
FirstPanel.setBackground(new Color(0,51,255));
SecondPanel.setBackground(new Color(0,51,255));
SecondPanel.setLayout(null);
ThirdPanel.setBackground(new Color(0,51,255));
ThirdPanel.setLayout(null);
FourthPanel.setBackground(new Color(0,51,255));
FourthPanel.setLayout(null);
FifthPanel.setBackground(new Color(0,51,255));
FifthPanel.setLayout(null);
SixthPanel.setBackground(new Color(0,51,255));
SixthPanel.setLayout(null);

JLabel Text = new JLabel();
Text.setText("Weekly Earnings By: ");
Text.setBounds(0,0,150,30);

JLabel Text_Name = new JLabel();
JLabel Text_Phone = new JLabel();
JLabel Text_VType = new JLabel();
JLabel Text_VType2 = new JLabel();
JLabel Text_Model = new JLabel();
JLabel Text_Year = new JLabel();
JLabel Text_DR = new JLabel();
JLabel Text_WR = new JLabel();
JLabel Text_CustId = new JLabel();
JLabel Text_StrtD = new JLabel();
JLabel Text_RentType = new JLabel();
JLabel Text_No_of = new JLabel();
JLabel Text_VType3 = new JLabel();
JLabel Text_CustId2 = new JLabel();
JLabel Text_VNum = new JLabel();
JLabel Text_StartD = new JLabel();
JLabel Text_BWeek = new JLabel();

Text_Name.setText("Name: ");
Text_Phone.setText("Phone Number(xxx-xxx-xxxx): ");
Text_VType.setText("Vehicle Type: ");
Text_VType2.setText("Vehicle Type: ");
Text_Model.setText("Model: ");
Text_Year.setText("Year: ");
Text_DR.setText("Daily Rate: ");
Text_WR.setText("Weekly Rate: ");
Text_CustId.setText("Customer ID: ");
Text_StrtD.setText("Start Date: ");
Text_RentType.setText("Rental Type: ");
Text_No_of.setText("Number of Days/Weeks: ");
Text_VType3.setText("Vehicle Type: ");
Text_CustId2.setText("Customer ID: ");
Text_VNum.setText("Vehicle Number: ");
Text_StartD.setText("Start Date: ");
Text_BWeek.setText("Beginning of weekly earnings: ");

JButton AddCus = new JButton("ADD CUSTOMER");
JButton ShowCus = new JButton("SHOW ALL CUSTOMERS");
JButton AddV = new JButton("ADD VEHICLE");
JButton ShowV = new JButton("SHOW ALL VEHICLES");
JButton AddRate = new JButton("ADD RATE");
JButton ShowRate = new JButton("SHOW RATES");
JButton ModR = new JButton("MODIFY RATE");
JButton AddRTL = new JButton("ADD RENTAL");
JButton ShowRTL = new JButton("SHOW ALL RENTALS");
JButton Return = new JButton("RETURN RENTAL");
JButton ShowEarn = new JButton("SHOW EARNINGS");

final JTextArea SQLDump = new JTextArea();
final JTextArea SQLDump2 = new JTextArea();
final JTextArea SQLDump3 = new JTextArea();
final JTextArea SQLDump4 = new JTextArea();
final JTextArea SQLDump5 = new JTextArea();
final JTextArea SQLDump6 = new JTextArea();
SQLDump.setEditable(false);
SQLDump2.setEditable(false);
SQLDump3.setEditable(false);
SQLDump4.setEditable(false);
SQLDump5.setEditable(false);
SQLDump6.setEditable(false);
JScrollPane scroll = new JScrollPane(SQLDump);
JScrollPane scroll2 = new JScrollPane(SQLDump2);
JScrollPane scroll3 = new JScrollPane(SQLDump3);
JScrollPane scroll4 = new JScrollPane(SQLDump4);
JScrollPane scroll5 = new JScrollPane(SQLDump5);
JScrollPane scroll6 = new JScrollPane(SQLDump6);
scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroll.setBounds(200,100,800,300);
scroll2.setBounds(200,100,800,300);
scroll3.setBounds(200,100,800,300);
scroll4.setBounds(200,100,800,300);
scroll5.setBounds(200,100,800,300);
scroll6.setBounds(200,100,800,300);
AddCus.setBounds(700,0,150,30);
ShowCus.setBounds(900, 0,200,30);
AddV.setBounds(800,0,150,30);
ShowV.setBounds(1000,0,200,30);
AddRate.setBounds(800,0,150,30);
ShowRate.setBounds(1200,0,150,30);
ModR.setBounds(1000,0,150,30);
AddRTL.setBounds(1210,0,130,30);
ShowRTL.setBounds(1100,100,200,30);
Return.setBounds(800,0,200,30);
ShowEarn.setBounds(800,0,200,30);

Text_Name.setBounds(50,0,150,30);
Text_Phone.setBounds(300,0,200,30);
Text_VType.setBounds(50,0,150,30);
Text_VType2.setBounds(50,0,150,30);
Text_Model.setBounds(300,0,150,30);
Text_Year.setBounds(550,0,150,30);
Text_DR.setBounds(270,0,150,30);
Text_WR.setBounds(515,0,150,30);
Text_CustId.setBounds(50,0,150,30);
Text_StrtD.setBounds(300,0,150,30);
Text_RentType.setBounds(500,0,150,30);
Text_No_of.setBounds(700,0,200,30);
Text_VType3.setBounds(1000,0,150,30);
Text_CustId2.setBounds(50,0,150,30);
Text_VNum.setBounds(300,0,150,30);
Text_StartD.setBounds(530,0,150,30);
Text_BWeek.setBounds(350,0,200,30);

final JTextField Name = new JTextField(15);
final JTextField Phone = new JTextField(12);
final JTextField Model = new JTextField(15);
final JTextField Year = new JTextField(4);
final JTextField DR = new JTextField(7);
final JTextField WR = new JTextField(7);
final JTextField CustId = new JTextField(4);
final JTextField StrtD = new JTextField(10);
final JTextField No_of = new JTextField(4);
final JTextField CustId2 = new JTextField(4);
final JTextField VNum = new JTextField(5);
final JTextField StartD = new JTextField(10);
final JTextField BWeek = new JTextField(10);

Name.setBounds(100,0,150,30);
Phone.setBounds(500,0,150,30);
Model.setBounds(350,0,150,30);
Year.setBounds(590,0,150,30);
DR.setBounds(350,0,150,30);
WR.setBounds(600,0,150,30);
CustId.setBounds(140,0,150,30);
StrtD.setBounds(370,0,120,30);
No_of.setBounds(860,0,100,30);
CustId2.setBounds(140,0,150,30);
VNum.setBounds(405,0,120,30);
StartD.setBounds(600,0,150,30);
BWeek.setBounds(550,0,150,30);

final JComboBox Box = new JComboBox();
final JComboBox VBox = new JComboBox();
final JComboBox VBox2 = new JComboBox();
final JComboBox VBox3 = new JComboBox();
final JComboBox RTBox = new JComboBox();
RTBox.setBounds(600,0,83,30);
RTBox.addItem("Daily");
RTBox.addItem("Weekly");
Box.setBounds(150,0,83,30);
Box.addItem("Owner");
Box.addItem("Car Type");
Box.addItem("Car Unit");
VBox.setBounds(150,0,83,30);
VBox.addItem("Compact");
VBox.addItem("Medium");
VBox.addItem("Large");
VBox.addItem("SUV");
VBox.addItem("Truck");
VBox.addItem("Van");
VBox2.setBounds(150,0,83,30);
VBox2.addItem("Compact");
VBox2.addItem("Medium");
VBox2.addItem("Large");
VBox2.addItem("SUV");
VBox2.addItem("Truck");
VBox2.addItem("Van");
VBox3.setBounds(1090,0,83,30);
VBox3.addItem("Compact");
VBox3.addItem("Medium");
VBox3.addItem("Large");
VBox3.addItem("SUV");
VBox3.addItem("Truck");
VBox3.addItem("Van");

FirstPanel.add(Text);
FirstPanel.add(Box);
FirstPanel.add(BWeek);
FirstPanel.add(ShowEarn);
FirstPanel.add(Text_BWeek);
FirstPanel.add(scroll6);

SecondPanel.add(Text_Name);
SecondPanel.add(Text_Phone);
SecondPanel.add(Name);
SecondPanel.add(Phone);
SecondPanel.add(AddCus);
SecondPanel.add(ShowCus);
SecondPanel.add(scroll);

ThirdPanel.add(Text_VType);
ThirdPanel.add(Text_Model);
ThirdPanel.add(Text_Year);
ThirdPanel.add(VBox);
ThirdPanel.add(Model);
ThirdPanel.add(Year);
ThirdPanel.add(AddV);
ThirdPanel.add(ShowV);
ThirdPanel.add(scroll2);

FourthPanel.add(Text_VType2);
FourthPanel.add(VBox2);
FourthPanel.add(Text_DR);
FourthPanel.add(Text_WR);
FourthPanel.add(DR);
FourthPanel.add(WR);
FourthPanel.add(AddRate);
FourthPanel.add(ShowRate);
FourthPanel.add(ModR);
FourthPanel.add(scroll3);

FifthPanel.add(Text_CustId);
FifthPanel.add(Text_StrtD);
FifthPanel.add(Text_RentType);
FifthPanel.add(Text_No_of);
FifthPanel.add(Text_VType3);
FifthPanel.add(CustId);
FifthPanel.add(No_of);
FifthPanel.add(StrtD);
FifthPanel.add(VBox3);
FifthPanel.add(RTBox);
FifthPanel.add(AddRTL);
FifthPanel.add(scroll4);
FifthPanel.add(ShowRTL);

SixthPanel.add(Text_CustId2);
SixthPanel.add(Text_VNum);
SixthPanel.add(Text_StartD);
SixthPanel.add(CustId2);
SixthPanel.add(VNum);
SixthPanel.add(StartD);
SixthPanel.add(Return);
SixthPanel.add(scroll5);

ParentPanel.add(FirstPanel, "1");
ParentPanel.add(SecondPanel, "2");
ParentPanel.add(ThirdPanel, "3");
ParentPanel.add(FourthPanel, "4");
ParentPanel.add(FifthPanel, "5");
ParentPanel.add(SixthPanel, "6");

Button1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){
		CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
		cardLayout.show(ParentPanel, "1");
	}
});

Button2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){
		CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
                cardLayout.show(ParentPanel, "2");
	}
});


Button3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){
		CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
		cardLayout.show(ParentPanel, "3");
	}
});


Button4.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){
		CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
		cardLayout.show(ParentPanel, "4");
	}
});

Button5.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){
		CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
		cardLayout.show(ParentPanel, "5");
	}
});

Button6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
                CardLayout cardLayout = (CardLayout) ParentPanel.getLayout();
                cardLayout.show(ParentPanel, "6");
        }
});


AddCus.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){

             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                PreparedStatement stmt = null;

                String sql = "INSERT INTO CUSTOMER(Cust_id,Name,Phone) VALUES (id_seq.nextval," + "'" + Name.getText() + "'" + "," +  "'" + Phone.getText() + "'" + " )";
		stmt = con.prepareStatement(sql);
                stmt.executeUpdate(sql);
		Name.setText(null);
		Phone.setText(null);
          	con.commit();
		stmt.close();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }

});


AddV.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                PreparedStatement stmt = null;

                String sql = "INSERT INTO VEHICLE(Vehicle_no,V_type,Model,Year) VALUES (idv_seq.nextval,"  + "'" +  VBox.getSelectedItem().toString() + "'" + "," + "'" + Model.getText() + "'" + "," +  "'" + Year.getText() + "')";
                stmt = con.prepareStatement(sql);
                stmt.executeUpdate(sql);
                Model.setText(null);
                Year.setText(null);
                con.commit();
                stmt.close();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }

});



AddRate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                PreparedStatement stmt = null;

                String sql = "INSERT INTO RATES(V_type,Daily,Weekly) VALUES (" + "'" + VBox2.getSelectedItem().toString() + "'" + "," + "'" + DR.getText() + "'" +  "," + "'" + WR.getText() + "'" + ")";
                stmt = con.prepareStatement(sql);
                stmt.executeUpdate(sql);
                DR.setText(null);
                WR.setText(null);
                con.commit();
                stmt.close();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }

});

Return.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

                SQLDump5.setText(null);
             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                Statement stmt = null;
                stmt = con.createStatement();
                String sql = "SELECT Total FROM RENTS WHERE Cust_id = '" + CustId2.getText() + "' AND Vehicle_no = '" + VNum.getText() + "' AND Strt_date = TO_DATE('" + StartD.getText() + "','MM-DD-YYYY')";
                ResultSet rs = null;
                rs = stmt.executeQuery(sql);

                while(rs.next()){
                        SQLDump5.append( "Total Owed: " + rs.getString(1) + "\n\n");
                }
                con.commit();
                con.close();

                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                PreparedStatement stmt2 = null;

                String sql2 = "UPDATE RENTS SET Dropped_off = 'Yes' WHERE Cust_id = '" + CustId2.getText() + "' AND Vehicle_no = '" + VNum.getText() + "' AND Strt_date = TO_DATE('" + StartD.getText() + "','MM-DD-YYYY')";
                stmt2 = con2.prepareStatement(sql2);
                stmt2.executeUpdate(sql2);

		con2.commit();
		stmt2.close();
		con2.close();

		CustId2.setText(null);
		VNum.setText(null);
		StartD.setText(null);

                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }
});



ModR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                PreparedStatement stmt = null;

                String sql = "UPDATE RATES SET V_type =" + "'" + VBox2.getSelectedItem().toString() + "'" + "," + "Daily =" + "'" + DR.getText() + "'" + "," + "Weekly =" + "'" +  WR.getText() + "'";
                stmt = con.prepareStatement(sql);
                stmt.executeUpdate(sql);
                DR.setText(null);
                WR.setText(null);
                con.commit();
                stmt.close();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }

});





ShowCus.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e){

		SQLDump.setText(null);
	     try{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Pasword@omega:1521:CSE1");
		Statement stmt = null;
		stmt = con.createStatement();
		String sql = "SELECT * FROM CUSTOMER";
		ResultSet rs = null;
		rs = stmt.executeQuery(sql);

		while(rs.next()){
			SQLDump.append( "Customer ID: " + rs.getString(1) + "\n" + "Name: " + rs.getString(2) + "\n" +  "Phone: " + rs.getString(3) + "\n\n");
		}
                SQLDump.append("\n");
		con.commit();
		con.close();
		} catch (SQLException ex) {
			System.out.println("stuff");
		} catch (ClassNotFoundException ex) {
			System.out.println("Class not found");
		} catch (InstantiationException ex) {
			System.out.println("Instantation");
		} catch (IllegalAccessException ex) {
			System.out.println("Illegal Access");
		}
	}
});

ShowRTL.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

                SQLDump4.setText(null);
             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                Statement stmt = null;
                stmt = con.createStatement();
                String sql = "SELECT * FROM RENTS";
                ResultSet rs = null;
                rs = stmt.executeQuery(sql);

                while(rs.next()){
                        SQLDump4.append( "Vehicle No: " + rs.getString(1) + "\n" + "Customer ID: " + rs.getString(2) + "\n" +  "Start Date: " + rs.getString(3) + "\n" + "Rental Type: " + rs.getString(4) + "\n" + "Number of Days/Weeks: " + rs.getString(5) + "\n" + "Picked up: " + rs.getString(6) + "\n" + "Vehicle Type: " + rs.getString(7) + "\n" + "Date Return: " + rs.getString(8) + "\n" + "Total: " + rs.getString(9) + "\n" + "Dropped off: " + rs.getString(10) + "\n\n" );
                }
                SQLDump4.append("\n");
                con.commit();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }
});


AddRTL.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password2016@omega:1521:CSE1");
                Statement stmt = null;
                stmt = con.createStatement();

                String sql = "SELECT Vehicle_no FROM VEHICLE WHERE V_type =" + "'" + VBox3.getSelectedItem().toString() + "'";
                ResultSet rs = null;
                rs = stmt.executeQuery(sql);
		ArrayList<String>  ID = new ArrayList<String>();
                while(rs.next()){
                         ID.add(rs.getString(1));
                }
                for(int i = 0; i < ID.size(); i++){
			System.out.println(ID.get(i)+"\n");
		}
                con.commit();
	 	int Counter = 0;
		int Days = Integer.parseInt(No_of.getText());
		if(RTBox.getSelectedItem().toString().equals("Weekly")){
			Days = Days * 7;
		}
		for(int i = 0; i < ID.size(); i++){
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                	Connection con3 = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                	Statement stmt3 = null;
			con3.createStatement();
                	String sql3 = "SELECT * FROM RENTS WHERE Vehicle_no =" + ID.get(i) + "AND V_type =" + "'" + VBox3.getSelectedItem().toString() + "'" + "AND TO_DATE('" + StrtD.getText() + "','MM-DD-YYYY') BETWEEN Strt_date AND Date_ret OR Vehicle_no =" + ID.get(i) + "AND V_type =" + "'" + VBox3.getSelectedItem().toString() + "'" +  "AND TO_DATE('" + StrtD.getText() + "','MM-DD-YYYY') + INTERVAL '" + Days + "' DAY BETWEEN Strt_date AND Date_ret";
             		System.out.println(i);
			ResultSet rs3;
                	rs3 = stmt.executeQuery(sql3);
			if(!rs3.next()){
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		                Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                		PreparedStatement stmt2 = null;
				System.out.println("No data is shown");
				System.out.println(i);
				String sql2 = "INSERT INTO RENTS(Vehicle_no,Cust_id,Strt_date,R_type,No_of,Picked_up,V_type,Date_ret,Total,Dropped_off) VALUES (" + ID.get(i) + "," + CustId.getText() + "," + "TO_DATE('" + StrtD.getText() + "','MM-DD-YYYY')," + "'" + RTBox.getSelectedItem().toString() + "'" + "," + No_of.getText() + "," + "'Yes'," + "'" + VBox3.getSelectedItem().toString() + "'," + "TO_DATE('" + StrtD.getText() +  "','MM-DD-YYYY') + INTERVAL '" + Days + "' DAY,(SELECT " + RTBox.getSelectedItem().toString() +"*" + Days + " FROM RATES WHERE V_type = '" + VBox3.getSelectedItem() + "')," + "'No')";
				stmt2 = con2.prepareStatement(sql2);
		                stmt2.executeUpdate(sql2);
				SQLDump4.append("Rental Complete\n");
				con2.commit();
				con2.close();
				break;
			}
			else{
				System.out.println("Vehicle No :" + ID.get(i) + " Not Available");
				Counter = Counter + 1;
			}
			if(Counter == ID.size()){
				SQLDump4.append("There are no " + VBox3.getSelectedItem().toString() + " vehicles for those dates avialable at this time.");
			}
                	con3.commit();
			con3.close();
		}
		con.commit();
		con.close();

		CustId.setText(null);
		StrtD.setText(null);
		No_of.setText(null);

                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }
});

ShowEarn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

                SQLDump6.setText(null);
		if(Box.getSelectedItem().toString().equals("Car Type")){
			String[] VehTypes = {"Compact","Van","Large","Medium","Truck","SUV"};
             		try{
			for(int i = 0; i < VehTypes.length; i++){
                		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                		Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                		Statement stmt = null;
                		stmt = con.createStatement();
                		String sql = "SELECT SUM(Total) FROM RENTS WHERE V_type = '" + VehTypes[i] + "' AND Date_ret BETWEEN TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') AND TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') + INTERVAL '7' DAY";
                		ResultSet rs = null;
                		rs = stmt.executeQuery(sql);

                		while(rs.next()){
                        		SQLDump6.append( "Car Type:" + VehTypes[i] + "\n" +  "Total Earned: " + rs.getString(1) + "\n\n" );
                		}
                		SQLDump6.append("\n");
                		con.commit();
                		con.close();
			}
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
		}

                if(Box.getSelectedItem().toString().equals("Owner")){
                        try{
                            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                            Statement stmt = null;
                            stmt = con.createStatement();
                            String sql = "SELECT Name, SUM(Total) FROM INDIVIDUAL, OWNS, RENTS WHERE INDIVIDUAL.Owner_id = OWNS.Owner_id AND OWNS.Vehicle_no = RENTS.Vehicle_no AND Date_ret BETWEEN TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') AND TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') + INTERVAL '7' DAY GROUP BY Name";
                            ResultSet rs = null;
                            rs = stmt.executeQuery(sql);

                            while(rs.next()){
                                    SQLDump6.append("Owner: " + rs.getString(1) + "\n" + "Total Earned: " + rs.getString(2) + "\n\n" );
                            }
                            SQLDump6.append("\n");
                            con.commit();



                            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                            con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                            stmt = null;
                            stmt = con.createStatement();
                            sql = "SELECT C_name, SUM(Total) FROM RENTAL_CO, OWNS, RENTS WHERE RENTAL_CO.Owner_id = OWNS.Owner_id AND OWNS.Vehicle_no = RENTS.Vehicle_no AND Date_ret BETWEEN TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') AND TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') + INTERVAL '7' DAY GROUP BY C_name";
                            rs = null;
                            rs = stmt.executeQuery(sql);

                            while(rs.next()){
                                    SQLDump6.append("Owner: " + rs.getString(1) + "\n" + "Total Earned: " + rs.getString(2) + "\n\n" );
                            }
                            SQLDump6.append("\n");

			    con.commit();


                            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                            con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                            stmt = null;
                            stmt = con.createStatement();
                            sql = "SELECT B_name, SUM(Total) FROM BANK, OWNS, RENTS WHERE BANK.Owner_id = OWNS.Owner_id AND OWNS.Vehicle_no = RENTS.Vehicle_no AND Date_ret BETWEEN TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') AND TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') + INTERVAL '7' DAY GROUP BY B_name";
                            rs = null;
                            rs = stmt.executeQuery(sql);

                            while(rs.next()){
                                    SQLDump6.append("Owner: " + rs.getString(1) + "\n" + "Total Earned: " + rs.getString(2) + "\n\n" );
                            }
                            SQLDump6.append("\n");

			    con.commit();
			    con.close();

                	} catch (SQLException ex) {
                        	System.out.println("stuff");
                	} catch (ClassNotFoundException ex) {
                        	System.out.println("Class not found");
                	} catch (InstantiationException ex) {
                        	System.out.println("Instantation");
                	}catch (IllegalAccessException ex) {
                        	System.out.println("Illegal Access");
                	}

        	}
                if(Box.getSelectedItem().toString().equals("Car Unit")){
                        String[] VehTypes = {"Compact","Van","Large","Medium","Truck","SUV"};
			String[] Owners = {"Name","C_name","B_name"};
			String[] Owner_type = {"INDIVIDUAL","RENTAL_CO","BANK"};
			Connection con = null;
                        try{
                        for(int i = 0; i < Owners.length; i++){
				for(int j = 0; j < VehTypes.length; j++){
                                	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                                	con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                                	Statement stmt = null;
                                	stmt = con.createStatement();
                                	String sql = "SELECT " + Owners[i] + ", SUM(Total) FROM " + Owner_type[i] + ", OWNS, RENTS WHERE " + Owner_type[i] + ".Owner_id = OWNS.Owner_id AND OWNS.Vehicle_no = RENTS.Vehicle_no AND RENTS.V_type = '" + VehTypes[j] + "' AND Date_ret BETWEEN TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') AND TO_DATE('" + BWeek.getText() + "','MM-DD-YYYY') + INTERVAL '7' DAY GROUP BY " + Owners[i];
                                	ResultSet rs = null;
                                	rs = stmt.executeQuery(sql);

                                	while(rs.next()){
                                        	SQLDump6.append( "Owner:" + rs.getString(1) + "\n" +  "Total Earned from " + VehTypes[j] + ": " + rs.getString(2) + "\n\n" );
                                	}

                                	con.commit();
				}
                     		con.commit();
                        }
			con.commit();
			con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
                }
		BWeek.setText(null);
	}
});



ShowV.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

                SQLDump2.setText(null);
             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                Statement stmt = null;
                stmt = con.createStatement();
                String sql = "SELECT * FROM VEHICLE";
                ResultSet rs = null;
                rs = stmt.executeQuery(sql);

                while(rs.next()){
                        SQLDump2.append( "Vehicle Number: " + rs.getString(1) + "\n" + "Type: " + rs.getString(2) + "\n" + "Model: " + rs.getString(3) + "\n" +  "Year: " + rs.getString(4) + "\n\n");
                }
                SQLDump2.append("\n");
                con.commit();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }
});


ShowRate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

                SQLDump3.setText(null);
             try{
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:Username/Password@omega:1521:CSE1");
                Statement stmt = null;
                stmt = con.createStatement();
                String sql = "SELECT * FROM RATES";
                ResultSet rs = null;
                rs = stmt.executeQuery(sql);

                while(rs.next()){
                        SQLDump3.append( "Vehicle Type: " + rs.getString(1) + "\n" + "Daily Rate: " + rs.getString(2) + "\n" +  "Weekly: " + rs.getString(3) + "\n\n");
                }
                SQLDump3.append("\n");
                con.commit();
                con.close();
                } catch (SQLException ex) {
                        System.out.println("stuff");
                } catch (ClassNotFoundException ex) {
                        System.out.println("Class not found");
                } catch (InstantiationException ex) {
                        System.out.println("Instantation");
                } catch (IllegalAccessException ex) {
                        System.out.println("Illegal Access");
                }
        }
});




window.setTitle("Toshe Station Rental");

window.setExtendedState(JFrame.MAXIMIZED_BOTH);
window.getContentPane().add(panel, BorderLayout.NORTH);
window.getContentPane().add(ParentPanel, BorderLayout.CENTER);


window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setVisible(true);
}
}
