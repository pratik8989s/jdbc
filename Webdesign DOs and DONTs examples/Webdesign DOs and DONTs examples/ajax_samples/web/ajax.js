
// RENAME THIS TO .JS


xmlHttp = createXmlHttpRequestObject();

function createXmlHttpRequestObject() {
    var xmlHttp;
    
	// Non IE Browsers
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
    
    return xmlHttp;
}

function stopDefault ( e ) {
    // Prevent the default browser action (W3C)
    if ( e && e.preventDefault )
        e.preventDefault();
    // A shortcut for stoping the browser action in IE
    else
        window.event.returnValue = false;
    return false;
}

function getValues (formId) {
    var form = document.getElementById(formId);
    var qStr = "";

    for (var i=0; i<form.elements.length; i++) {
        var ele = form.elements[i];
        qStr += (ele.name + '=' + ele.value + "&");
    }

    qStr = qStr.substr(0,qStr.length-1);
    return qStr;
}

function handleSubmit() {
    if (xmlHttp.readyState==4) {
        if (xmlHttp.status == 200) {
            var message = document.getElementById("message");
            try {
                message.innerHTML = xmlHttp.responseText;
            } catch (e) {
            //handle exception
            }
        }
    }
}