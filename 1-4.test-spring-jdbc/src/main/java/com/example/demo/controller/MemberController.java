package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {

		// 全件検索
		List<Member> memberList = repository.findAll();

		for (Member member1:memberList) {
			System.out.println(member1.getId());
			System.out.println(member1.getName());
			System.out.println(member1.getAge());
			System.out.println(member1.getDepartmentId());
		}

		// 1件検索
		Member member2 = repository.load(2);
		System.out.println(member2.getId());
		System.out.println(member2.getName());
		System.out.println(member2.getAge());
		System.out.println(member2.getDepartmentId());

		// 登録
		Member member3 = new Member();
		member3.setName("北本");
		member3.setAge(28);
		member3.setDepartmentId(1);
		
		repository.save(member3);

		// 更新
		Member member4 = new Member();
		member4.setId(2);
		member4.setName("シロー");
		repository.save(member4);
		
		return "member";
	}
}
