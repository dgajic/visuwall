package com.jsmadja.wall.projectwall.service;

import java.util.Date;
import java.util.List;

import com.jsmadja.wall.projectwall.domain.Build;
import com.jsmadja.wall.projectwall.domain.Project;
import com.jsmadja.wall.projectwall.domain.ProjectStatus.State;
import com.jsmadja.wall.projectwall.exception.BuildNotFoundException;
import com.jsmadja.wall.projectwall.exception.ProjectNotFoundException;

public interface BuildService extends Service {

    List<Project> findAllProjects();

    Project findProjectByName(String projectName) throws ProjectNotFoundException;

    Build findBuildByProjectNameAndBuildNumber(String projectName, int buildNumber) throws BuildNotFoundException;

    void populate(Project project) throws ProjectNotFoundException;

    Date getEstimatedFinishTime(String projectName) throws ProjectNotFoundException;

    boolean isBuilding(String projectName) throws ProjectNotFoundException;

    State getState(String projectName) throws ProjectNotFoundException;

    int getLastBuildNumber(String projectName) throws ProjectNotFoundException, BuildNotFoundException;

}