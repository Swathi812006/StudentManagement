package com.demo.Student2.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.ui.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Student2.PathModel.PathModel;
import com.demo.Student2.Repository.Repository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Controller1 {

    @Autowired
    Repository repo;

    @GetMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/login")
    public String loginSubmit(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("Swathi".equals(username) && "Swathi816".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return "redirect:/home";
        } else {
            request.setAttribute("error", "Invalid username or password");
            return "Login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String home(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        return "NewFile";
    }

    @PostMapping("/submit")
    public String submit(PathModel student, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        repo.save(student);
        return "redirect:/home";
    }

    @GetMapping("/view")
    public String viewStudents(HttpServletRequest request, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        List<PathModel> students = repo.findAll();
        request.setAttribute("students", students);
        return "View";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, HttpServletRequest request, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        Optional<PathModel> student = repo.findById(id);
        if (student.isPresent()) {
            request.setAttribute("student", student.get());
            return "Edit";
        } else {
            return "redirect:/view";
        }
    }

    @PostMapping("/update")
    public String updateStudent(PathModel student, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        repo.save(student);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        repo.deleteById(id);
        return "redirect:/view";
    }
}
