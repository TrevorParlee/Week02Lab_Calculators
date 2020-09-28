
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
       String second = request.getParameter("second_entry");
       request.setAttribute("first", first);
       request.setAttribute("second", second);
       if(first == "" || first == null || second == "" || second == null){
           request.setAttribute("message", "please enter a number");
       } else{
       try{
       int numFirst = Integer.parseInt(first);
       int numSecond = Integer.parseInt(second);
       
       String selected = request.getParameter("selected");
       int numAdd = 0;
       
        if(selected.equals("add")){
           numAdd = (numFirst + numSecond);
            request.setAttribute("message", numAdd);
        }
        else if(selected.equals("sub")){
            numAdd = (numFirst - numSecond);
            request.setAttribute("message", numAdd);
        }
        else if(selected.equals("multi")){
            numAdd = (numFirst * numSecond);
            request.setAttribute("message", numAdd);
        }
        else if(selected.equals("div")){
            numAdd = (numFirst % numSecond);
            request.setAttribute("message", numAdd);
        }
        
       
      }catch(NumberFormatException nfe){
           request.setAttribute("message", "invalid input");
       }}
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").
                forward(request, response);
    }

    

}
