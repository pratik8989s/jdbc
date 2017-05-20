package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Form Submission</title>\n");
      out.write("        <script src=\"ajax.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            window.onload = function () {\n");
      out.write("                document.forms[0].onsubmit = function(e) {\n");
      out.write("                    if (xmlHttp) {\n");
      out.write("                        var qStr = getValues(\"form1\");\n");
      out.write("                        try {\n");
      out.write("                            xmlHttp.open(\"GET\", \"handler.jsp?\" + qStr, true);\n");
      out.write("                            xmlHttp.onreadystatechange = handleSubmit;\n");
      out.write("                            xmlHttp.send(null);\n");
      out.write("                        } catch (e) {\n");
      out.write("                            //handle exception\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    return stopDefault(e);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Form Submission</h1>\n");
      out.write("        <div id=\"message\">\n");
      out.write("            <form action=\"handler.jsp\" method=\"post\" id=\"form1\">\n");
      out.write("                Name: <input type=\"text\" name=\"name\" id=\"name\" value=\"\" />\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"Submit\" value=\"Submit\" />\n");
      out.write("            </form>\n");
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
