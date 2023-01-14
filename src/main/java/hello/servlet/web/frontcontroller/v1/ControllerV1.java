package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {
    //여러가지 폼을 구현할 것이다.
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
