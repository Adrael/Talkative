package epsi.talkative.webservice.test;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.openejb.jee.SingletonBean;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.junit.EnableServices;
import org.apache.openejb.junit.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@EnableServices(value = "jaxrs")
@RunWith(ApplicationComposer.class)
public class CommentTest {
    @Module
    public SingletonBean app() {
        return (SingletonBean) new SingletonBean(CommentTest.class).localBean();
    }

    @Test
    public void NewArticleWithGoodEditor_ReturnNoComments() throws IOException {
        final String result = WebClient.create("http://localhost:9080")
        		.path("/TalkativeWebService/2/article/65/comments").get(String.class);
        assertEquals("[]", result);
    }
}
