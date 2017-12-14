import app.Server;

public class SimpleHTTPServer {

    public static void main(String[] args) {
        if(args.length > 0) {
            Server server = new Server(Integer.parseInt(args[0]));
            server.execute();
        }else {
            Server server = new Server();
            server.execute();
        }
    }
}