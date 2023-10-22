public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batchName;
    private int psp;
    private int avgBatchPsp;
    private int counter;

    public Student(){ }
    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.batchName = st.batchName;
        this.psp = st.psp;
        this.avgBatchPsp = st.avgBatchPsp;
        this.counter = st.counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(int avgBatchPsp) {
        counter++;
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
