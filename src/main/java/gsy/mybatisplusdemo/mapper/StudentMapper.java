package gsy.mybatisplusdemo.mapper;

import gsy.mybatisplusdemo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    // 根据班级 id 查询学生列表
    List<Student> selectByClassId(Long classId);
}
