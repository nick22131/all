class ex01{
    public static void main(String[] args){
        person person1 = new person("Alice");
        person1.printName(); // Output: Alice
        person person2 = person1;
        person2.printName(); // Output: Alice

        person person3 = new person("Ali");
        person2.printName();
        person person4 = person3.getPerson();
        person4.printName();
    }

}

class person {
    String name ;
    person(String name){
        this.name = name ;
    }
    void printName( ){
        System.out.print(this.name );
    }
    person getPerson(){
        return this ;
    }

}