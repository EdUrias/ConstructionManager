package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"landingPage.jsp\">\n");
      out.write("                    <img src=\"Logo3.png\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("    <div class=\"container regcontainer\">\n");
      out.write("    <h2>Registration Page</h2>\n");
      out.write("        <form name=\"Register\" action=\"registrationVerify.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"username\">Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" required=\"required\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"email\">Email</label>\n");
      out.write("              <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" required=\"required\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"password1\">Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"password1\" id=\"password1\" required=\"required\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"password2\">Re-Enter Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"password2\" id=\"password2\" required=\"required\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("                <input class=\"form-check-input\" type=\"radio\" name=\"registerAs\" id=\"projectManager\" value=\"projectManager\" checked>\n");
      out.write("                <label class=\"form-check-label\" for=\"projectManager\">\n");
      out.write("                  Project Manager\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <input class=\"form-check-input\" type=\"radio\" name=\"registerAs\" id=\"user\" value=\"user\">\n");
      out.write("                <label class=\"form-check-label\" for=\"user\">\n");
      out.write("                  User\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("            <button type=\"submit\" name=\"submit\" class=\"btn btn-success\">Register</button>\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   <script type='text/javascript'>\n");
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
      out.write("     </script> \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("         \n");
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
