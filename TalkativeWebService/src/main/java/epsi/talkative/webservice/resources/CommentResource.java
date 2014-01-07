package epsi.talkative.webservice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("editors/{editorId}/articles/{articleId}/comments")
public class CommentResource {

	@GET
	public Response get(@PathParam("editorId") String editorId, @PathParam("articleId") String articleId) {
		if(editorId.equals("3"))
			return Response.status(401).build();
		return Response.noContent().build();
	}
}
