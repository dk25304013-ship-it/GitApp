import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * アンケート内容を受け取って、結果を表示するサーブレット
 */
public class GitInputServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // リクエストの文字コードをUTF-8に設定（enquete.htmlの文字コードに合わせる）
        request.setCharacterEncoding("UTF-8");

        // リクエストパラメータを取得
        String yourname = request.getParameter("yourname");
        String family = request.getParameter("family");

        // レスポンスの設定
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // レスポンスの出力
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>あなたの回答</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>あなたの回答</h1>");
        out.println("性　は" + yourname + "ですね。");
        out.println("名　は" + family + "ですね。");
        out.println("</body>");
        out.println("</html>");
    }
}