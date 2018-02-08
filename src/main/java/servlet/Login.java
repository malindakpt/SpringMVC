package servlet; /**
 * Created by MalindaK on 2/21/2016.
 */
// Import required java libraries

import entity.User;
import entityManager.EntityManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class Login extends HttpServlet {


    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {

            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            User user = (User) EntityManager.getEntity2(User.class,"userName",userName, "password",password);

            if(user!=null) {
                String sessionId = user.getUserId()+""+Calendar.getInstance().getTimeInMillis();
                user.setSessionId(sessionId);
                EntityManager.update(user);
                out.write("OK,"+sessionId+","+user.getUserId());
            }else{
                out.write("NO,");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        throw new ServletException("GET method used with " +
                getClass( ).getName( )+": POST method required.");
    }


}
