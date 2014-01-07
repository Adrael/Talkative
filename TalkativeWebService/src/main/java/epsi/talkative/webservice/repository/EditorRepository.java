/**
 * EditorRepository.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.repository;

import java.util.List;

import epsi.talkative.webservice.beans.Editor;

public class EditorRepository extends InMemoryRepository<Editor, String> {

	public EditorRepository(List<Editor> defaultData) {
		super(defaultData);
	}

	protected String getId(Editor obj) {
		return obj.getName();
	}

}
