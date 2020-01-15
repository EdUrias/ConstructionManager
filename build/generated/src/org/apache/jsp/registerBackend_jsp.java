package org.apache.jsp;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

public final class registerBackend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
                        
                        out.println("An error has occured: " + ex.toString());
                    }
                    return check;        
                }       

        
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

      out.write('\n');
      out.write("\n");
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
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("  \n");
      out.write("        ");

        
         
        try{
        String username = request.getParameter("username").trim();
        String email = request.getParameter("email").trim();
        String password1 = request.getParameter("password").trim();
        String password2 = request.getParameter("password").trim();
        
        if (username.equals(""))
        {
           out.write("Your Username Is Required");
        }
        else if (email.equals(""))
        {
            out.write("Your Email Is Required");
        }
        else if (!password1.equals(password2))
        {
            out.write("Passwords Don't Match");
        } 
          
            String query  = "INSERT INTO INSERT INTO `Register`(`Username`, `Email`, `Password`, `Password2`) VALUES (?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/SignUp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeXode=false&serverTimezone=UTC", "root", "");
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(3, email);
            ps.setString(4, password1);
            ps.setString(5, password2);
            ps.executeUpdate();
            
            out.write("SignUp Successful");
        }catch (SQLException ex) {
            out.write("An error has occured: " + ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerBackend_jsp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        } catch (Exception ex) {
            out.write("An error has occured: " + ex.toString());
                                         
        

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
