import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet(name = "helloServlet")
public class helloServelt extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   request.setAttribute("hello", "Hello Java");
     //   request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Test</title>\n" +
                "    <style>\n" +
                "        h1{\n" +
                "            color: chartreuse;\n" +
                "            font-size: 50px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>HELLO</h1>\n" +
                "</body>\n" +
                "</html>");
    }
}
