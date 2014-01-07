/**
 * EditorsResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import epsi.talkative.webservice.beans.Editor;
import epsi.talkative.webservice.repository.EditorRepository;

@Path("editors")
public class EditorsResource {

	private EditorRepository editorRepository;

	public EditorsResource() {
		Editor editor2 = new Editor("2");
		ArrayList<Editor> defaultEditors = new ArrayList<>();
		defaultEditors.add(editor2);
		editorRepository = new EditorRepository(defaultEditors);
	}

	@Path("{editorId}")
	public EditorResource getEditor(@PathParam("editorId") String editorId) {
		if (!editorRepository.contains(editorId))
			throw new WebApplicationException(Status.UNAUTHORIZED);
		return new EditorResource(editorRepository);
	}

}
