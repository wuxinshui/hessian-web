package com.mr.hessian.controller;

import com.mr.hessian.api.ITaskRemoteService;
import com.mr.hessian.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/1/6.
 */
@Controller("/")
public class TaskController {

    @Autowired
    private ITaskRemoteService taskRemoteService;

    @RequestMapping("task")
    public String index(Model model) {
        String task = "FAIL";
        task = taskRemoteService.task();
        model.addAttribute("status", task);
        TaskDto taskDto=taskRemoteService.taskDto();
        model.addAttribute("dto",taskDto);
        return "task";
    }

}
