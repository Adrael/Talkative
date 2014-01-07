/**
 * EditorResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import epsi.talkative.webservice.beans.Editor;

@Path("editors/{editorId}")
public class EditorResource {

	@GET
	public Editor get(@PathParam("editorId") String editorId) {
		if(editorId.equals("3")) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
		
		Editor e = new Editor();
		e.setName("test");
		return e;
	}

	@Path("/articles")
	public ArticlesResource getArticles() {
		return new ArticlesResource();
	}

}
