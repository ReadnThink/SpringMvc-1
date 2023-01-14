package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp"; //경로를 지정
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); //컨트롤러에서 view로 이동시 사용
        dispatcher.forward(request,response); // 서블릿에서 JSP로 넘긴다.

    }
}
