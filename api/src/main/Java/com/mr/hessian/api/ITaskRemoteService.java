package com.mr.hessian.api;

import com.mr.hessian.dto.TaskDto;

/**
 * Created by Administrator on 2016/1/5.
 */
public interface ITaskRemoteService {
    String task();

    TaskDto taskDto();
}
