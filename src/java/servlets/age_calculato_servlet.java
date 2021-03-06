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
public class age_calculato_servlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/age-calculator.jsp").forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String number = request.getParameter("age");
        String message = "";
        
        request.setAttribute("number", number);
                
        if(number == null || number.equals("")){   
            String errorMessage = "please enter something";
            request.setAttribute("error",errorMessage);
             getServletContext().getRequestDispatcher("/WEB-INF/age-calculator.jsp").forward(request, response);
        }
        else{
            
            try{
        int counter = Integer.parseInt(number);
        int value = counter+1;  
        message = "Your next age will be " + value;
            }
            catch(NumberFormatException e){
                message = "please enter the number";
            }
        }
        
        request.setAttribute("message",message);
         getServletContext().getRequestDispatcher("/WEB-INF/age-calculator.jsp").forward(request, response);
        
        
    }


}
