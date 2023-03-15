package personal.xjl.jerrymouse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import personal.xjl.jerrymouse.entity.Student;
import personal.xjl.jerrymouse.mapper.StudentMapper;

import java.util.List;

@SpringBootTest
class JerrymouseApplicationTests {

    @Autowired
    StudentMapper studentMapper;
    @Test

    void contextLoads() {
        List<Student> students=studentMapper.queryAll();
        students.forEach(e-> System.out.println(e));
    }

}
