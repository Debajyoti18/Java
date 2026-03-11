class Student{
    private String name;
    private int sid;
   private  int age;
    private String email;
    private long phoneNo;
    private  Student( Builder builder){
       this.name = builder.name;
       this.age = builder.age;
       this.sid= builder.sid;
       this.email = builder.email;
       this.phoneNo = builder.phoneNo;
    }
    public static class Builder{
            private String name;
            private int sid;
             private  int age;
             private String email;
             private long phoneNo;
             
      public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }
         public Builder sid(int sid){
            this.sid = sid;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
         public Builder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }
        // Most Important
        public Builder builder(){
            return new Student(this);
        }

    }
}
public class BuilderMain {

    public static void main(String[] args) {

        Student student = new Student.Builder()
                        .name("Debajyoti")
                        .sid(2)
                        .age(22)
                        .email("dj@gmail.com")
                        .phoneNo("754812265")
                        .build();

    }
}