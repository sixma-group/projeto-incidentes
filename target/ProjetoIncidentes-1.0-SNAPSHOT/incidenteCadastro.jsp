<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.*" import="java.lang.*" %>
<%@page import="classes.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GaviemReport - Cadastro de Incidentes</title>
    </head>
    <body>
        <h1>Informações do cliente</h1>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            String celular = request.getParameter("celular");
            String telefone = request.getParameter("telefone");
            String logradouro = request.getParameter("logradouro");
            String bairro = request.getParameter("bairro");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String cep = request.getParameter("cep");
            boolean ativo = Boolean.getBoolean(request.getParameter("ativo"));
            String observacao = request.getParameter("observacao");

            Cliente c = new Cliente( id, nome, cpf, email, celular, telefone, 
                    logradouro, bairro, cidade, estado, cep, ativo, observacao);
            
            out.println("<b>Cadastro - Cliente: </b>");
            out.println("<br> Código do cliente: " + c.getId());
            out.println("<br> Nome: " + c.getNome());
            out.println("<br> Cpf: " + c.getCpf());
            out.println("<br> E-mail: " + c.getEmail());
            out.println("<br> Celular: " + c.getCelular());
            out.println("<br> Telefone: " + c.getTelefone());
            out.println("<br> Endereço: " + c.getLogradouro());
            out.println("<br> Bairro: " + c.getBairro());
            out.println("<br> Cidade: " + c.getCidade());
            out.println("<br> Estado: " + c.getEstado());
            out.println("<br> Cep: " + c.getCep());
            out.println("<br> Ativo: " + c.isAtivo());
            out.println("<br> Observação entrega: " + c.getObservacaoEntrega());

        %>
    </body>
</html>
