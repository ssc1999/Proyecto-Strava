package es.deusto.ingenieria.sd.strava.server.gateway;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import es.deusto.ingenieria.sd.strava.server.data.domain.Type;

public class FacebookService extends LoginGateway{
	private String serverIP;
	private int serverPort;
	private static String DELIMITER = "#";
	
	public FacebookService (String servIP, int servPort) {
		serverIP = servIP;
		serverPort = servPort;
		super.type = Type.FACEBOOK;
	}
	
	@Override
    public boolean checkUser(String mail){
        String data = mail + DELIMITER;

        try {
            try (Socket socket = new Socket(serverIP, serverPort)) {
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				out.writeUTF(data);
				String result = in.readUTF();
				return Boolean.parseBoolean(result);
			}
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

	@Override
    public boolean checkPassword(String password){
        String data = password + DELIMITER;

        try {
            try (Socket socket = new Socket(serverIP, serverPort)) {
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				out.writeUTF(data);
				String result = in.readUTF();
				return Boolean.parseBoolean(result);
			}
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
	
}
