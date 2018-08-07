package cn.net.ohf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.net.ohf.dao.TestTableMapper;
import cn.net.ohf.pojo.TestTable;

@Controller
public class TestController {
	@Autowired
	private TestTableMapper testMapper;
	@RequestMapping(value="/index")
	public ModelAndView testController(){
//		List<TestTable> list = new ArrayList<TestTable>();
		List<TestTable> list = testMapper.selectAll();
		ModelAndView mv = new ModelAndView("Human");
		mv.addObject("list", list);
		return mv;
	}
}
