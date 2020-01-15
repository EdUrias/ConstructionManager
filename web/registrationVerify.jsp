<%-- 
    Document   : registerationVerifiy
    Created on : 13-Jan-2020, 15:54:01
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
        <title>Registration Verification</title>
    </head>
    <body>
        <%
            try{
              String sql = "insert into Register(username,email,password,password2,RegisterAs) value(?,?,?,?,?)";
              String username = request.getParameter("username").trim();
              String email = request.getParameter("email").trim();
              String password1 = request.getParameter("password1").trim();
              String password2 = request.getParameter("password2").trim();
              String regAs = request.getParameter("registerAs").trim();
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setString(1, username);
              ps.setString(2, email);
              ps.setString(3, password1);
              ps.setString(4, password2);
              ps.setString(5, regAs);
              ps.executeUpdate();
              out.println("You have registered successfully!");
              
              response.sendRedirect("landingPage.jsp");
              
              con.close();

              }catch (ClassNotFoundException ex) {
                ex.printStackTrace();

              }
               catch(SQLException ex){
                ex.printStackTrace();
              }
        
        %>
    </body>
</html>
