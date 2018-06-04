package org.jk.mylibrary.api.controller;

import org.jk.mylibrary.api.model.ResponseVO;
import org.jk.mylibrary.api.model.StudentsVO;
import org.jk.mylibrary.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentsController {

	@Autowired
	private StudentsService studentservice;

	@RequestMapping(value = "/createStudent", method = RequestMethod.POST)
	public ResponseVO createStudent(@RequestBody StudentsVO studentvo) {
		System.out.println("Data ::"+studentvo.toString());
		return studentservice.registerStudent(studentvo);
	}
}
