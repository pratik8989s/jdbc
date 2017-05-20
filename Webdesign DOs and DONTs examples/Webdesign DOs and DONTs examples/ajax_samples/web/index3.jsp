<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Submission</title>
        <script src="ajax.js"></script>
        <script>
            window.onload = function () {
                document.forms[0].onsubmit = function(e) {
                    if (xmlHttp) {
                        var qStr = getValues("form1");
                        try {
                            xmlHttp.open("GET", "handler.jsp?" + qStr, true);
                            xmlHttp.onreadystatechange = handleSubmit;
                            xmlHttp.send(null);
                        } catch (e) {
                            //handle exception
                        }
                    }
                    return stopDefault(e);
                }
            }
        </script>
    </head>
    <body>
        <h1>Form Submission</h1>
        <div id="message">
            <form action="handler.jsp" method="post" id="form1">
                Name: <input type="text" name="name" id="name" value="" />
                <br/>
                <input type="Submit" value="Submit" />
            </form>
        </div>
    </body>
</html>
