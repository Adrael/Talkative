/**
 * EditorResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javassist.NotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import epsi.talkative.webservice.beans.Editor;
import epsi.talkative.webservice.repository.EditorRepository;

public class EditorResource {

	private EditorRepository editorRepository;

	public EditorResource(EditorRepository editorRepository) {
		this.editorRepository = editorRepository;
	}

	@GET
	public Editor get(@PathParam("editorId") String editorId) {
		try {
			Editor editor = editorRepository.get(editorId);
			return editor;
		} catch (NotFoundException e) {
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}
	}

	@Path("/articles")
	public ArticlesResource getArticles() {
		return new ArticlesResource();
	}

}
