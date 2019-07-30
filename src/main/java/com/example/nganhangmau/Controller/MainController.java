package com.example.nganhangmau.Controller;

/*import com.example.nganhangmau.Dao.KhomauDao;*/
import com.example.nganhangmau.Entities.Nguoihienmau;
import com.example.nganhangmau.Entities.khoMau;
import com.example.nganhangmau.Service.HienmauService;
import com.example.nganhangmau.Service.KhomauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private KhomauService khomauService;
    private HienmauService hienmauService;

   /* private KhomauDao khomauDao;*/

    @Autowired
    public  void setKhomauService(KhomauService khomauService){
        this.khomauService = khomauService;
    }
    @Autowired
    public void setHienmauService(HienmauService hienmauService) {
        this.hienmauService = hienmauService;
    }





    /*@RequestMapping(value = "/khomau", method = RequestMethod.GET)
    public String showKhoMau(Model model) {
        List<khoMau> list = khomauDao.listKhoMauInfo();
        model.addAttribute("khoMaus", list);

        return "khomau";
    }*/
    @GetMapping("/khomau")
    public String KhoMau1(Model model){
        model.addAttribute("khomaus",khomauService.findAll());
        return "khomau";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
        return "contact1";
    }

    @RequestMapping(value = "/hienmau", method = RequestMethod.GET)
    public String hienmau(Model model) {
        return "hienmau";
    }

    @RequestMapping(value = "/xetnhiemmau", method = RequestMethod.GET)
    public String xetnhiemmau(Model model) {
        return "xetnhiemmau";
    }

    /*@RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        return "register";
    }*/

    @GetMapping("/contact/create")
    public String create(Model model) {
        model.addAttribute("contact", new Nguoihienmau());
        return "register";
    }
    @PostMapping("/contact/contact/save")
    public String save(@Valid Nguoihienmau nguoihienmau, BindingResult result,Model model, RedirectAttributes redirect){
        if(result.hasErrors()){
            return "register";
        }

        hienmauService.save(nguoihienmau);
       /* redirect.addFlashAttribute("success","save successfully!");*/
        return "redirect:/contact";
    }

    /*@GetMapping("/contact/search")
    public String search(@RequestParam("nhommau") String nhommau, Model model) {
        if (nhommau.equals("")) {
            return "redirect:/khoMau";
        }

        model.addAttribute("contacts", khomauService.search(nhommau));
        return "list";
    }*/
    @GetMapping("/khomau/search")
    public String search(@RequestParam("s") String s,Model model){
        if(s.equals("")){
            return "redirect:khomau";
        }

        model.addAttribute("khomaus",khomauService.search(s));
        return "khomau";

    }


}