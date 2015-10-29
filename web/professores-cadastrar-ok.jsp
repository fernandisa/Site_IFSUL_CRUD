<%@page import="dao.ProfessorDAO"%>
<%@page import="modelo.Professor"%>
<%@include file="cabecalho.jsp"%>
<%
    
    // Buscar informações do formulário
    String nome = request.getParameter("txtNome");
    String siape = request.getParameter("txtSiape");
    
    // Criar meu objeto modelo
    Professor prof = new Professor ();
    //Adicionar os valores enviados
    prof.setNome(nome);
    prof.setSiape(siape);
    
    //Instanciar minha classe de acesso a dados
    ProfessorDAO dao = new ProfessorDAO ();
    dao.incluir(prof);
    
    
    
    

%>
         <h1 class="centro">Cadastro de Professores</h1>
            
         <div>
             Registro cadastrado com sucesso.<br />
             <a href="professores.jsp">Voltar para Listagem</a>
             
         </div>
    </body>
</html>