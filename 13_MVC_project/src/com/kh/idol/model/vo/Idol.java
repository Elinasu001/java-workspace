package com.kh.idol.model.vo;

import java.util.Objects;

public class Idol {
	
	private String name;
	private String position;
	private String skill;
	private String image;
	
	public Idol() {
		super();
	}
	public Idol(String name, String position, String skill) {
		super();
		this.name = name;
		this.position = position;
		this.skill = skill;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, position, skill);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Idol other = (Idol) obj;
		return Objects.equals(name, other.name) && Objects.equals(position, other.position)
				&& Objects.equals(skill, other.skill);
	}
	@Override
	public String toString() {
		return "Idol [name=" + name + ", position=" + position + ", skill=" + skill + "]";
	}
	
}
