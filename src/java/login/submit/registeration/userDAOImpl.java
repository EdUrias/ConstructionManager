/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.submit.registeration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Malchiel
 */


public class userDAOImpl implements MyProvider{
    static Connection con;
    static PreparedStatement ps;
    
    public int insertUser(user c){
        int status = 0;
        try{
            con=MyConnectionProvider.getCon();
            ps=con.prepareStatement("insert into customer values(?,?");
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPassword());
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
    public user getUser(String userId, String password){
        user c = new user();
        
        try{
            con=MyConnectionProvider.getCon();
            ps=con.prepareStatement("select * from user where userId=? and password=?");
            ps.setString(1, userId);
            ps.setString(2, password);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
//                c.setUsername(rs.getString(1));
//                c.setPassword(rs.getString(2));
//                c.setEmail(rs.getString(3));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
