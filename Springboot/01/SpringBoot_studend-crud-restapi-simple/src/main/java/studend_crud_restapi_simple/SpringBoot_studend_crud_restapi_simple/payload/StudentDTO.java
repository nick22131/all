package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload;

import lombok.Data;

@Data
public class StudentDTO {
    private Integer rollNo;
    private String name;
    private Float percentage;
    private String branch;
}
