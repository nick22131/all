package com.example.spring_boot_ex10_JPA_basic.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resourceName ;
    private String fieldName ;
    private long fieldValue;


    public String getResourceName() {

        return resourceName;
    }

    public String getFieldName() {

        return fieldName;
    }

    public long getFieldValue() {
        return fieldValue;
    }

    public ResourceNotFoundException (String resourceName , String fieldName , long fieldValue){
        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName ;
        this.fieldName = fieldName ;
        this.fieldValue = fieldValue;

    }



}
