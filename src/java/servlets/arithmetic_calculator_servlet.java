/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author het
 */
public class arithmetic_calculator_servlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = 0;
        
        String First = request.getParameter("first");
        String Second = request.getParameter("second");
        String input = request.getParameter("arithmetic");
        String message = "";
        request.setAttribute("input", input);
        
        if(First==null || First.equals("") ||Second==null||Second.equals("") ){
                message = "Invalid";
        }
        else{
            try{
                int firstInteger = Integer.parseInt(First);
                int secondInteger = Integer.parseInt(Second);
        
         if(input.equals("+")){
            result = firstInteger+secondInteger;
        }
         else if(input.equals("-")){
            result = firstInteger-secondInteger;
        }
         else if(input.equals("*")){
            result = firstInteger*secondInteger;
        }
         else if(input.equals("/")){
            result = firstInteger%secondInteger;
        }
            }
            catch(NumberFormatException e){
                message = "Invalid";
            }

        }
        request.setAttribute("message",message);
        request.setAttribute("Result",result);
        getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
        
        


        
    }

    
}
