package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resourceName ;
    private String fieldName ;
    private Integer fieldValue;


    public String getResourceName() {

        return resourceName;
    }

    public String getFieldName() {

        return fieldName;
    }

    public Integer getFieldValue() {
        return fieldValue;
    }

    public ResourceNotFoundException (String resourceName , String fieldName , Integer fieldValue){
        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName ;
        this.fieldName = fieldName ;
        this.fieldValue = fieldValue;

    }



}
