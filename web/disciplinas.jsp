<%-- 
    Document   : disciplina
    Created on : 01/10/2015, 18:10:40
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "modelo.Professor" %>
<%@page import = "modelo.Disciplina" %>

<%

Disciplina d = new Disciplina ();
d.setCodigo("234");
d.setNome("Programação");
d.setProfessor("Alex");
d.setSemestre(5);


Professor p = new Professor ();
p.setNome("Siedler");
p.setSiape("12345");

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informações da Disciplina <%=d.getNome()%> </h1>
        
        Codigo: <%=d.getCodigo()%> </br>
        Professor: <%=d.getProfessor()%> </br>
        Semestre: <%=d.getSemestre()%> 
        
        
    </body>
</html>
