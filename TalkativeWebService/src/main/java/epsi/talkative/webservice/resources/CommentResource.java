package epsi.talkative.webservice.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.apache.commons.lang.NotImplementedException;

public class CommentResource {

	@Path("editor/{editorId}/article/{articleId}/comments")
	public String get(@PathParam("editorId") String editorId, @PathParam("articleId") String articleId) {
		throw new NotImplementedException();
	}
}
