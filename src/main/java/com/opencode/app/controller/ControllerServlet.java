import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
                default:
                    url = "/jsp/error.jsp";
            }
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
