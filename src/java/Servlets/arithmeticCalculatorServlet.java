
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class arithmeticCalculatorServlet extends HttpServlet {

  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").
                forward(request, response);
        
        
    }
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first_entry");
        request.setAttribute("first", first);
       
       String second = request.getParameter("second_entry");
       request.setAttribute("second", second);
       int numFirst = Integer.parseInt(first);
       int numSecond = Integer.parseInt(second);
       
       String selected = request.getParameter("selected");
       int numAdd = 0;
       if("+".equals(selected)){
           numAdd = (numFirst + numSecond);
           
        
       }
       request.setAttribute("message", numAdd);
       getServletContext().getRequestDispatcher("/WEB-INF/arithemticCalculator.jsp").forward(request, response);
    }

    

}
