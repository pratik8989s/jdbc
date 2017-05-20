<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Single Page Apps.Org</title>
        <style>
            @import url("simple.css");
        </style>
        <script src="pages.js"></script>
    </head>
    <body>
        <div id="header">
            <h1>Single Page Apps</h1>
            <i>Let's add an X to life ...</i>
        </div>
        <div id="content">
            <div id="menu"><a href="index2.jsp">Home</a> | <a href="index2.jsp?q=products">Products</a> | <a href="index2.jsp?q=services">Services</a></div>
            <div id="left">
                NEWS
                <ul id="news">
                    <li>Ajax: The X matters</li>
                    <li>DOM is devine</li>
                    <li>JavaScript RIA</li>
                    <li>Not for kids anymore</li>
                </ul>
            </div>
            <div id="center">
                <%
        String pageName = request.getParameter("q") == null ? "" : request.getParameter("q");
        if (pageName.equals("products")) {
                %>
                <%@ include file="products.jsp" %>
                <%                } else if (pageName.equals("services")) {
                %>
                <%@ include file="services.jsp" %>
                <%                } else {
                %>
                <%@include file="home.jsp" %>
                <%                }
                %>
            </div>
            <div id="footer">Copyright &copy; 2010 Udayraj Bal</div>
        </div>
    </body>
</html>
