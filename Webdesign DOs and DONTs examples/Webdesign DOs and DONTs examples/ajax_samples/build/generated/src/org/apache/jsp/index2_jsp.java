package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/products.jsp");
    _jspx_dependants.add("/services.jsp");
    _jspx_dependants.add("/home.jsp");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Single Page Apps.Org</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(\"simple.css\");\n");
      out.write("        </style>\n");
      out.write("        <script src=\"pages.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <h1>Single Page Apps</h1>\n");
      out.write("            <i>Let's add an X to life ...</i>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"menu\"><a href=\"index2.jsp\">Home</a> | <a href=\"index2.jsp?q=products\">Products</a> | <a href=\"index2.jsp?q=services\">Services</a></div>\n");
      out.write("            <div id=\"left\">\n");
      out.write("                NEWS\n");
      out.write("                <ul id=\"news\">\n");
      out.write("                    <li>Ajax: The X matters</li>\n");
      out.write("                    <li>DOM is devine</li>\n");
      out.write("                    <li>JavaScript RIA</li>\n");
      out.write("                    <li>Not for kids anymore</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"center\">\n");
      out.write("                ");

        String pageName = request.getParameter("q") == null ? "" : request.getParameter("q");
        if (pageName.equals("products")) {
                
      out.write("\n");
      out.write("                ");
      out.write("<h1>Products</h1>\n");
      out.write("This is products page");
      out.write("\n");
      out.write("                ");
                } else if (pageName.equals("services")) {
                
      out.write("\n");
      out.write("                ");
      out.write("<h1>Services</h1>\n");
      out.write("This is services page");
      out.write("\n");
      out.write("                ");
                } else {
                
      out.write("\n");
      out.write("                ");
      out.write("<h1>Home Page</h1>\n");
      out.write("<p>It doesn't break even if you disable JavaScript.</p>");
      out.write("\n");
      out.write("                ");
                }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">Copyright &copy; 2010 Udayraj Bal</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
