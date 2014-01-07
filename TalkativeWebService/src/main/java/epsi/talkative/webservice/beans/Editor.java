/**
 * Editor.java
 * created on Jan 7, 2014 by manu
 * Copyright Personalized-Software Ltd
 */

package epsi.talkative.webservice.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Editor {

	public Editor() {

	}

	public Editor(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
