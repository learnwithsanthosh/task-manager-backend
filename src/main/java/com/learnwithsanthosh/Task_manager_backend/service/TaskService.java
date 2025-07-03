package com.learnwithsanthosh.Task_manager_backend.service;

import com.learnwithsanthosh.Task_manager_backend.dao.TaskDAO;
import com.learnwithsanthosh.Task_manager_backend.entity.Task;
import com.learnwithsanthosh.Task_manager_backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDAO> getAllTask(){
        List<Task> tasks= taskRepository.findAll();
        List<TaskDAO> taskDAOS;
        taskDAOS = tasks.stream().map(data ->new TaskDAO(data.getId(),data.getTitle(),data.getDescription(),data.isCompleted(),data.getCreatedAt())).collect(Collectors.toList());
        return taskDAOS;
    }

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void updateTask(Task task, int id) {
        Task dbTask=taskRepository.findById(id).get();
        if(dbTask.equals(null)){
            throw new RuntimeException("Task for id not present");
        }
        dbTask.setDescription(task.getDescription());
        dbTask.setTitle(task.getTitle());
        dbTask.setCompleted(task.isCompleted());
        taskRepository.save(dbTask);
    }

    public void deletebyid(int id) {
        taskRepository.deleteById(id);
    }
}
