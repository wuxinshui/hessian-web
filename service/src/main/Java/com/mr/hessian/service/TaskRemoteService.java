package com.mr.hessian.service;

import com.mr.hessian.api.ITaskRemoteService;
import com.mr.hessian.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/5.
 */
@Service("taskRemoteService")
public class TaskRemoteService implements ITaskRemoteService {
    public String task() {
        System.out.println("This is a task test for hessian ");
        return "SUCCESS";
    }

    public TaskDto taskDto() {
        TaskDto taskDto = new TaskDto();
        taskDto.setId("1");
        taskDto.setName("task1");
        taskDto.setTime(new Date().toString());
        return taskDto;
    }
}
