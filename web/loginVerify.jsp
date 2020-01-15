<%-- 
    Document   : loginVerify
    Created on : 13-Jan-2020, 15:54:33
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
        <title>Login Verification</title>
    </head>
    <body>
        <
<!--//        try{
//          String sql = "select * from register where username=? and password=?";
//          String username = request.getParameter("username").trim();
//          String password1 = request.getParameter("password").trim();
//          String dbName = null;
//          String dbPassword = null;
//          Class.forName("com.mysql.jdbc.Driver");
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
//          PreparedStatement ps = con.prepareStatement(sql);
//          ps.setString(1, username);
//          ps.setString(3, password1);
//          ResultSet rs = ps.executeQuery();
//          while(rs.next()){
//              dbName = rs.getString(1);
//              dbPassword = rs.getString(3);
//          }
//          if(username.equals(dbName)&&password1.equals(dbPassword)){
//              out.println("Welcome!");
//          }else{
//              response.sendRedirect("login.jsp");
//          }
//          
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//           catch(SQLException ex){
//            ex.printStackTrace();
//        }-->

           <%!
        String username;
        String password1;
        Connection con;
        PreparedStatement st;
        ResultSet res;
        %>
        
        <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
                username = "";
                password1 = "";
                String item = request.getParameter("item");
                String usernameEntered = request.getParameter("username").trim();
                String passwordEntered = request.getParameter("password").trim();
                String sql = "SELECT * FROM register WHERE ( username = ' "+usernameEntered+ " ' AND password = ' "+passwordEntered+ " ') ";
//                String sql = "SELECT * FROM login WHERE (username =?,  item =?  AND password =?' )";
                
                
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");

                st = (PreparedStatement) con.prepareStatement(sql);
                res = st.executeQuery();
               
                
//                    out.write("Please register first");
                    response.sendRedirect("landingPage.jsp");
                
                  /* response.sendRedirect("choose.jsp");
                else
                    response.sendRedirect("home.jsp");*/
                con.close();
                
            }
            catch(SQLException ex){
                out.write("An error occured: " + ex.toString());
            }
        %>
        
    </body>
</html>
