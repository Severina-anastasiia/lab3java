package ua.com.nure;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/nation")
public class NationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String town = request.getParameter("towns");
        String sex = request.getParameter("sex");

        CreateResult createResult = new CreateResult();
        response.setCharacterEncoding("cp1251");
        response.getWriter().println(createResult.result(town, sex));
    }
}
