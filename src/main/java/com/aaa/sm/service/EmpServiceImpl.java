package com.aaa.sm.service;

import com.aaa.sm.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:雇员服务实现类
 * author:张晓峰
 * createTime:2018-11-07 15:16
 */
@Service//交给spring管理
public class EmpServiceImpl implements EmpService {

    @Autowired//依赖注入
    private EmpDao empDao;
    @Override
    public List<Map> getPage(Map map) {
        int pageNo = map.get("pageNo")==null?1:Integer.valueOf(map.get("pageNo")+"");
        int pageSize = map.get("pageSize")==null?10:Integer.valueOf(map.get("pageSize")+"");
        //计算分页的开始值和结束值
        map.put("start",(pageNo-1)*pageSize);
        map.put("end",pageNo*pageSize+1);
        return empDao.getPage(map);
    }
    @Override
    public int getPageCount(Map map) {
        return empDao.getPageCount(map);
    }
    @Override
    public int addList(Map map){
        return empDao.addList(map);
    }

    @Override
    public int delEmp(int empno) {
        return empDao.delEmp(empno);
    }

    @Override
    public List<Map> getById(int empno) {
        return empDao.getById(empno);
    }

    @Override
    public int updateEmp(Map map) {
        return empDao.updateEmp(map);
    }

}
