package com.registro.usuarios.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
  
  @GetMapping("/dashboard")
  public String Dashboard(){
    return "dashboard";
  }

}
