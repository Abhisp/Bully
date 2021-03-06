import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * Created by Shreyas on 5/1/2014.
 */
public interface RemoteInterface extends Remote{
	
	
	public String giveResponse(String message) throws InterruptedException, NotBoundException, RemoteException;

	public void announce(String nodeID);

	public boolean givePermission(String nodeID) throws InterruptedException;

	public void accessCS() throws InterruptedException;

	public Hashtable<String, String> getDetails();

	public String getCoordinatorID();
}
