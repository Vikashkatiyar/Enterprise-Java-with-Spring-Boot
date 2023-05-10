package in.ineuron.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import in.ineuron.jdbcUtil.JdbcUtil;

public class BlobInsertOperation {
    public static void main(String[] args) throws SQLException {
    	 Connection connection=null;
    	 PreparedStatement pstmt=null;
    	 
    	 try {
    		 connection=JdbcUtil.getJdbcConnection();
    		 String sqlInsertQuery="insert into person(`name`,`image`) values(?,?)";
    		 if(connection!=null) {
    			 pstmt=connection.prepareStatement(sqlInsertQuery);
    			 
    		 }
    		 
    		 if(pstmt!=null) {
    			 //set the name
    			 pstmt.setString(1,"vikash");
    			 //set the image 
    			 File f=new File("vikashimage.jpg");
    			 FileInputStream fis=new FileInputStream(f);
    			 pstmt.setBlob(2,fis);
    			 
    			 System.out.println("Inserting image from :: "+ f.getAbsolutePath());
    			 
    			 //executing the query
    			 int noOfRows=pstmt.executeUpdate();
    			 if(noOfRows==1) {
    				 System.out.println("record inserted successfully :: ...");
    			 }
    			 else {
    				 System.out.println("No record inserted...");
    			 }
    			 
    		 }
    		 
    		 
    	 }catch(SQLException | FileNotFoundException e) {
    		 e.printStackTrace();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 finally {
    		 JdbcUtil.closeConnection(null,pstmt,connection);
    	 }
    }
}
