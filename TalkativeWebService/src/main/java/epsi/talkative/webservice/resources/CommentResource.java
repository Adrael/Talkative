package epsi.talkative.webservice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.apache.commons.lang.NotImplementedException;

@Path("editors/{editorId}/articles/{articleId}/comments")
public class CommentResource {

	@GET
	public String get(@PathParam("editorId") String editorId, @PathParam("articleId") String articleId) {
		throw new NotImplementedException();
	}
}
