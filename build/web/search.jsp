 <%-- 
    Document   : search
    Created on : 14-Jan-2020, 10:24:26
    Author     : Malchiel
--%>
<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
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
        <title>Search</title>
        <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/searchtablestyle.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap" rel="stylesheet">
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light fixed-top">
            <div class="container">
                <a class="navbar-brand" href="landingPage.jsp">
                    <img src="Logo3.png" alt="">
                </a>
                
            </div>
        </nav>
        <%
            String theme;
    
            theme = request.getParameter("theme");
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT `location`, `theme`, `description`, `solution`, `resources` FROM `managerexperience` WHERE `theme` = '"+theme+"'");
        %>     

          
          <div class="container regcontainer">
	<table>
		<thead>
			<tr>
				<th>THEME</th>
				<th>LOCATION</th>
				<th>DESCRIPTION</th>
				<th>SOLUTION</th>
				<th>RESOURCES</th>
			</tr>
		</thead>
		
                <tbody>

        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("theme") %></td>
                <td><%=rs.getString("location") %></td>
                <td><%=rs.getString("description") %></td>
                <td><%=rs.getString("solution") %></td>
                <td><%=rs.getString("resources") %></td>
            </tr>
            <%}%>
           </tbody>
        </table><br>
    </div>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    %>
        
    
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
      
    </body>
</html>
