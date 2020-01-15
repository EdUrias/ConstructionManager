<%-- 
    Document   : managerExVerify
    Created on : 13-Jan-2020, 15:59:45
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
        <title>Manager Experience Verification</title>
    </head>
    <body>
        <%!
        
        String theme,location,description,solution,resources,email,phone,linkedIn,twitter;       
        %>
        <%
        try{
          String sql = "INSERT INTO `managerExperience`(`Location`, `Theme`, `Description`, `Solution`, `Resources`, `Phone`, `LinkedIn`, `Twitter`) VALUES (?,?,?,?,?,?,?,?)";
          location = request.getParameter("location").trim();
          theme = request.getParameter("theme").trim();
          description = request.getParameter("description").trim();
          solution = request.getParameter("solution").trim();
          resources = request.getParameter("resources").trim();
          phone = request.getParameter("phone").trim();
          linkedIn = request.getParameter("linkedIn").trim();
          twitter = request.getParameter("twitter").trim();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, location);
          ps.setString(2, theme);
          ps.setString(3, description);
          ps.setString(4, solution);
          ps.setString(5, resources);
          ps.setString(6, phone);
          ps.setString(7, linkedIn);
          ps.setString(8, twitter);
          ps.executeUpdate();
          out.println("Thank you for sharing your project!");
          
          
          response.sendRedirect("landingPage.jsp");
              
          con.close();
              
           } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        %>
    </body>
</html>
