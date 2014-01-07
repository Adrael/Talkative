/**
 * EditorResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import epsi.talkative.webservice.beans.Editor;

public class EditorResource {

	@GET
	public Editor get(@PathParam("editorId") String editorId) {
		return new Editor();
	}

	@Path("/articles")
	public ArticlesResource getArticles() {
		return new ArticlesResource();
	}

}
