package com.codebattles.practice;

import java.util.List;

public interface IPracticeProblemService {
  public List<PracticeProblem> getProblems();
  
  public PracticeProblem getProblem(String id);
  
  public boolean checkProblem(String problemCode, String problemId);
}
