/**
 * Repository.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.repository;

import javassist.NotFoundException;

public interface Repository<T, ID> {

	public T get(ID id) throws NotFoundException;

	public boolean contains(ID id);
}
