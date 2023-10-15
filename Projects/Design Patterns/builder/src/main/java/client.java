public class client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
        Student student = Student.getBuilder()
                .setName("Vishal")
                .setAge(30)
                .setBatchName("June 2022")
                .setUnivName("GTU")
                .setPhone("9033496624")
                .build();

//        builder.setName("Vishal");
//        builder.setAge(30);
//        builder.setBatchName("June 2022");
//        builder.setUnivName("GTU");
//        builder.setPhone("9033496624");

//        Student student = builder.build();

        System.out.println(student.getName());
        System.out.println(student.getBatchName());

    }
}
