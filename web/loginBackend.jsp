<%-- 
    Document   : loginBackend
    Created on : 04-Jan-2020, 21:25:18
    Author     : Malchiel
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login </title>
    </head>
    <body>
        <%!
            String usernameStored;
            String passwordStored;
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
        %>    
        <%       
        try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          usernameStored="";
          passwordStored="";
          String username = request.getParameter("username").trim();
          String email = request.getParameter("password").trim();
          String query = "SELECT * FROM `user` WHERE `email` =? AND `pass` =?";
          
          boolean verify = false;
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp", "root", "");
          ps = con.prepareStatement(query);
          rs = ps.executeQuery();
          boolean recordExists = rs.absolute(1);
          if(recordExists == true)
              verify = true;
          if(verify==true)
              response.sendRedirect("home.jsp");
          else
              response.sendRedirect("register.jsp");
          con.close();
            
        } catch(SQLException ex){
            out.write("An error has occured: " + ex.toString());
        }
        %>
    </body>
</html>
