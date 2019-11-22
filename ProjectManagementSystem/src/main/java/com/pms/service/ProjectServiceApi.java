package com.pms.service;

import java.util.List;

import com.pms.model.Project;

/**
 * @author vinod.nagulkar
 *
 */
public interface ProjectServiceApi 
{

	public Project addProject(Project project);
	public List<Project>getAllProjects();
	public Project getProjectById(Long id);
	public Project updateProject(Project project,Long id);
	public void deleteProject(Long id);
}
