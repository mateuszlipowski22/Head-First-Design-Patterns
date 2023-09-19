package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.rmi.RemoteException;

public class VendingMachineMonitor {
    VendingMachineRemote vendingMachineRemote;

    public VendingMachineMonitor(VendingMachineRemote vendingMachineRemote) {
        this.vendingMachineRemote = vendingMachineRemote;
    }

    public void report(){
        try{
            System.out.println("Vending Machine: "+vendingMachineRemote.getLocation());
            System.out.println("Goods: "+vendingMachineRemote.getState());
            System.out.println("State: "+vendingMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
