package go4.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	 private Internet internet = new RealInternet(); 
	    private static List<String> bannedSites; 
	      
	    static
	    { 
	        bannedSites = new ArrayList<String>(); 
	        bannedSites.add("stackoverflow.com"); 
	        bannedSites.add("mkyoung.com"); 
	        bannedSites.add("codeprojec.com"); 
	        bannedSites.add("javarevisited.com"); 
	    } 
	      
	    @Override
	    public void connectTo(String serverhost) throws Exception 
	    { 
	        if(bannedSites.contains(serverhost.toLowerCase())) 
	        { 
	            throw new Exception("Access Denied. Contact Administrator!!!"); 
	        } 
	          
	        internet.connectTo(serverhost); 
	    } 
}
