package uk.co.benjiweber.restdemo.server;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class EmbeddedJettyServer {

	public static void start() throws Exception {
        Server server = new Server(8080);
        Context root = new Context(server,"/",Context.SESSIONS);
        root.addServlet(
    		new ServletHolder(
				new ServletContainer(
					new PackagesResourceConfig(
						"uk.co.benjiweber.restdemo.server"
					)
				)
			),
			"/"
		);
        server.start();		
	}

}
