package gsy.mybatisplusdemo.controller;

import gsy.mybatisplusdemo.entity.Student;
import gsy.mybatisplusdemo.service.IClassService;
import gsy.mybatisplusdemo.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Resource
    private IClassService iClassService;
    @Resource
    private IStudentService iStudentService;

    // 查询所有班级
    @GetMapping("getClasses")
    public Object getClasses() {
        Map<String, Object> map = iClassService.getMap(null);
        return map;
    }

    // 给班级添加学生
    @GetMapping("addStudentToClass")
    public void addStudentToClass(Integer classId, Integer studentId) {
        Student student = iStudentService.getById(studentId);
        student.setClassId(classId);
        iStudentService.updateById(student);
    }

    // 从班级中删除学生
    @GetMapping("deleteStudentFromClass")
    public void deleteStudentFromClass(Integer classId, Integer studentId) {
        Student student = iStudentService.getById(studentId);
        if (student.getClassId() != null && student.getClassId().equals(classId)) {
            student.setClassId(null);
            iStudentService.updateById(student);
        }
    }
}
