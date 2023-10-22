public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(12);
        st.setName("Arjun");
        st.setAvgBatchPsp(80);
        st.setBatchName("June 2022");
        st.setPsp(95);

        Student st1 = st.copy();
        Student st2 = new IntelligentStudent();
        st2.setAge(12);
        st2.setName("Arjun");
        st2.setAvgBatchPsp(80);
        st2.setBatchName("June 2022");
        st2.setPsp(95);
        Student st3 = st2.copy();
    }
}
