package com.fitnessAssessment.services.exception;

public class ResourceNotFoundException
  extends APIException
{
  public ResourceNotFoundException(String message, String logMessage)
  {
    super(message, logMessage);
  }
}
