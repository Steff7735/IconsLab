
package com.icons.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author fanny
 */
@Controller
public class PortalControlador {
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
}
