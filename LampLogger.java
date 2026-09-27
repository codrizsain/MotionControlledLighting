import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;

public class LampLogger {
    public static void main(String[] args) throws Exception {
        // Membuat server API di port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        server.createContext("/api/log", (exchange -> {
            // Mengizinkan akses dari port Python (CORS)
            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
            
            String query = exchange.getRequestURI().getQuery();
            System.out.println("[JAVA BACKEND LOG] Ada pergerakan! " + query);
            
            String response = "Status berhasil dicatat oleh Java!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }));
        
        server.setExecutor(null);
        System.out.println("Java API Server siap menerima log di port 8080...");
        server.start();
    }
}
