package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class VendingMachineMonitorTest {
    public static void main(String[] args) {
        String[] localozation = {
                "rmi://gliwice.vendingmachine.com/vendingmachine",
                "rmi://wroclaw.vendingmachine.com/vendingmachine",
                "rmi://warszawa.vendingmachine.com/vendingmachine"
        };

        VendingMachineMonitor[] monitors = new VendingMachineMonitor[localozation.length];

        for (int i = 0; i < monitors.length; i++) {
            try {
                VendingMachineRemote vendingMachineRemote = (VendingMachineRemote) Naming.lookup(localozation[i]);
                monitors[i]=new VendingMachineMonitor(vendingMachineRemote);
                System.out.println(monitors[i]);
            } catch (MalformedURLException | RemoteException | NotBoundException e) {
                e.printStackTrace();
            }

        }

        for (VendingMachineMonitor monitor : monitors) {
            monitor.report();
        }

    }
}
