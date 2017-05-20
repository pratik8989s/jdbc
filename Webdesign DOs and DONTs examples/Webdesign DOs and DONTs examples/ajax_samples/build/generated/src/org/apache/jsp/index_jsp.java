package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ajax Samples</title>\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("            var xmlHttp;\n");
      out.write("            function createXmlHttpRequestObject() {\n");
      out.write("                var xmlHttp;\n");
      out.write("                try {\n");
      out.write("                    xmlHttp=new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                catch (e) {\n");
      out.write("                    try\t{\n");
      out.write("                        xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("                    } catch (e) {\n");
      out.write("                        try {\n");
      out.write("                            xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                        } catch (e) {\n");
      out.write("                            alert(\"Your browser does not support AJAX!\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if(!xmlHttp)\n");
      out.write("                    alert(\"Error creating the xmlHttpRequest Object.\");\n");
      out.write("                else\n");
      out.write("                    return xmlHttp;\n");
      out.write("            }\n");
      out.write("    \n");
      out.write("            function doAjax() {\n");
      out.write("                xmlHttp = createXmlHttpRequestObject();\n");
      out.write("                if (xmlHttp) {\n");
      out.write("                    try {\n");
      out.write("                        xmlHttp.open(\"GET\",\"other.jsp\",true);\n");
      out.write("                        xmlHttp.onreadystatechange = processResponse;\n");
      out.write("                        xmlHttp.send(null);\n");
      out.write("                    } catch (e) {\n");
      out.write("                        alert (\"Error sending the data \" + e.toString());\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function processResponse() {\n");
      out.write("                if (!xmlHttp) return;\n");
      out.write("                if(xmlHttp.readyState == 4) {\n");
      out.write("                    if (xmlHttp.status == 200) {\n");
      out.write("                        try {\n");
      out.write("                            var op = document.getElementById(\"outputDiv\");\n");
      out.write("                            var response = xmlHttp.responseText;\n");
      out.write("                            op.innerHTML = response;\n");
      out.write("                        } catch(e) {\n");
      out.write("                            alert (\"Error reading the response\\n\" + e.toString());\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Using Ajax</h1>\n");
      out.write("        <input type=\"button\" value=\"Do Ajax\" onClick=\"doAjax()\" />\n");
      out.write("        <div id=\"outputDiv\"></div>\n");
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
