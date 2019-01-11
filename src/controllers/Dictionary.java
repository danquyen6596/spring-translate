package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
@GetMapping("/")
public String homePage(){
    return "index";
}

@PostMapping("/translate")
public String dictionary(@RequestParam String word, Model model){
    Map<String, String> mapDic = new HashMap<>();
    mapDic.put("hello", "Xin chào");
    mapDic.put("how", "Thế nào");
    mapDic.put("book", "Quyển vở");
    mapDic.put("cat", "Con mèo");
    mapDic.put("dog", "Con chó");

    String search = mapDic.get(word);

    if(search == null){
        search = "Not found!";
    }

    model.addAttribute("search", search);
    model.addAttribute("word", word);

    return "translate";
}

}
