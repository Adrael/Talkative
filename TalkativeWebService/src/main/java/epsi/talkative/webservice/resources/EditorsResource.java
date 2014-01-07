/**
 * EditorsResource.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javax.ws.rs.Path;

@Path("editors")
public class EditorsResource {

	public EditorsResource() {
		// TODO Auto-generated constructor stub
	}

	@Path("{editorId}")
	public EditorResource getEditor() {
		return new EditorResource();
	}

}
