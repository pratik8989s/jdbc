<%
String strName = request.getParameter("name")==null?"Unknown":request.getParameter("name");
out.println("Hello " + strName);
out.println("How are you doing?");
int a[] = {1,2,3,4};
for (int i = 0; i<a.length; i++) {
    out.println(a[i]);
}
%>