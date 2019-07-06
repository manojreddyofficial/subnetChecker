import java.util.Scanner;
import org.apache.commons.net.util.SubnetUtils;

public class Ipchecker{

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CIDR notation for your subnet : ");
		do{
			String subnet = sc.next();
			if(subnet.equals("exit")) {
				return;
			}
			SubnetUtils utils = new SubnetUtils(subnet);
			System.out.println("Enter the ip to check : ");
			String ip = sc.next();
			System.out.println(utils.getInfo().isInRange(ip));
			System.out.println("Enter text 'exit' to stop");
		}while(sc.hasNext());
    
	}
}
