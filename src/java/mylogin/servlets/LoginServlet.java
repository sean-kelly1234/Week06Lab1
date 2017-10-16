package mylogin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mylogin.classes.User;
import mylogin.classes.UserService;
import mylogin.utility.CookieUtility;

/**
 *
 * @author 642202
 */
public class LoginServlet extends HttpServlet {    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        String username = "";
        String action = request.getParameter("action");
        
        
        if (action != null && action.equals("logout")){
            session.setAttribute("user", null);
            request.setAttribute("message", "logged out");
        }
        
        if (cookies != null){
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("username")){
                    username = cookie.getValue();
                    request.setAttribute("username", username);
                }
            }
        }
        
        if (session.getAttribute("user") != null){
            response.sendRedirect("home");
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);

    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        System.out.println(remember);
        HttpSession session = request.getSession();
        if (username != null && password != null && !username.equals("") && !password.equals("")){
            User user = UserService.login(username, password);
            if (user != null) {
                if (remember != null) {
                    Cookie cUser = new Cookie("username", username);
                    cUser.setMaxAge(60 * 60);
                    cUser.setPath("/");
                    response.addCookie(cUser);
                }
                else {
                    Cookie cUser = CookieUtility.removeCookie(request.getCookies(), "username");
                    response.addCookie(cUser);
                }
                session.setAttribute("user", user);
                response.sendRedirect("home");
            } 
            else {
                request.setAttribute("message", "Invalid username or password.");
                getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
            }
        } 
        else {
            request.setAttribute("message", "Enter login details");
            getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
    }

}
