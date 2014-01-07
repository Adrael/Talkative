/**
 * InMemoryRepository.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.repository;

import java.util.ArrayList;
import java.util.List;

import javassist.NotFoundException;

public abstract class InMemoryRepository<T, ID> implements Repository<T, ID> {

	private List<T> objects;

	public InMemoryRepository(List<T> defaultData) {
		objects = new ArrayList<>(defaultData);
	}

	@Override
	public T get(ID id) throws NotFoundException {
		for (T obj : objects) {
			ID objectId = getId(obj);
			if (objectId.equals(id))
				return obj;
		}
		throw new NotFoundException(id.toString());
	}

	@Override
	public boolean contains(ID id) {
		try {
			this.get(id);
		} catch (NotFoundException ex) {
			return false;
		}
		return true;
	}

	protected abstract ID getId(T obj);

}
