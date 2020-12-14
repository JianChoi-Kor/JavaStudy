
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Nana extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse)
						throws IOException, ServletException
	{
		System.out.println("hello Servlet");
	}
}

<servlet>
	<servlet-name>na</servlet-name>
	<servlet-class>Nana</servlet-class>
</servlet>

<servlet-mapping>
	<servlet-name>na</servlet-name>
	<url-pattern>/hello</url-pattern>
</servlet-mapping>