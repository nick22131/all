package com.example.spring_boot_ex4.controller;

import com.example.spring_boot_ex4.beans.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



// Springboot REST API that returns java bean as json to client
@RestController
public class StudentController {
    //http://localhost:8080/students
    @GetMapping("/students")
    public Student getStudent(){
        Student student = new Student (
                1,
                "Ramesh",
                "lulu"
        );
        return student;
    }



    // Spring boot REST API that returns list to client in json format

  // http://localhost:8080/Students
    @GetMapping("/Students")
    public List<Student> getStudents (){
        List<Student> st =   new ArrayList<>();
        st.add(new Student (1,"Rama", "haee"));
        st.add(new Student (2,"umesh", "verma "));
        st.add(new Student (3,"Sanjay", "sharma "));
        return st;
    }



    // Spring boot REST API with path variable
    // {id} = URI template variable
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable (@PathVariable("id") int studentId,
                                        @PathVariable("first-name") String firstName,
                                        @PathVariable("last-name") String lastName){
        return new Student (studentId,firstName,lastName); // return student object (id )
    }


    //Spring boot REST API with Request Param
    // http://localhost:8080/students/query?id=1&firstName=Ramesh&lastName=lulu

    @GetMapping("/students/query")
   public Student studentRequestVariable(@RequestParam int id,
                                         @RequestParam String firstName,
                                         @RequestParam String lastName ){
        return new Student (id , firstName , lastName);
    }



    // Spring boot REST API that handles HTTP POST request - creating new resource
    //@PostMapping and @RequestBody , @ResponseStatus
    //http://localhost:8080/students/create
    /* json to post in postman
    {
    "id" : 3,
    "firstName" : "Potato",
    "lastName" : "Banana"
    }
     */

    @PostMapping("/students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student st ){
        System.out.println(st.getId());
        System.out.println(st.getFirstName());
        System.out.println(st.getLastName());
        return st;
    }



    //Spring boot REST API that handles HTTP PUT request - updating existing resource
    //http://localhost:8080/students/3/update
    /* json to put in postman
    {
    "firstName" : "Potato",
    "lastName" : "Banana"
    }
     */

    @PutMapping("/students/{id}/update")
    public Student udateStudent(@RequestBody Student st, @PathVariable("id") int studentId){
        System.out.println(st.getFirstName());
        System.out.println(st.getLastName());
        return st;
    }

    //Spring boot REST API that handles HTTP DELETE request - deleting existing resource
    //http://localhost:8080/students/3/delete

    @DeleteMapping("/students/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted successfully";
    }


         // Response Entity class


    //http://localhost:8080/student
    @GetMapping("/student")
    public ResponseEntity<Student> getStudetns(){
        Student st = new Student (1,"Ramesh", "lulu");
       // return new ResponseEntity<>(st, HttpStatus.OK );
        // return ResponseEntity.ok(st);
        return ResponseEntity.ok().header("custom-header", "ramesh").body(st);

    }


    //http://localhost:8080/Student
    @GetMapping("/Student")
    public ResponseEntity<List<Student>> getStudentss(){
        List <Student> st = new ArrayList<>();
        st.add(new Student (1,"Ramesh", "lulu"));
        st.add(new Student (2,"Golu", "rath"));
        st.add(new Student (3,"molu", "lulu"));
        return ResponseEntity.ok(st);
    }



    //http://localhost:8080/student/create
    @PostMapping("/student/create")
    // @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudents(@RequestBody Student st ){
        System.out.println(st.getId());
        System.out.println(st.getFirstName());
        System.out.println(st.getLastName());
        return new ResponseEntity<>(st, HttpStatus.CREATED);
    }


    @DeleteMapping("/student/{id}/delete")
    public ResponseEntity<String> deleteStudents(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }




}
