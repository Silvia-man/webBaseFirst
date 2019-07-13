import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BMIServlet", urlPatterns = "/bmi")
public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        try {
            double bmi = calculateBMI(weight, height);
            request.setAttribute("result", bmi);
            response.setHeader("BMI", String.valueOf(bmi));
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        } catch (Exception e) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        //  response.sendRedirect("/index.jsp");
        }

    }

    private double calculateBMI(String weight, String height) {
        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);

        return w / (h * h);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
