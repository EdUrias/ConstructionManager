package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class landingPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Landing Page</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <div id=\"home\">\n");
      out.write("<!--        <div class=\"container jumboDiv\" id=\"leftSection\">-->\n");
      out.write("            <div class=\"jumbotron jumbotron-fluid homejumbotron\">\n");
      out.write("                \n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"landingPage.jsp\">\n");
      out.write("                    <img src=\"Logo3.png\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#register\">Use As <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#project\">Add Project</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#contact\">Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                  <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        \n");
      out.write("                      <form class=\"form-inline my-2 my-lg-0\" action=\"registration.jsp\" method=\"post\">\n");
      out.write("                          <button class=\"btn btn-success my-2 my-sm-0\" id=\"regBtn\" type=\"submit\" href='./registration.jsp' onclick=\"goReg()\">REGISTER</button>\n");
      out.write("                        </form>\n");
      out.write("                      <form class=\"form-inline my-2 my-lg-0\" action=\"login.jsp\" method=\"post\">\n");
      out.write("                          <button class=\"btn btn-success my-2 my-sm-0\"  id=\"loginBtn\" type=\"submit\" href='/login.jsp' onclick=\"goLogin()\">LOG IN</button>\n");
      out.write("                        </form>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                <div class=\"container\" id=\"jumboContainer\">\n");
      out.write("                  <h1 class=\"display-2\">HEPHAESTUS</h1>\n");
      out.write("                  <hr>\n");
      out.write("                  <p class=\"lead\">This is a Construction Management Site. The easy way to organise your projects and get work done quickly and efficiently</p>\n");
      out.write("                  <form class=\"form-inline my-2 my-lg-0\" action=\"search.jsp\" id=\"search\" method=\"post\">\n");
      out.write("                      <input class=\"form-control mr-sm-2\" name=\"theme\" type=\"search\" placeholder=\"Search By Theme\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("    </div>\n");
      out.write("         \n");
      out.write("     <div id=\"register\">  \n");
      out.write("        \n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"col-12 text-center\" id=\"useAs\">\n");
      out.write("                <h3>Use As:</h3>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row mb-3 mt-5 projectManagerDiv\">\n");
      out.write("                    <div style=\"background: url(PM.png)\" class=\"col-md-6 px-md-5 projectManagerBg\">\n");
      out.write("                        \n");
      out.write("                    </div>   \n");
      out.write("                <div class=\"col-md-5 offset-md-1 pmWords\">\n");
      out.write("                    <h2 class=\"mt-5 display-4\">Project Manager</h2>\n");
      out.write("                    <p class=\"mt-3 lead\">Register as a project manager to \n");
      out.write("                    share your project experiences with the world!</p>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row mb-3 mt-5 projectManagerDiv\">\n");
      out.write("                    <div style=\"background: url(Visitor.png)\" class=\"col-md-6 px-md-5 order-md-12 visitorBg\">\n");
      out.write("                        \n");
      out.write("                    </div>   \n");
      out.write("                <div class=\"col-md-5 order-md-1 visitorWords\">\n");
      out.write("                    <h2 class=\"mt-5 display-4\">Visitor</h2>\n");
      out.write("                    <p class=\"mt-3 lead\">Register as a visitor to view project from \n");
      out.write("                        actual professionals and connect with them</p>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("        </section>\n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("        <div id=\"project\">\n");
      out.write("        <section class=\"mt-5 lightGradient\">\n");
      out.write("            \n");
      out.write("            <div class=\"jumbotron jumbotron-fluid projectjumbotron\" style=\"background-image: url(Building.jpeg)\">\n");
      out.write("<!--                <img class=\"projectImg\" src= \"Building.jpeg\"\n");
      out.write("            width='1400px' height='800px'/>-->\n");
      out.write("                <div class=\"getTouch text-center foreground\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"display-4 projectWords\">Want To Add A Project?</h3>\n");
      out.write("                        <p class=\"lead\">If you are a project manager, feel free to share your some of your experiences with us</p>\n");
      out.write("                            <form class=\"\" action=\"managerExperience.jsp\" method=\"post\">\n");
      out.write("                                <button class=\"btn btn-success my-2 my-sm-0\"  id=\"addBtn\" type=\"submit\" href='/managerExperience.jsp' onclick=\"goManager()\">Add Project</button>\n");
      out.write("                            </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("<!--            <div class=\"jumbotron jumbotron-fluid darkerGradient\">\n");
      out.write("            </div>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("            <div id=\"contact\"> \n");
      out.write("            <section class=\"mt-5 lightGradient\">\n");
      out.write("            \n");
      out.write("            <div class=\"jumbotron jumbotron-fluid projectjumbotron\" style=\"background-image: url(Cooperate.png)\">\n");
      out.write("<!--                <img class=\"projectImg\" src= \"Building.jpeg\"\n");
      out.write("            width='1400px' height='800px'/>-->\n");
      out.write("                <div class=\"getTouch text-center foreground\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"display-4 projectWords\">Contact Us</h3>\n");
      out.write("                        <p class=\"lead\">Reach out, keep in touch with us</p>\n");
      out.write("                            <form class=\"\" action=\"userComment.jsp\" method=\"post\">\n");
      out.write("                                <button class=\"btn btn-success my-2 my-sm-0\"  id=\"addBtn\" type=\"submit\" href='/userComment.jsp' onclick=\"goComment()\">Leave Comment</button>\n");
      out.write("                            </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("        </section>  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("        <footer class=\"p-3 pt-5 darkerGradient\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-12\" style=\"text-align: center\">\n");
      out.write("                        <h3 class=\"mt-3\">Address</h3>\n");
      out.write("                        <p>Canaan Land, Km 10, Idiroko Road, Ota, Ogun State, Nigeria.</p>\n");
      out.write("                    </div>\n");
      out.write("<!--                    <div class=\"col-lg-6 col-md-6 col-12\">\n");
      out.write("                        <h3 class=\"mt-3\">Contact Us</h3>\n");
      out.write("                        <span class=\"sub-text\" data-subsuffix=\"Phone\">\n");
      out.write("                            <a>(+234) 960 254 1270</a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"sub-text\" data-subsuffix=\"Email\">\n");
      out.write("                            <a>hello@haphaestus.com.ng</a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"sub-text\" data-subsuffix=\"Social\">\n");
      out.write("                            <a>hello@haphaestus.com</a>\n");
      out.write("                            <form class=\"\" action=\"managerExperience.jsp\" method=\"post\">\n");
      out.write("                                <button class=\"btn btn-success my-2 my-sm-0\"  id=\"addBtn\" type=\"submit\" href='/managerExperience.jsp' onclick=\"goManager()\">Add Project</button>\n");
      out.write("                            </form>\n");
      out.write("                        </span>\n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-0 pt-1 text-center\">\n");
      out.write("                            \n");
      out.write("                            Copyright \n");
      out.write("                            <span currentyear>2020</span>\n");
      out.write("                            Haphaestus Ltd.\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     <script type='text/javascript'>\n");
      out.write("       function goLogin(){\n");
      out.write("       window.location = '/login.jsp';\n");
      out.write("        }\n");
      out.write("       function goReg(){\n");
      out.write("       window.location = '/registration.jsp';\n");
      out.write("        }\n");
      out.write("        function goManager(){\n");
      out.write("           window.location = '/managerExperience.jsp'; \n");
      out.write("        }\n");
      out.write("        function goComment(){\n");
      out.write("           window.location = '/userComment.jsp'; \n");
      out.write("        }\n");
      out.write("        function goHome(){\n");
      out.write("           window.location = '/landingPage.jsp'; \n");
      out.write("        }\n");
      out.write("     </script>   \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
