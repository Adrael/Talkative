package epsi.talkative.webservice.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.openejb.jee.SingletonBean;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import epsi.talkative.webservice.resources.CommentResource;

@RunWith(ApplicationComposer.class)
@EnableServices("jaxrs")
public class CommentTest {
    @Module
    public SingletonBean app() {
        return (SingletonBean) new SingletonBean(CommentResource.class).localBean();
    }

    @Test
    public void NewArticleWithGoodEditor_ReturnNoComments() throws IOException {
		WebClient client = createClient();
		Response result = client.path("editors/2/articles/65/comments").get(Response.class);
		assertEquals(204, result.getStatus());
	}
    
    @Test
    public void ArticleWithGoodEditor_ReturnNoComments() throws IOException {
		WebClient client = createClient();
		Response result = client.path("editors/3/articles/65/comments").get(Response.class);
    	assertEquals(401, result.getStatus());
    }

	private WebClient createClient() {
		return WebClient.create("http://localhost:4204/CommentTest");
	}

}
