package 추상;

public class HttpServletExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HttpService(new LoginServlet());
		HttpService(new FileDownloadServlet());
	}
	public static void HttpService(HttpServlet httpServlet) {
		httpServlet.service();
	}
}
abstract class HttpServlet{
	public abstract void service(); 
}
class LoginServlet extends HttpServlet{

	@Override
	public void service() {
		System.out.println("로그인합니다");

	}

}
class FileDownloadServlet extends HttpServlet{

	@Override
	public void service() {
		System.out.println("파일 다운로드합니다");

	}

}
