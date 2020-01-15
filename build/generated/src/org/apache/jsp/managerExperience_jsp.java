package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class managerExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manager Experience</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h2>Construction Experience</h2>\n");
      out.write("        <form name=\"Project Manaager Experience\" action=\"managerExVerify.jsp\" method=\"post\">\n");
      out.write("            <ul>\n");
      out.write("             <li class=\"form-group\">\n");
      out.write("               <label for=\"location\">Location Of Project:</label><br>  \n");
      out.write("               <input type=\"text\" id=\"location\" name=\"projectLocation\">\n");
      out.write("             </li>\n");
      out.write("             <li class=\"form-group\">\n");
      out.write("               <label for=\"theme\">Theme Of Project:</label><br>  \n");
      out.write("               <input type=\"text\" id=\"theme\" name=\"projectTheme\">\n");
      out.write("             </li>\n");
      out.write("             <li class=\"form-group\">\n");
      out.write("               <label for=\"description\">Description Of Challenge:</label><br>  \n");
      out.write("               <textarea id=\"description\" name=\"projectDesription\"  cols=\"45\" rows=\"8\" maxlength=\"65525\"></textarea>\n");
      out.write("             </li>\n");
      out.write("             <li class=\"form-group\">\n");
      out.write("               <label for=\"solution\">Solution Used To Solve Problem:</label><br>  \n");
      out.write("               <textarea id=\"solution\" name=\"projectSolution\"  cols=\"45\" rows=\"8\" maxlength=\"65525\"></textarea>\n");
      out.write("             </li>\n");
      out.write("             <li class=\"form-group\">\n");
      out.write("               <label for=\"resources\">Resources Used:</label><br>  \n");
      out.write("               <textarea id=\"resources\" name=\"projectResources\"  cols=\"45\" rows=\"8\" maxlength=\"65525\"></textarea>\n");
      out.write("             </li>\n");
      out.write("            </ul>\n");
      out.write("                <form>\n");
      out.write("                    <h3>Contact Info:</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"form-group\">\n");
      out.write("                            <label for=\"phone\">Phone:</label><br>  \n");
      out.write("                            <input type=\"text\" id=\"phone\" name=\"managerPhone\">\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"form-group\">\n");
      out.write("                            <label for=\"linkedin\">LinkedIn:</label><br>  \n");
      out.write("                            <input type=\"text\" id=\"linkedIn\" name=\"managerLinkedIn\">\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"form-group\">\n");
      out.write("                            <label for=\"twitter\">Twitter:</label><br>  \n");
      out.write("                            <input type=\"text\" id=\"twitter\" name=\"managerTwitter\">\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </form>\n");
      out.write("             <button type=\"submit\" name=\"submit\" class=\"btn btn-primary\">Add Project</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
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
