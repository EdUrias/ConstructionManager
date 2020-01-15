<%-- 
    Document   : landingPage
    Created on : 07-Jan-2020, 00:33:21
    Author     : Malchiel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Landing Page</title>
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
     

        <div id="home">
<!--        <div class="container jumboDiv" id="leftSection">-->
            <div class="jumbotron jumbotron-fluid homejumbotron">
                
            <nav class="navbar navbar-expand-lg navbar-light fixed-top">
            <div class="container">
                <a class="navbar-brand" href="landingPage.jsp">
                    <img src="Logo3.png" alt="">
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav">
                    <li class="nav-item">
                      <a class="nav-link" href="#register">Use As <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#project">Add Project</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#contact">Contact Us</a>
                    </li>
                  </ul>
                  <ul class="navbar-nav ml-auto">
                        
                      <form class="form-inline my-2 my-lg-0" action="registration.jsp" method="post">
                          <button class="btn btn-success my-2 my-sm-0" id="regBtn" type="submit" href='./registration.jsp' onclick="goReg()">REGISTER</button>
                        </form>
                      <form class="form-inline my-2 my-lg-0" action="login.jsp" method="post">
                          <button class="btn btn-success my-2 my-sm-0"  id="loginBtn" type="submit" href='/login.jsp' onclick="goLogin()">LOG IN</button>
                        </form>
                  </ul>
                </div>
            </div>
        </nav>
                
        
                
                <div class="container" id="jumboContainer">
                  <h1 class="display-2">HEPHAESTUS</h1>
                  <hr>
                  <p class="lead">This is a Construction Management Site. The easy way to organise your projects and get work done quickly and efficiently</p>
                  <form class="form-inline my-2 my-lg-0" action="search.jsp" id="search" method="post">
                      <input class="form-control mr-sm-2" name="theme" type="search" placeholder="Search By Theme" aria-label="Search">
                        <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
                  </form>
                </div>
            </div> 
    </div>
         
     <div id="register">  
        
        <section class="container">
            <div class="col-12 text-center" id="useAs">
                <h3>Use As:</h3>
                <hr>
                <div class="row mb-3 mt-5 projectManagerDiv">
                    <div style="background: url(PM.png)" class="col-md-6 px-md-5 projectManagerBg">
                        
                    </div>   
                <div class="col-md-5 offset-md-1 pmWords">
                    <h2 class="mt-5 display-4">Project Manager</h2>
                    <p class="mt-3 lead">Register as a project manager to 
                    share your project experiences with the world!</p>
                </div>
                </div>
                
                <div class="row mb-3 mt-5 projectManagerDiv">
                    <div style="background: url(Visitor.png)" class="col-md-6 px-md-5 order-md-12 visitorBg">
                        
                    </div>   
                <div class="col-md-5 order-md-1 visitorWords">
                    <h2 class="mt-5 display-4">Visitor</h2>
                    <p class="mt-3 lead">Register as a visitor to view project from 
                        actual professionals and connect with them</p>
            </div>
                </div>
        </section>
     </div>
        
        <div id="project">
        <section class="mt-5 lightGradient">
            
            <div class="jumbotron jumbotron-fluid projectjumbotron" style="background-image: url(Building.jpeg)">
<!--                <img class="projectImg" src= "Building.jpeg"
            width='1400px' height='800px'/>-->
                <div class="getTouch text-center foreground">
                    <div>
                        <h3 class="display-4 projectWords">Want To Add A Project?</h3>
                        <p class="lead">If you are a project manager, feel free to share your some of your experiences with us</p>
                            <form class="" action="managerExperience.jsp" method="post">
                                <button class="btn btn-success my-2 my-sm-0"  id="addBtn" type="submit" href='/managerExperience.jsp' onclick="goManager()">Add Project</button>
                            </form>
                    </div>
                </div>
            </div>            
        </section>
        
    </div>
        
            
<!--            <div class="jumbotron jumbotron-fluid darkerGradient">
            </div>
            -->
            
            <div id="contact"> 
            <section class="mt-5 lightGradient">
            
            <div class="jumbotron jumbotron-fluid projectjumbotron" style="background-image: url(Cooperate.png)">
<!--                <img class="projectImg" src= "Building.jpeg"
            width='1400px' height='800px'/>-->
                <div class="getTouch text-center foreground">
                    <div>
                        <h3 class="display-4 projectWords">Contact Us</h3>
                        <p class="lead">Reach out, keep in touch with us</p>
                            <form class="" action="userComment.jsp" method="post">
                                <button class="btn btn-success my-2 my-sm-0"  id="addBtn" type="submit" href='/userComment.jsp' onclick="goComment()">Leave Comment</button>
                            </form>
                    </div>
                </div>
            </div>            
        </section>  
            </div>
            
          
        <footer class="p-3 pt-5 darkerGradient">
            <div class="container">
                <div class="row mb-3">
                    <div class="col-12" style="text-align: center">
                        <h3 class="mt-3">Address</h3>
                        <p>Canaan Land, Km 10, Idiroko Road, Ota, Ogun State, Nigeria.</p>
                    </div>
<!--                    <div class="col-lg-6 col-md-6 col-12">
                        <h3 class="mt-3">Contact Us</h3>
                        <span class="sub-text" data-subsuffix="Phone">
                            <a>(+234) 960 254 1270</a>
                        </span>
                        <span class="sub-text" data-subsuffix="Email">
                            <a>hello@haphaestus.com.ng</a>
                        </span>
                        <span class="sub-text" data-subsuffix="Social">
                            <a>hello@haphaestus.com</a>
                            <form class="" action="managerExperience.jsp" method="post">
                                <button class="btn btn-success my-2 my-sm-0"  id="addBtn" type="submit" href='/managerExperience.jsp' onclick="goManager()">Add Project</button>
                            </form>
                        </span>
                    </div>-->
                </div>
                <div class="mb-0 pt-1 text-center">
                            
                            Copyright 
                            <span currentyear>2020</span>
                            Haphaestus Ltd.
                            
                    </div>
            </div>
        </footer>
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
