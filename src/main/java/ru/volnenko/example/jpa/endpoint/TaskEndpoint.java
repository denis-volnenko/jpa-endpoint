package ru.volnenko.example.jpa.endpoint;

import ru.volnenko.component.jpa.endpoint.AbstractEndpoint;
import ru.volnenko.example.jpa.api.ITaskEndpoint;
import ru.volnenko.example.jpa.model.Task;

public class TaskEndpoint extends AbstractEndpoint<Task, String> implements ITaskEndpoint {

}
