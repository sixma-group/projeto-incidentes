<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.*" import="java.lang.*" %>
<%@page import="classes.Incidente"%>

<!DOCTYPE html>
<html>
    <head>
        <title>GaviemReport - Cadastro de Incidentes</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../styles/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="page">
            <div class="panel">
                    <label class="title-panel" >GaviemReport</label>
                    <label class="subtitle-panel">Informações do Incidente</label>
            </div>
            <%
                int id = Integer.parseInt(request.getParameter("id"));
                String prioridade = request.getParameter("prioridade");
                String requisitante = request.getParameter("requisitante");
                String departamento = request.getParameter("departamento");
                String cargo = request.getParameter("cargo");
                String email = request.getParameter("email");
                String telefone = request.getParameter("telefone");
                String descricao = request.getParameter("descricao");
                String areaServico = request.getParameter("areaServico");
                String tipoServico = request.getParameter("tipoServico");

                Incidente inc = new Incidente(id, prioridade, requisitante, departamento, 
                cargo, email, telefone, descricao, areaServico, tipoServico);
            %>
            
            <div class="duo-tables">
                <div class="table">
                    <label style="font-size: 24px;">
                        <b>Código: <% out.print(inc.getId()); %> </b>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Prioridade: <% out.print(inc.getPrioridade()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Requisitante <% out.print(inc.getRequisitante()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Departamento: <% out.print(inc.getDepartamento()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Cargo: <% out.print(inc.getCargo()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        E-mail: <% out.print(inc.getEmail()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Telefone: <% out.print(inc.getTelefone()); %>
                    </label>
                </div>
                <div class="table">
                    <label style="font-size: 24px;">
                        Descrição: 
                        <text style="width: 290px;"><% out.print(inc.getDescricao()); %></text>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Área de Serviço: <% out.print(inc.getAreaServico()); %>
                    </label>
                    <br>
                    <label style="font-size: 20px;">
                        Tipo de Serviço: <% out.print(inc.getTipoServico()); %>
                    </label>
                </div> 
            </div>
        </div>
    </body>
</html>
