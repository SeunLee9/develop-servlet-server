package step01.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookie")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버가 클라이언트한테 응답 메시지로 보낼 데이터에 대한 부가정보(문서의 타입, 문자셋 지정)
		response.setContentType("text/html;charset=UTF-8");
		
		// 쿠키 객체 생성, Constructs a cookie with the specified name and value.
		Cookie cookie1 = new Cookie("id", "guest");
		
		//쿠키는? 클라이언트의 브라우저에 저장, 클라이언트 측에 보내기 위해서는 응답 객체(response)에 쿠키를 저장해야함
		response.addCookie(cookie1); // 응답정보(Response message)에 쿠키도 동봉
		//서버가 클라이언트한테 무언가 보낼준비가 다 된것
		Cookie cookie2 = new Cookie("nickName", "Spiderman");
		//만료시간설정할거임바로밑의 응답객체에 넣기전에 설정해야겠지?
		cookie2.setMaxAge(60); //일반적으로 기준은 second(초)
		response.addCookie(cookie2);
		
		PrintWriter out = response.getWriter();
		out.print("서버에서 생성한 쿠키가 클라이언트로 전송되었음.");
		
		//자원 해제
		out.close();
		
	}

}
