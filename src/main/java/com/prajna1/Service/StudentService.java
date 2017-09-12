package com.prajna1.Service;

import com.prajna1.Dao.FakeStudentDaoImpl;
import com.prajna1.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class StudentService {

    @Autowired
    @Qualifier("mySQLData")
    private FakeStudentDaoImpl fakeStudentDaoImpl;

    public Collection<Student> getAllStudents(){
        return this.fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.fakeStudentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        fakeStudentDaoImpl.insertStudentToDb(student);
    }
}
