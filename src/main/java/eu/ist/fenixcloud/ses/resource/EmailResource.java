package eu.ist.fenixcloud.ses.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import jvstm.Atomic;
import eu.ist.fenixcloud.ses.Bootstrap;

@Path("email")
public class EmailResource {

	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public static String getAllTheEmails() {
	    Bootstrap.init();
	    return fetchAllTheEmails();
	  }
	  
	  @Atomic
	  public static String fetchAllTheEmails() {
		  return "";
	  }
	  
	
}
