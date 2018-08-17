package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/v1/task")
@CrossOrigin(origins = "*")
public class TaskController{

    @Autowired
    private DbService service;

    @Autowired
    private TaskMapper taskMapper;

    public TaskController() {
    }

   @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks() {
       return taskMapper.mapToTaskDtoList(service.getAllTasks());
   }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(Long taskId) {
    }

  // @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    //public TaskDto updateTask(TaskDto taskDto) {
      //  return new TaskDto(1L, "Edited test title", "Test_content");
    //}


    @RequestMapping(method = RequestMethod.POST, value = "createTask", consumes = APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody TaskDto taskDto) {
        service.saveTask(taskMapper.mapToTask(taskDto));

    }

    @RequestMapping(method = RequestMethod.GET, value = "getTaskwithId")
    public TaskDto getTaskwithId(@RequestParam Long taskId) {
        return taskMapper.mapToTaskDto(service.getTask(taskId));
}

  @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public TaskDto updateTaskWithId(@RequestBody TaskDto taskDto) {
       return taskMapper.mapToTaskDto(service.saveTask(taskMapper.mapToTask(taskDto)));
    }


   public void deleteTaskwithId(@RequestParam Long taskId) {
        deleteTask(taskId);
    }
}
