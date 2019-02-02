package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DonorBean;
import service.DonorService;
import controller.Insert;

public class DonorDAO {
public int insertEmployee(DonorBean don){
		
		Connection conn=null;
		
		int count=0;
		
		if(don!=null){
		
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP", "aen101core", "aen101core");
				String psQuery="INSERT INTO TBL_DONOR_1437713 values(?,?,?,?,?,?,?)";
				
				PreparedStatement ps= conn.prepareStatement(psQuery);
				ps.setString(1,don.getDonorID());
				ps.setString(2,don.getName());
				ps.setString(3,don.getDOB());
				ps.setString(4,don.getAddress());
				ps.setString(5,don.getPhone());
				ps.setString(6,don.getGender());
				ps.setString(7,don.getBloodGroup());
				
				count= ps.executeUpdate();
				
				
			}
			catch(SQLException sqlex){
				
				System.out.println(" SQL Exception Occured "+ sqlex.getMessage() );
			}
			catch(Exception e){
				
				System.out.println(" Exception Occured "+ e.getMessage() );
			}
			finally{
				
				if(conn!=null){
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return count;
	}
	

public List<DonorBean> selectDonor(String id){
	
	List<DonorBean> DonList= new ArrayList<DonorBean>();
	
	Connection conn=null;
	
	ResultSet rs=null;

		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP", "aen101core", "aen101core");
			String psQuery="SELECT * FROM TBL_DONOR_1437713 WHERE DONARID=?";
			
			PreparedStatement ps= conn.prepareStatement(psQuery);
			ps.setString(1,id);

			rs= ps.executeQuery();
			
			while(rs.next()){
		
				DonList.add(new DonorBean(rs.getString("DONARID"),rs.getString("NAME"),rs.getString("DOB"),rs.getString("ADDRESS"),rs.getString("PHONE"),rs.getString("GENDER"),rs.getString("BLOOD_GROUP")));
				
			}
			
			
		}
		catch(SQLException sqlex){
			
			System.out.println(" SQL Exception Occured "+ sqlex.getMessage() );
		}
		catch(Exception e){
			
			System.out.println(" Exception Occured "+ e.getMessage() );
		}
		finally{
			
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	

	
	return DonList;
}


public int updateDonor(String donorid, String name){
Connection conn=null;

int count=0;

	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP", "aen101core", "aen101core");
		String psQuery="update TBL_DONOR_1437713 set name=? where donarid=?";
		
		
		PreparedStatement ps= conn.prepareStatement(psQuery);
		ps.setString(2, donorid);
		ps.setString(1, name);	
		count= ps.executeUpdate();
		
		
	}
	catch(SQLException sqlex){
		
		System.out.println(" SQL Exception Occured "+ sqlex.getMessage() );
	}
	catch(Exception e){
		
		System.out.println(" Exception Occured "+ e.getMessage() );
	}
	finally{
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

return count;
}
public int deleteEmployee(String Id){
Connection conn=null;

int count=0;



	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP", "aen101core", "aen101core");
		String psQuery="delete from TBL_DONOR_1437713 where donarid=?";
		
		PreparedStatement ps= conn.prepareStatement(psQuery);
		ps.setString(1,Id);
		
		
		count= ps.executeUpdate();
		
		
	}
	catch(SQLException sqlex){
		
		System.out.println(" SQL Exception Occured "+ sqlex.getMessage() );
	}
	catch(Exception e){
		
		System.out.println(" Exception Occured "+ e.getMessage() );
	}
	finally{
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

return count;
}
}
