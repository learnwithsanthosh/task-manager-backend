package com.learnwithsanthosh.Task_manager_backend.controller;

import com.learnwithsanthosh.Task_manager_backend.dao.TaskDAO;
import com.learnwithsanthosh.Task_manager_backend.entity.Task;
import com.learnwithsanthosh.Task_manager_backend.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<TaskDAO> getAllTask(){
        return taskService.getAllTask();
    }

    @PostMapping("/save")
    public void saveTask(@RequestBody Task task){
        taskService.save(task);
    }

    @PutMapping("/task/{id}")
    public void updateTask(@RequestBody Task task, @PathVariable int id){
        taskService.updateTask(task,id);
    }

    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable int id){
        taskService.deletebyid(id);
    }
}
