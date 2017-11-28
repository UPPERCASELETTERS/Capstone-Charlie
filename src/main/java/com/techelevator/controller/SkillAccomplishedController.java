//package com.techelevator.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.techelevator.dao.SkillAccomplishedDAO;
//import com.techelevator.model.StudentSkill;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class SkillAccomplishedController {
//
//	@Autowired
//	SkillAccomplishedDAO skillAccomplishedDao;
//	
//	@RequestMapping(path="/addAccomplishedSkill", method=RequestMethod.POST)
//	public void saveAccomplishedSkill (@ModelAttribute StudentSkill studentSkill){
//
//		skillAccomplishedDao.saveSkillAccomplished(studentSkill.getSkillId(), studentSkill.getStudentId());
//
//		skillAccomplishedDao.saveSkillAccomplished(studentSkill.getThisSkill().getSkillId(), studentSkill.getStudentId());
//
//	}
//	
//}
