package com.education.springbootweb.school;

//import java.util.*; // can replace import java.util.List; and import java.util.ArrayList;
import java.util.List; // for List
import java.util.ArrayList; // for ArrayList

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classroom")
public class ClassroomsController {
	//database info could be add here
		//to generate a list of class, pass the model class in the list
		private static List<ClassroomsModel> listOfClassrooms = new ArrayList<>();
		
      
        
		static String[] shiftOption = {"Morning", "Afternoon"};
		static String[] classgender = {"Girl", "Boy", "Mixed"};
		static {
			
			for(int i=1; i<=6;i++) {
					
				listOfClassrooms.add(new ClassroomsModel(i, "class shift: " + shiftOption[i%2], 30,classgender[i%3]) );
			}
		}
		
		@GetMapping
		public String getAllClassRooms(Model model) {
			model.addAttribute("listOfClass",listOfClassrooms);
			return "classroomView";
		}
	
}





    
	
	
	
	
	
	 