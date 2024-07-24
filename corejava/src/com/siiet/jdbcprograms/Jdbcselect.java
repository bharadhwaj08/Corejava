package com.siiet.jdbcprograms;

import java.sql.*;

import javax.sql.*;// step1:import packages
public class Jdbcselect {

	private static final String Qty = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // step2: load and register the driver 
		//step3: Establish connection
		try
		{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","Bwaj@8686");
			//step4:create statement
			Statement st=conn.createStatement();
			//step5:excute query
			
			String strselect="select maths,price,Qty from TN_student";
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			int rowcount=0;
			while(rst.next()) {
				String maths=rst.getString("maths");
				int price=rst.getInt("Qty");
				System.out.println(maths+""+price+""+Qty);
				++rowcount;
			}
		}
		catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
