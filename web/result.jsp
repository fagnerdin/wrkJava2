<%-- 
    Document   : result
    Created on : 06/04/2016, 22:52:09
    Author     : fagnerdin
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da sua preferencia</title>
    </head>
    <body>
        
        <%
            
            List<String> result = (List<String>)request.getAttribute("sugestao");

            for(String temp : result){
                out.print("<br />" + temp);
                
            }

        %>
        
    </body>
</html>
