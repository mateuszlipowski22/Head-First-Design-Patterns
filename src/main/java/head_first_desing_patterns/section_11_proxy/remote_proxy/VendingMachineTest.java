package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class VendingMachineTest {

    public static void main(String[] args) {

        VendingMachineRemote vendingMachine = null;
        int number;

        if(args.length<2){
            System.out.println("Automat sprzedający <nazwa> <towar>");
            System.exit(1);
        }

        try{
            number = Integer.parseInt(args[1]);
            vendingMachine=new VendingMachine(args[0],number);
            Naming.rebind("//"+args[0]+"/vendingmachine", vendingMachine);
        } catch (MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

}