package com.ty;

import java.util.List;

public class Branch {
		private int id;
		private String name;
		private long phno;
		private List<String> dname;
		private Person person;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public List<String> getDname() {
			return dname;
		}
		public void setDname(List<String> dname) {
			this.dname = dname;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		
}
