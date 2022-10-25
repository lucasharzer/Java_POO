public class SocketServerExample {

    private static ServerSocket server;
    //socket server port em que vai ouvir

    private static int port = 9876;

    public static void main(String args[]) throws IOException, ClassNotFoundException{
        // criar o objeto do servidor de soquete

        server = new ServerSocket(port);

        while(true){
            System.out.println("Waiting for the client request");
            // criando soquete e aguardando conexão do cliente

            Socket socket = server.accept();
            // leia a partir do soquete para ObjectInputStream object

            ObjectInputStream ois = new ObjectInputStream(socket. getInputStream());
            //converte ObjectInputStream object to String

            String message = (String) ois.readObject();

            System.out.println("Message Received: " + message);
            //cria objeto ObjectOutputStream

            ObjectOutputStream oos = new ObjectOutputStream(socket. getOutputStream());
            // escrever objeto no soquete

            oos.writeObject("Hi Client "+message);
            // fechar recursos

            ois.close();

            oos.close();

            socket.close();
            // encerrar o servidor se o cliente enviar uma solicitação de saída

            if(message.equalsIgnoreCase("exit")) break;
        }

        System.out.println("Desligando Socket server!!");
        //fecha o objeto ServerSocket

        server.close();
    }
}