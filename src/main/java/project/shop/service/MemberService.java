package project.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import project.shop.repository.MemberDao;

@Component
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	public MemberService(MemberDao dao) {
		this.dao = dao;
	}
	
}
