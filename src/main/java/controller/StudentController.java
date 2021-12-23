package controller;

import model.Classs;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.service.IClasssService;
import service.service.IStudentService;

import java.util.List;
import java.util.Optional;

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
        if (name != null) {
            students = (List<Student>) studentService.findByName(name);
        } else {
            students = (List<Student>) studentService.findAllByOrderByScoreAsc();
        }
        model.addAttribute("students", students);
        return "student/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Optional<Student> student = studentService.findById(id);
        Student student1 = student.get();
        model.addAttribute("student", student1);
        return "student/edit";
    }

    @PostMapping("/edit")
    public String edit1(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

}
