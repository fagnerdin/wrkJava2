package br.com.rcalves.controller;

import br.com.rcalves.model.Calculo;
import br.com.rcalves.model.Carros;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fagnerdin
 */
public class servletControl extends HttpServlet {

    public servletControl(){
        super();
     }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Calculo calc = new Calculo();
        
//        calc.setNum(2);
//        calc.setDen(1);

        String num = calc.divisao(
                request.getParameter("numerador"),
                request.getParameter("denominador")
                );

        request.setAttribute("sugestao",  num);

        
        request.getRequestDispatcher("result.jsp").forward(request, response);

        
//        //-------------------------
//        // instancia carro tipo Carros (metodos dentro de Carros)
//        Carros carro = new Carros();
//        
//        //Cria lista 'sugestao' pegando carro.getCarros baseado na preferencia getParameter selecionada 
//        List<String> sugestao = carro.getCarros((String)request.getParameter("preferencia"));
//        
//        // busca sugestao
//        request.setAttribute("sugestao", sugestao);
//        
//        // envia resposta para result.jsp
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
