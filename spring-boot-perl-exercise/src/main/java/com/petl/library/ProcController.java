package com.petl.library;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petl.library.ProcNotFoundException;
import com.petl.library.ProcRepository;
import com.petl.library.ProcRepositoryStub;
import com.petl.library.ProcService;
import com.petl.library.ProcServiceStub;

@Controller
public class ProcController { 
	
	ProcService procService = new ProcServiceStub();

   @RequestMapping("/")
   public String index() {
	   ProcRepository ps = new ProcRepositoryStub();
	   ps.generateProc();
      return "index";
   }

   @PostMapping("/getProcDetails")
   public String getProcDetails(@RequestParam("name") String pref, Model model, HttpServletRequest request) {
	  
	   String procDetails = null;
	  
	   if(null != request.getParameter("button1") && request.getParameter("button1").equals("Get PROC")) {
		  try {
			procDetails = procService.retrieveProc(pref);
		} catch (ProcNotFoundException e) {
			procDetails = e.toString();
		}
		  
	  }
	  
	  if(null != request.getParameter("button2") && request.getParameter("button2").equals("Get PROC Summary")) {
		  try {
			procDetails = procService.getProcSummary(pref);
		} catch (ProcNotFoundException e) {
			procDetails = e.toString();
		}
	  }
	  
      model.addAttribute("name", procDetails);
      return "index";
   }
}
