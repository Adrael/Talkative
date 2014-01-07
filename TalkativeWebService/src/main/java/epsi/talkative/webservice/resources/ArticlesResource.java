/**
 * Articles.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.resources;

import javax.ws.rs.Path;

public class ArticlesResource {

	public ArticlesResource() {
		// TODO Auto-generated constructor stub
	}

	@Path("{articleId}")
	public ArticleResource getArticle() {
		return new ArticleResource();
	}

}
