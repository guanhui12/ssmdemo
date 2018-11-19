package com.aaa.sm.service;

import java.util.List;
import java.util.Map;

/**
 * className:DeptDaoTest
 * discriptoin:雇员持久层
 * author:张晓峰
 * createTime:2018-11-07 16:50
 */

public interface EmpService {
    /**
     * 雇员列表
     * @param map
     * @return
     */
    List<Map> getPage(Map map);

    /**
     * 分页总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);
    /**
     * 增加雇员
     * @param map
     * @return
     */
    int addList(Map map);
    /**
     * 删除
     * @param empno
     * @return
     */
    int delEmp(int empno);
    /**
     * 查找id
     * @param empno
     * @return
     */
    List<Map> getById(int empno);
    /**
     * 更新
     * @param map
     * @return
     */
    int updateEmp(Map map);
}
