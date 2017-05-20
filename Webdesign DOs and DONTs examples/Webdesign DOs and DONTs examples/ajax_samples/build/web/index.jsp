<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajax Samples</title>
        <script type="text/javascript" >
            var xmlHttp;
            function createXmlHttpRequestObject() {
                var xmlHttp;
                try {
                    xmlHttp=new XMLHttpRequest();
                }
                catch (e) {
                    try	{
                        xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
                    } catch (e) {
                        try {
                            xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                        } catch (e) {
                            alert("Your browser does not support AJAX!");
                            return false;
                        }
                    }
                }
                if(!xmlHttp)
                    alert("Error creating the xmlHttpRequest Object.");
                else
                    return xmlHttp;
            }
    
            function doAjax() {
                xmlHttp = createXmlHttpRequestObject();
                if (xmlHttp) {
                    try {
                        xmlHttp.open("GET","other.jsp",true);
                        xmlHttp.onreadystatechange = processResponse;
                        xmlHttp.send(null);
                    } catch (e) {
                        alert ("Error sending the data " + e.toString());
                    }
                }
            }
            
            function processResponse() {
                if (!xmlHttp) return;
                if(xmlHttp.readyState == 4) {
                    if (xmlHttp.status == 200) {
                        try {
                            var op = document.getElementById("outputDiv");
                            var response = xmlHttp.responseText;
                            op.innerHTML = response;
                        } catch(e) {
                            alert ("Error reading the response\n" + e.toString());
                        }
                    }
                }
            }
        </script>
    </head>
    <body>
        <h1>Using Ajax</h1>
        <input type="button" value="Do Ajax" onClick="doAjax()" />
        <div id="outputDiv"></div>
    </body>
</html>
