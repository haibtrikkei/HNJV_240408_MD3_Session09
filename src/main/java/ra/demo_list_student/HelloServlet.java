package ra.demo_list_student;

import ra.demo_list_student.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    static List<Student> list = new ArrayList<>();

    static{
        list.add(new Student(1,"Nguyễn Văn Cường","JV240408"));
        list.add(new Student(2,"Nguyễn Thị Lan","JV240408"));
        list.add(new Student(3,"Trần Quốc Hùng","JV240408"));
        list.add(new Student(4,"Lê Văn Đạt","JV240408"));
    }

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");

        request.setAttribute("list",list);
        request.getRequestDispatcher("listStudent.jsp").forward(request,response);
    }

    public void destroy() {
    }
}