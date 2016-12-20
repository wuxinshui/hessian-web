package com.mr.hessian.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/1/5.
 * 由于使用二进制RPC协议传输数据，对象必须进行序列化，实现Serializable 接口
 */
public class TaskDto implements Serializable{
    private String id;
    private String name;
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
