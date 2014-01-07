/**
 * ArticleResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class ArticleResource {

	public ArticleResource() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("comments")
	public String getComments() {
		return "";
	}
}
