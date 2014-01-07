/**
 * ApplicationTest.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.openejb.jee.SingletonBean;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import epsi.talkative.webservice.beans.Editor;
import epsi.talkative.webservice.resources.EditorResource;

@RunWith(ApplicationComposer.class)
@EnableServices("jaxrs")
public class EditorTest {

	@Module
	public SingletonBean app() {
		return (SingletonBean) new SingletonBean(EditorResource.class).localBean();
	}

	@Test
	public void getExistingEditor() {
		WebClient client = createClient();
		Editor editor = client.path("/editors/2").get(Editor.class);
		assertEquals("test", editor.getName());
	}
	
	@Test
	public void getUnexistingEditor() {
		WebClient client = createClient();
		Response response = client.path("/editors/3").get(Response.class);
		assertEquals(404, response.getStatus());
	}

	private WebClient createClient() {
		return WebClient.create("http://localhost:4204/EditorTest");
	}

}
