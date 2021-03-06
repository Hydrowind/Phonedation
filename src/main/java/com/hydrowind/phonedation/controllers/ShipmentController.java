package com.hydrowind.phonedation.controllers;

import com.hydrowind.phonedation.dto.ShipmentForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/shipment")
public class ShipmentController {
  private String BASE_PATH = "/admin/shipment";

  @GetMapping
  public String index() {
    return BASE_PATH.concat("/index");
  }

  @GetMapping("/create")
  public String create() {
    return BASE_PATH.concat("/form");
  }

  @PostMapping("/create")
  public String insert() {
    return "redirect:".concat(BASE_PATH);
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable("id") long id, Model model) {
    // TODO: add get by service
    return BASE_PATH.concat("/form");
  }

  @PutMapping("/edit/{id}")
  public String update(@PathVariable("id") long id, ShipmentForm form) {
    // TODO: add update service
    return "redirect:".concat(BASE_PATH);
  }

  @DeleteMapping("/remove/{id}")
  public String delete(@PathVariable("id") long id) {
    // TODO: add delete service
    return "redirect:".concat(BASE_PATH);
  }
}
