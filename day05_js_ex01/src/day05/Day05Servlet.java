package day05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data.do")
public class Day05Servlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      resp.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html; charset=UTF-8");
      
      PrintWriter out = resp.getWriter();
      
      out.println("<html>"
            + "<body>"
            + "<h1>Hello world</h1>"
            + "</body>"
            + "</html>");
      
      out.close();
   }
   
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doProcess(req, resp);
   }

}