/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author neilkenney
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/CalculatorController"})
public class CalculatorController extends HttpServlet {
    private static final String RESULT_PAGE = "index.jsp";
    private String area = "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        area = request.getParameter("area");

        CalculatorService calc = new CalculatorService();
       try{
        if (area.equals("rectangle")) {
            Double length = Double.parseDouble(request.getParameter("length"));
            Double width = Double.parseDouble(request.getParameter("width"));
            request.setAttribute("length", length);
            request.setAttribute("width", width);
            request.setAttribute("rectangleArea", calc.getRectangleArea(length, width));
        }
        else if(area.equals("circle")){
            Double radius = Double.parseDouble(request.getParameter("radius"));
            request.setAttribute("circleArea", calc.getCicrleArea(radius));
        }
        else if(area.equals("triangle")){
            Double base = Double.parseDouble(request.getParameter("base"));
            Double height = Double.parseDouble(request.getParameter("height"));
            request.setAttribute("triangleArea", calc.getTriangleArea(base, height));
            
        }                                                                                                               
       }catch(Exception nullValue){
           RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
       }
            RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        
       
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
        
        
        
        
        
        
        // This object lets you forward both the request and response
        // objects to a destination page
       
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
