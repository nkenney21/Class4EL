<%-- 
    Document   : rectangleresult
    Created on : Jan 26, 2015, 8:58:20 PM
    Author     : neilkenney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area</title>
    </head>
    <body>
        <h1>The Area of the Rectangle is:</h1>
        <p><% 
            Object objList = request.getAttribute("rectangleArea");
            if(objList == null){
                out.println("Sorry there was an error");
            }
            else{
                out.println(request.getAttribute("rectangleArea"));
            }
           
%>
        </p>
    </body>
</html>
