package controller;

import model.Classs;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.service.IClasssService;
import service.service.IStudentService;

import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {
    @Autowired
    IClasssService classsService;
    @Autowired
    IStudentService studentService;

    @ModelAttribute("classs")
    public Iterable<Classs> provinces(){
        return classsService.findAll();
    }
    @GetMapping("")
    public String listCustomers(Model model ,String name) {
        List<Student> students;
        if (key != null) {
            students = (List<Student>) studentService.findByName(name);
        } else {
            students = (List<Student>) studentService.findAllByOrderByScoreAsc();
        }
        model.addAttribute("students", students);
        return "student/list";
    }


}
