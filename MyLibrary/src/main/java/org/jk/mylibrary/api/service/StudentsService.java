package org.jk.mylibrary.api.service;

import org.jk.mylibrary.api.entites.Students;
import org.jk.mylibrary.api.model.ResponseVO;
import org.jk.mylibrary.api.model.StudentsVO;
import org.jk.mylibrary.api.repository.StudentsRepository;
import org.jk.mylibrary.util.HttpStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

	@Autowired
	private StudentsRepository studentrepository;
	
	public ResponseVO CreateStudent(StudentsVO studentvo){
		//Creating Response Object
		ResponseVO responseVO=new ResponseVO();
		//Checking UserInDB
		Students dbstudent=studentrepository.findStudentByMblNum(studentvo.getMobile());
		if (dbstudent == null) {
			Students student=new Students();
			student.setSname(studentvo.getSname());
			student.setBookCount(studentvo.getBookCount());
			student.setMobile(studentvo.getMobile());
			student.setAddress(studentvo.getAddress());
			student.setYearofstu(studentvo.getYearofstu());
			student.setStatus(studentvo.getStatus());
			studentrepository.save(student);
			responseVO = HttpStatusCode.CREATED.getResponseVO("SUCCESS");
		}
		else if(dbstudent.getMobile().equals(studentvo.getMobile())) {
			// Mobile already exist
			responseVO = HttpStatusCode.ALREADY_REPORTED.getResponseVO("Mobile Number Already Exist");
		}
		return responseVO;
		
	}
}
