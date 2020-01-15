<%-- 
    Document   : userComment
    Created on : 12-Jan-2020, 14:54:44
    Author     : Malchiel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Comment</title>
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
        <h2>Get In Touch</h2>
        <p>Your Email Address Would Not Be Published.</p> 
        <form action="commentVerify.jsp" method="POST">
            <div class="form-group">
              <label for="comment">Comment</label><br>                    
              <textarea id="comment" name="comment" cols="45" rows="8" maxlength="65525"></textarea>
            </div>
            <div class="form-group">
              <label for="name">Name</label><br>  
              <input type="text" class="form-control" name="name" id="name" required="required">
            </div>
            <div class="form-group">
              <label for="email">Email</label><br>  
              <input type="email" class="form-control" name="useremail" id="email" required="required">
            </div>
            <button type="submit" name="submit" class="btn btn-success">Post Comment</button>
        </form>
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
