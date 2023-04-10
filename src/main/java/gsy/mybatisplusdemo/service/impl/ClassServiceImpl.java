package gsy.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import gsy.mybatisplusdemo.entity.Class;
import gsy.mybatisplusdemo.entity.Student;
import gsy.mybatisplusdemo.mapper.ClassMapper;
import gsy.mybatisplusdemo.mapper.StudentMapper;
import gsy.mybatisplusdemo.service.IClassService;
import gsy.mybatisplusdemo.service.IStudentService;
import org.springframework.stereotype.Service;

@Service("IClassService")
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

}
