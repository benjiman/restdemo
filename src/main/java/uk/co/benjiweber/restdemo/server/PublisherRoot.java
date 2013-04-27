package uk.co.benjiweber.restdemo.server;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class PublisherRoot {
	
	public PublisherRoot(int publisherId, Campaign... campaigns) {
		this.campaigns = asList(campaigns);
		this.earningsReport = Link.link("/earningsReport?publisherId=" + publisherId + "&from=" + PublisherRoot.class.getSimpleName());
	}
	
	
	public List<Campaign> campaigns;
	public Link earningsReport;
}
