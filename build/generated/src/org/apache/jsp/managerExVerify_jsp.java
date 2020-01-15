package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class managerExVerify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        
        String theme,location,description,solution,resources,email,phone,linkedin,twitter;       
        
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
      out.write("        <title>Manager Experience Verification</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        try{
          String sql = "INSERT INTO `managerExperience`(`Location`, `Theme`, `Description`, `Solution`, `Resources`, `Phone`, `LinkedIn`, `Twitter`) VALUES (?,?,?,?,?,?,?,?)";
          location = request.getParameter("location").trim();
          theme = request.getParameter("theme").trim();
          description = request.getParameter("description").trim();
          solution = request.getParameter("solution").trim();
          resources = request.getParameter("resources").trim();
          phone = request.getParameter("phone").trim();
          linkedin = request.getParameter("linkedin").trim();
          twitter = request.getParameter("twitter").trim();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CMSignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, location);
          ps.setString(2, theme);
          ps.setString(3, description);
          ps.setString(4, solution);
          ps.setString(5, resources);
          ps.setString(3, phone);
          ps.setString(4, linkedin);
          ps.setString(5, twitter);
          ps.executeUpdate();
          out.println("Thank you for sharing your project!");
          
           } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
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
