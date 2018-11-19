package com.aaa.sm.controller;

import com.aaa.sm.service.EmpService;
import com.aaa.sm.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * className:EmpController
 * discriptoin:
 * author:张晓峰
 * createTime:2018-11-07 15:50
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;
    /**
     * 雇员列表
     * @param map
     * @param model
     * @return
     */
    @RequestMapping("/lists")
    public String empList(@RequestParam Map map, Model model, HttpServletRequest request){
        map.put("pageSize",5);
        int pageNo = map.get("pageNo")==null?1:Integer.valueOf(map.get("pageNo")+"");
        String stringPage = new PageUtil(pageNo,5,empService.getPageCount(map),request).getStringPage();
        model.addAttribute("stringPage",stringPage);
        model.addAttribute("empList",empService.getPage(map));
        return "emp/list";
    }
    @RequestMapping("/add")
    public String addList(@RequestParam Map map){
        empService.addList(map);
        return "redirect:lists.do";
    }
    @RequestMapping("/del")
    public String delEmp(int empno){
        empService.delEmp(empno);
        return "redirect:lists.do";
    }
    @RequestMapping("/getById")
    public String getById(int empno,Model model){
        List<Map> emp = empService.getById(empno);
        model.addAttribute("empList",emp.get(0));
        return "emp/update";
    }
    @RequestMapping("/update")
    public String updateList(@RequestParam Map map){
        System.out.println(map);
        empService.updateEmp(map);
        return "redirect:lists.do";
    }
}
