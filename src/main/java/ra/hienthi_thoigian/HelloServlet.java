package ra.hienthi_thoigian;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        Date today = new Date();
        DateFormat sf = DateFormat.getDateInstance(DateFormat.FULL,new Locale("vi","VN"));
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Thời gian hệ thống "+sf.format(today)+"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}