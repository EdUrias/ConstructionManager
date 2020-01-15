<%-- 
    Document   : managerExperience
    Created on : 12-Jan-2020, 14:21:57
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
        <title>Manager Experience</title>
        <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
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
        
        <div class="container regcontainer">
        <h2>Construction Experience</h2>
        <form name="Project Manaager Experience" action="managerExVerify.jsp" method="post">
            <ul>
               
             <li class="form-group">
               <label for="location">Location Of Project:</label><br>  
               <input type="text" id="location" name="location">
             </li>
             <li class="form-group">
               <label for="theme">Theme Of Project:</label><br>  
               <input type="text" id="theme" name="theme">
             </li>
             <li class="form-group">
               <label for="description">Description Of Challenge:</label><br>  
               <textarea id="description" name="description"  cols="45" rows="8" maxlength="65525"></textarea>
             </li>
             <li class="form-group">
               <label for="solution">Solution Used To Solve Problem:</label><br>  
               <textarea id="solution" name="solution"  cols="45" rows="8" maxlength="65525"></textarea>
             </li>
             <li class="form-group">
               <label for="resources">Resources Used:</label><br>  
               <textarea id="resources" name="resources"  cols="45" rows="8" maxlength="65525"></textarea>
             </li>
            </ul>
                <form>
                    <h3>Contact Info:</h3>
                    <ul>
                        <li class="form-group">
                            <label for="phone">Phone:</label><br>  
                            <input type="text" id="phone" name="phone">
                        </li>
                        <li class="form-group">
                            <label for="linkedin">LinkedIn:</label><br>  
                            <input type="text" id="linkedIn" name="linkedIn">
                        </li>
                        <li class="form-group">
                            <label for="twitter">Twitter:</label><br>  
                            <input type="text" id="twitter" name="twitter">
                        </li>
                    </ul>
                    <button type="submit" name="submit" class="btn btn-success">Add Project</button>
                </form>
        </div>
        <div>
            
        </div>
        
           <script type='text/javascript'>
       function goLogin(){
       window.location = '/login.jsp';
        }
       function goReg(){
       window.location = '/registration.jsp';
        }
        function goManager(){
           window.location = '/managerExperience.jsp'; 
        }
        function goComment(){
           window.location = '/userComment.jsp'; 
        }
        function goHome(){
           window.location = '/landingPage.jsp'; 
        }
     </script> 
        
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
       
    

    </body>
</html>
