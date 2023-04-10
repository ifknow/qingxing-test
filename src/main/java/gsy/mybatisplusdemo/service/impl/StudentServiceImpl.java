package gsy.mybatisplusdemo.service.impl;

import gsy.mybatisplusdemo.entity.Student;
import gsy.mybatisplusdemo.mapper.StudentMapper;
import gsy.mybatisplusdemo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("IStudentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
