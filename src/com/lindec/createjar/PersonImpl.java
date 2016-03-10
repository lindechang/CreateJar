package com.lindec.createjar;

import com.alibaba.fastjson.JSON;

public class PersonImpl {

	public String print() {
		Person person = new Person();
		person.setAge(11);
		person.setName("lindec");

		String result = "hello";

		result = JSON.toJSONString(person);
		System.out.println("-------test-------:" + result);

		return result;
	}

	public String pp() {
		return "miki";

	}

}
