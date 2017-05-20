
// RENAME ME TO .JS

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

function stopDefault( e ) {
    // Prevent the default browser action (W3C)
    if ( e && e.preventDefault )
        e.preventDefault();
    // A shortcut for stoping the browser action in IE
    else
        window.event.returnValue = false;
    return false;
}

window.onload = function(e) {
    var a = document.getElementsByTagName("a");
    for ( var i = 0; i < a.length; i++ ) {
        a[i].onclick = function(e) {
            var arr = this.href.split("=");
            if (arr.length>1) {
                url = arr[1] + ".jsp";
            } else {
                url = "home.jsp";
            }
            var xmlHttp = createXmlHttpRequestObject();
            if (xmlHttp) {
                try {
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange = function () {
                        if(xmlHttp.readyState == 4) {
                            if (xmlHttp.status == 200) {
                                try {
                                    var op = document.getElementById("center");
                                    var response = xmlHttp.responseText;
                                    op.innerHTML = response;
                                } catch(e) {
                                    alert ("Error reading the response\n" + e.toString());
                                }
                            }
                        }
                    }
                    xmlHttp.send(null);
                } catch (e) {
                    alert ("Error sending the data " + e.toString());
                }
            }
            return stopDefault( e );
        };
    }
}