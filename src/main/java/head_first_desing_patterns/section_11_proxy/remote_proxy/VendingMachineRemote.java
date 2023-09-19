package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VendingMachineRemote extends Remote {
     int getNumberOfGums() throws RemoteException;
     String getLocation() throws RemoteException;
     State getState() throws RemoteException;
}
