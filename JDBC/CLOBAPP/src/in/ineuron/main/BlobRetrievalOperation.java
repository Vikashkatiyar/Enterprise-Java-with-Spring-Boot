package in.ineuron.main;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import in.ineuron.jdbcUtil.JdbcUtil;

public class BlobRetrievalOperation {
    public static void main(String[] args) throws SQLException, IOException {
    	 Connection connection=null;
    	 PreparedStatement pstmt=null;
    	 ResultSet resultSet=null;
    	 FileOutputStream fos=null;
    	 
    	 try {
    		 connection=JdbcUtil.getJdbcConnection();
    		 String sqlSelectQuery="select name,image from person where name=?";
    		 String name="vikash";
    		 if(connection!=null) {
    			 pstmt=connection.prepareStatement(sqlSelectQuery);
    			 
    		 }
    		 
    		 if(pstmt!=null) {
    			 //set the name
    			 pstmt.setString(1,name);
    		     
    			 resultSet=pstmt.executeQuery();
    		 }
    		 
    		 if(resultSet!=null) {
    			 if(resultSet.next()) {
    				 //feting the name
    				 String username=resultSet.getString(1);
    				 
    				 //fetching the image and keeping it in harddisk(just like downloading)
    				 InputStream is=resultSet.getBinaryStream(2);
    				 
    				 
    				 String fileName="vikash_download.jpg";
    				 File file=new File(fileName); //create a new file with filename=vikash_download.jpg
    				 fos=new FileOutputStream(file);
    				 
    				 /*
    				  //when we not using IOJar then use this logic
    				 byte[] buffer=new byte[2048];
    				 while(is.read(buffer)>0) {
    					 fos.write(buffer);
    				 }
    				 fos.flush();
    				 */
    				 
    				 
    				 //using IOJar 
    				 IOUtils.copy(is, fos);
    				 
    				 System.out.println(username);
    				 System.out.println("file is saved to the location :: "+file.getAbsolutePath());
    				 
    			 }
    			 else {
    				System.out.println("record not available for the given :: " + name); 
    			 }
    		 }
    		 
    		 
    	 }catch(SQLException e) {
    		 e.printStackTrace();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 finally {
    		 JdbcUtil.closeConnection(null,pstmt,connection);
    		 if(fos!=null) {
    			 fos.close();
    		 }
    	 }
    }
}
