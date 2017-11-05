import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ControllerServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("----- Request parameters -----");
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            System.out.print("Parameter name: " + paramName + ", values: ");
            String[] paramValues = request.getParameterValues(paramName);
            for (String paramValue : paramValues) {
                System.out.print(paramValue + "; ");
            }
            System.out.println();
        }

        // Чтение запрашиваемого действия
        String action = request.getParameter("action");

        // URL по умолчанию (главная страница)
        String url = "/index.jsp";

        // Формирование URL в зависимости от запроса
        if (action != null) {
            switch (action) {
                case "show-login":
                    url = "/jsp/login.jsp";
                    break;
                case "show-register":
                    url = "/jsp/register.jsp";
                    break;
                case "show-index":
                    url = "/index.jsp";
                    break;
                case "login":
                case "register":
                    url = "/jsp/game.jsp";
                    break;
                case "check-number":
                    // check
                    break;
                case "new-game":
                    // new
                default:
                    url = "/jsp/error.jsp";
            }
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
