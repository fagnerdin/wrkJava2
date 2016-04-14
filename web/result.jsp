<%-- 
    Document   : result
    Created on : 06/04/2016, 22:52:09
    Author     : fagnerdin
--%>

<%@page import="java.lang.String"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String result = (String)request.getAttribute("valor"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Divisao</title>
        <script src="./lib"></script>
        <style>
            b{
                background-color: #dbdbdb;
                color: darkblue;
            }
        </style>
        
    </head>
    <body>
        <h1>Digite os numero para ver visualizar a divisao!</h1>
        <form action="servletControl.do" method="post">
            
            <label>Numero</label>
            <input name="numerador" style="max-width: 60px" type="text"/><br/>
                <br />
            <label>Dividendo</label>
            <input name="denominador" style="max-width: 60px" type="text"/><br />
                <br />
                <input type="submit" value="Enviar" />
                <br />
                <br />
        <hr />        
                <br />
                        <% out.print(result); %>  
                
    </body>
</html>
