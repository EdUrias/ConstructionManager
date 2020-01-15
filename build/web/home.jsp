<%-- 
    Document   : home
    Created on : 06-Jan-2020, 15:49:18
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
        <title>Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<!--        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="lib/jquery-3.4.1.min.js"></script>-->
    </head>
    <body>
        <%
        try{
          String sql = "select * from register where username=? and password=?";
          String username = request.getParameter("username").trim();
          String password1 = request.getParameter("password").trim();
          String dbName = null;
          String dbPassword = null;
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, username);
          ps.setString(3, password1);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              dbName = rs.getString(1);
              dbPassword = rs.getString(3);
          }
          if(username.equals(dbName)&&password1.equals(dbPassword)){
              out.println("Welcome!");
          }else{
              response.sendRedirect("login.jsp");
          }
          
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
           catch(SQLException ex){
            ex.printStackTrace();
        }
        %>
        <div class="container">
  
<!--        <h2>Hello, <%= request.getParameter("username") %> </h2>
        <h3>Welcome To The Home Page</h3>-->
        
        <div class="jumbotron">
            <h1 class="display-4">Hello, <%= request.getParameter("username") %> </h1>
            <p class="lead">Welcome To The Home Page</p>
            <hr class="my-4">
            <p>This is a Construction Management Site. The easy way to organise your projects and get work done quickly and efficiently</p>
            <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
        </div>
        
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
       
    </body>
</html>
