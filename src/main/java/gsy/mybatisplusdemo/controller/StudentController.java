package gsy.mybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import gsy.mybatisplusdemo.entity.Student;
import gsy.mybatisplusdemo.service.IClassService;
import gsy.mybatisplusdemo.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService iStudentService;


    /**
     * 新增学生
     */
    @GetMapping("/save")
    public String save(@RequestBody Student student) {
        boolean flag = iStudentService.save(student);
        return flag ? "成功" : "失败";
    }

    /**
     * 根据id删除学生
     *
     * @param id
     */
    @GetMapping("/deleteById")
    public String deleteById(@PathParam("id") Integer id) {
        boolean flag = iStudentService.removeById(id);
        return flag ? "成功" : "失败";
    }

    /**
     * 根据id修改学生信息
     */
    @GetMapping("/update")
    public String updateById(@RequestBody Student student) {
        boolean flag = iStudentService.updateById(student);
        return flag ? "成功" : "失败";
    }

    /**
     * 根据id查询学生
     */
    @GetMapping("/getById")
    public String getById(@PathParam("id") Integer id) {
        Student student = iStudentService.getById(id);
        return student.toString();
    }

    /**
     * mybatis-plus使用queryWrapper，根据id查询
     */
    @GetMapping("/getOneById")
    public Student getOneById(@PathParam("id") Integer id) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return iStudentService.getOne(queryWrapper);
    }
}
