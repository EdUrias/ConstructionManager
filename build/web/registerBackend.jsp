<%-- 
    Document   : registerBackend
    Created on : 04-Jan-2020, 22:12:17
    Author     : Malchiel
--%>
<%--<%@page import="java.lang.System.out"%>--%>
<%@page import="java.util.logging.Level"%>
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
        <title>Register</title>
    </head>
    <body>
        <%!
            String usernameStored;
            String passwordStored;
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            public boolean checkEmail(String email)
                {
                    PreparedStatement ps;
                    ResultSet rs;
                    boolean check = false;
                    String query = "SELECT * FROM `user` WHERE `email` =?";

                    try {
                        ps = con.prepareStatement(query);
                        ps.setString(1, email);

                        rs = ps.executeQuery();
                        if(rs.next()){
                            check = false;
                        }
                    } catch (SQLException ex) {
                        out.write("An error has occured: " + ex.toString());
                    }
                    return check;        
                }       

        %>  
        <%
        
        String username = request.getParameter("username").trim();
        String email = request.getParameter("email").trim();
        String password1 = request.getParameter("password").trim();
        String password2 = request.getParameter("password").trim();
        
          
        try{
            String query  = "INSERT INTO INSERT INTO `Register`(`Username`, `Email`, `Password`, `Password2`) VALUES (?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(3, email);
            ps.setString(4, password1);
            ps.setString(5, password2);
            ps.executeUpdate();
            
            out.write("SignUp Successful");
        }catch (SQLException ex) {
            out.write("An error has occured: " + ex.toString());
        }
        
        }
                                         
        
%>
    </body>
</html>
