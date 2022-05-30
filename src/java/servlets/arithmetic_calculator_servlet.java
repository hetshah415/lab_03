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
        int result;
        
        String First = request.getParameter("first");
        String Second = request.getParameter("second");
        String addition = request.getParameter("+");
        String subtraction = request.getParameter("-");
        String multiplication = request.getParameter("*");
        String division = request.getParameter("/");
        
        request.setAttribute("Addition", addition);
        request.setAttribute("Subtraction",subtraction );
        request.setAttribute("Multiplication", multiplication);
        request.setAttribute("Division", division);
        
        if(First!=null || !First.equals("") ||Second!=null||!Second.equals("") ){
                int firstInteger = Integer.parseInt(First);
                int secondInteger = Integer.parseInt(Second);
        
         if(addition.equals("+") || addition.equals("")){
            result = firstInteger+secondInteger;
            request.setAttribute("Result",result);
            getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
        }
         else if(subtraction.equals("-")|| subtraction.equals("")){
            result = firstInteger-secondInteger;
            request.setAttribute("Result",result);
            getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
        }
         else if(multiplication.equals("*")|| multiplication.equals("") ){
            result = firstInteger*secondInteger;
            request.setAttribute("Result",result);
            getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
        }
         else if(division.equals("/")|| division.equals("")){
             if(secondInteger == 0){
                 String message = "number can not be divided by 0";
                 request.setAttribute("message",message);
                }
            result = firstInteger/secondInteger;
            request.setAttribute("Result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/Arithmetic_calculator.jsp").forward(request, response);
        }

        }
        


        
    }

    
}
