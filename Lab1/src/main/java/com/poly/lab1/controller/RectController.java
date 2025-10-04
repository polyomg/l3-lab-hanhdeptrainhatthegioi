package com.poly.lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RectController {

    // Hiển thị form nhập
    @GetMapping("/rect/form")
    public String form() {
        return "rect";
    }

    // Xử lý tính toán
    @PostMapping("/rect/calc")
    public String calc(HttpServletRequest req, Model model) {
        try {
            double length = Double.parseDouble(req.getParameter("length"));
            double width = Double.parseDouble(req.getParameter("width"));

            double area = length * width;
            double perimeter = 2 * (length + width);

            model.addAttribute("area", area);
            model.addAttribute("perimeter", perimeter);
        } catch (Exception e) {
            model.addAttribute("area", "Giá trị không hợp lệ");
            model.addAttribute("perimeter", "Giá trị không hợp lệ");
        }
        return "rect";
    }
}
