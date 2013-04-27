package uk.co.benjiweber.restdemo.server;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

@Path("/")
public class DemoServer {
	
	@GET
	@Produces("application/x-benji-restdemo")
	public String getRoot() throws JsonGenerationException, JsonMappingException, IOException  {
		ObjectMapper objectMapper = new ObjectMapper();  
		return objectMapper.writeValueAsString(createExamplePublisherRoot());
	}
	
	public PublisherRoot createExamplePublisherRoot() {
		return new PublisherRoot(1111,
			new Campaign("Buy a car",9834),
			new Campaign("Unhealthy snacks",1343)
		);
	}
	
    public static void main(String... args) throws Exception {
    	EmbeddedJettyServer.start();
    }
}
