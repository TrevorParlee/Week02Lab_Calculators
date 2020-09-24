
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ageCalculatorServlet extends HttpServlet{

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
        forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
       String age = request.getParameter("user_age");
       
       request.setAttribute("age", age);
       int numAge = 0;

        try {
         numAge = Integer.parseInt(age);
        } catch (NumberFormatException numberFormatException) {
            request.setAttribute("message", "You must enter a valid number");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
            forward(request, response);
        }
    
      /* int numAge = Integer.parseInt(age);
       if(age == null){
           request.setAttribute("message", "You must enter a number");
           getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
            forward(request, response);
           return;
       }
       
       else if(numAge < 0 || numAge > 150){
           request.setAttribute("message", "You must enter valid number");
           getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
            forward(request, response);
           return;
       }else*/
       numAge++;
       request.setAttribute("message", "You wil be "+ numAge);
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
       
       
    }


}
