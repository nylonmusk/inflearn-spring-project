package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class memberController {

    private MemberService memberService;

    //    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
    @Autowired
    public memberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
