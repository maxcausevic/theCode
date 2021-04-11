package com.mcausevic.theCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCode {
	 @RequestMapping("/")
	 public String index() {
		 return "index.jsp";
	 }
	 @RequestMapping(value="/code", method=RequestMethod.POST)
     public String code(@RequestParam(value="code") String code) {
           if(code.equals("bushido")) {
        	   return "code.jsp";
           }
           return "redirect:/createError";
          
     }
	 @RequestMapping("/createError")
	    public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", "You must train harder!");
	        return "redirect:/";
	    }

	 
    

}







    
	
//	public String counter(Model model) {
//		model.addAttribute("counter", session);
//		return "counter.jsp";
//    }
//	@RequestMapping("/counter")
//	public String counter(HttpSession session){
//		if(session.getAttribute("count")==null) {
//			session.setAttribute("count", 0);
//		}
//        		return "counter.jsp";
//        	
//    }
//}

