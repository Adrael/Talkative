package epsi.talkative.webservice.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import epsi.talkative.webservice.beans.Comment;
import epsi.talkative.webservice.dao.CommentDao;
import epsi.talkative.webservice.filter.CommentFilter;

public class CommentDaoTest {

	@Test
	public void getComments() {
		//Arrange
		CommentDao commentDao = new CommentDao();
		CommentFilter filter = new CommentFilter();
		filter.setEditorId(2);
		filter.setArticleId(65);
		
		//Act
		List<Comment> comments = commentDao.get(filter);
		
		//Assert
		assertEquals(0, comments.size());
	}

}
