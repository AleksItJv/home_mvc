package controllers;

import entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class NewController {
    List<User> list = new ArrayList<>();
    List<User> listIn = new ArrayList<>();
    static int count = 0;

    @GetMapping(value = "/form")
    public String getForm() {
        return "form.jsp";
    }

    @PostMapping(value = "/form")
    public ModelAndView passDataFromUse(@ModelAttribute("user") User user, ModelAndView modelAndView){
        System.out.println("catch " + user);
        list.add(user);
        System.out.println("list view" + list);
        ObjectOutputStream out = null;
        File file = new File("D:\\JAVA\\Projects\\Homework2MVC\\src\\main\\resources\\Users.txt");
        try {
            out = new ObjectOutputStream(new FileOutputStream(file, true));

            out.writeObject(user);
            out.flush();
            out.close();
            System.out.println("Object written to file: " + user);
/*            for (User us : list){
                out.writeObject(us);
            }
            out.flush();
            out.close();
            System.out.println(list);*/

        } catch (IOException e) {
            System.out.println("Written error");
            e.printStackTrace();
        }
        modelAndView.setViewName("result2.jsp");
        modelAndView.addObject("count", ++count);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping(value = "/formviev")
    public ModelAndView getFormViev(@ModelAttribute("result") String res, ModelAndView modelAndView) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\JAVA\\Projects\\Homework2MVC\\src\\main\\resources\\Users.txt"));
            while(br.ready()){
                res = res + br.readLine();
                //System.out.println(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        modelAndView.setViewName("formviev.jsp");
        modelAndView.addObject("result", res);

        return modelAndView;
    }

/*    @GetMapping(value = "/formviev")
    public ModelAndView getFormViev(@ModelAttribute("result") User user, ModelAndView modelAndView) {
        ObjectInputStream br = null;
        try {
            br = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Projects\\Homework2MVC\\src\\main\\resources\\Users.txt"));
            while((user = (User) br.readObject()) != null){

                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        modelAndView.setViewName("formviev2.jsp");
        modelAndView.addObject("result", user);

        return modelAndView;
    }*/

    @GetMapping(value = "/all")
    public ModelAndView getAllUsers(ModelAndView modelAndView){
        modelAndView.addObject("list", list);
        modelAndView.setViewName("all.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/form2")
    public String getForm2() {
        return "form2.jsp";
    }

    @PostMapping(value = "/form2")
    public ModelAndView passDataFromUse2(@ModelAttribute("user") User user, ModelAndView modelAndView) {
        System.out.println(user);
        list.add(user);
        System.out.println(list);
        ObjectOutputStream out = null;
        File file = new File("D:\\JAVA\\Projects\\Homework2MVC\\src\\main\\resources\\Users.txt");
        try {
            out = new ObjectOutputStream(new FileOutputStream(file, true));
/*            out = new ObjectOutputStream(new FileOutputStream(file, true));
            out.writeObject(user);
            out.flush();
            out.close();
            System.out.println("Object written to file");*/
            for (User us : list) {
                out.writeObject(us);
            }
            out.flush();
            out.close();
            System.out.println(list);

        } catch (IOException e) {
            System.out.println("Written error");
            e.printStackTrace();
        }
        modelAndView.setViewName("result2.jsp");
        modelAndView.addObject("count", ++count);
        modelAndView.addObject("user", user);
        return modelAndView;

    }

    @GetMapping(value = "/formviev2")
    public ModelAndView getFormViev2(ModelAndView modelAndView) {
    //public ModelAndView getFormViev2(@ModelAttribute("userList") List<User> userList, ModelAndView modelAndView) {
        ObjectInputStream br = null;
        User user;
        List<User> userList = new ArrayList<>();
        try {
            br = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Projects\\Homework2MVC\\src\\main\\resources\\Users.txt"));
            while((user = (User) br.readObject()) != null){
                userList.add(user);
                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        modelAndView.setViewName("formviev2.jsp");
        modelAndView.addObject("userList", userList);

        return modelAndView;
    }

}
