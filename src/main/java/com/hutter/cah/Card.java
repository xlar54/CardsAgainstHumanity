/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hutter.cah;

/**
 *
 * @author scott
 */
public class Card {

	String id;
        String pick;
	String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
        
        public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", text=" + text + "]";
	}

}
