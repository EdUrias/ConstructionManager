<%-- 
    Document   : commentVerify
    Created on : 13-Jan-2020, 16:24:55
    Author     : Malchiel
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comment Section</title>
    </head>
    <body>
        <%!
        String comment;
        String name;
        String email;
        %>
        <%
            comment = "";
                name = "";
                email = "";
                comment = request.getParameter("comment");
                name = request.getParameter("name").trim();
                
                email = request.getParameter("useremail").trim();
                
            if("".equals(comment)||"".equals(name)||"".equals(email) ){
            out.write("Fill in empty fields!");  
         }
       else{
        try{ 
               Class.forName("com.mysql.jdbc.Driver");
               /*Connection con = DriverManager.getConnection("jdbc:mysql://localhost/construction","root","");*/
              java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
              Statement st = con.createStatement();
              st.executeUpdate("INSERT INTO usercomment VALUES ('" + comment + "','" + name + "','" + email + "')");
//            String insert2 = "INSERT INTO login VALUES ('" + uname + "','" + item + "','" + password +  "') ";
               
              out.println("Succesfully inserted values");
               
             con.setAutoCommit(true);
             con.close();
             response.sendRedirect("landingPage.jsp");
   
           }
           catch(Exception e){
               e.printStackTrace();
           }
       }  
        %>
    </body>
</html>
