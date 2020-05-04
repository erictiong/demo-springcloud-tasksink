package com.example.demospringcloudtasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class DemoSpringcloudTasksinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudTasksinkApplication.class, args);
    }

}
