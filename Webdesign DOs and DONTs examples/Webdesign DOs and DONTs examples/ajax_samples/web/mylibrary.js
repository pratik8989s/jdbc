/**
 * JavaScript Library for UI project
 *
 * Author: Udayraj Bal
 *
 * Change Log: 11-Jun-2011 Initial Version
 *
 * Version Info: 0.1
 */

if (!XMLHttpRequest) {
    XMLHttpRequest = function () {
        try	{
            return new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                return new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
                return false;
            }
        }
    }
}

var TechM = {};
TechM.ESG = {
    getRemotePage: function (config) {
        var xhr = new XMLHttpRequest();
        xhr.open(config['method'], config['url'], true);
        xhr.onreadystatechange = config['success'];
        xhr.send();
    }
}

config = {
    method: "GET",
    url: "mypage.aspx",
    success: function () {
        alert("Heeeeyyy ... Got it!");
    }
}