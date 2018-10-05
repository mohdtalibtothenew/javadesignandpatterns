// Question 4
// Implement Builder pattern to create a student object with more than 6 fields.
class Student
{
    private int ID;
    private int UniversityRoll;
    private String Name;
    private String Stream;
    private String branch;
    private boolean isHostler;
    public Student(StudentBuilder studentBuilder ) {
        ID = studentBuilder.getID();
        UniversityRoll = studentBuilder.getUniversityRoll();
        Name = studentBuilder.getName();
        Stream = studentBuilder.getStream();
        branch = studentBuilder.getBranch();
        isHostler = studentBuilder.isHostler();
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getUniversityRoll() {
        return UniversityRoll;
    }
    public void setUniversityRoll(int universityRoll) {
        UniversityRoll = universityRoll;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getStream() {
        return Stream;
    }
    public void setStream(String stream) {
        Stream = stream;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public boolean isHostler() {
        return isHostler;
    }
    public void setHostler(boolean hostler) {
        isHostler = hostler;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + Name + '\'' +
                ", id=" + ID +
                ", UniversityRoll=" + UniversityRoll +
                ", Branch=" + branch +
                ", Stream=" + Stream +
                ", Hostler=" + isHostler +
                '}';
    }
}
class StudentBuilder
{
    private int ID;
    private int UniversityRoll;
    private String Name;
    private String Stream;
    private String branch;
    private boolean isHostler;
    /// ID, NAME constructor, getter, Builder
    public StudentBuilder(int ID, int universityRoll, String name) {
        this.ID = ID;
        UniversityRoll = universityRoll;
        Name = name;
    }
    public int getID() {
        return ID;
    }
    public StudentBuilder setID(int ID) {
        this.ID = ID;
        return this;
    }
    public int getUniversityRoll() {
        return UniversityRoll;
    }
    public StudentBuilder setUniversityRoll(int universityRoll) {
        UniversityRoll = universityRoll;
        return this;
    }
    public String getName() {
        return Name;
    }
    public StudentBuilder setName(String name) {
        Name = name;
        return this;
    }
    public String getStream() {
        return Stream;
    }
    public StudentBuilder havingStream(String stream) {
        Stream = stream;
        return this;
    }
    public String getBranch() {
        return branch;
    }
    public StudentBuilder inBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public boolean isHostler() {
        return isHostler;
    }
    public StudentBuilder isHostler(boolean hostler) {
        isHostler = hostler;
        return this;
    }
    public Student build()
    {
        return new Student(this);
    }
}
public class BuilderQ4
{
    public static void main(String[] args)
    {
        Student student=new StudentBuilder(118,1413310118,"Mohd Talib")
                .inBranch("Computer Science & Engineering")
                .havingStream("Electronics")
                .isHostler(true).build();
        System.out.println(student);
        System.out.println();
        Student student1=new StudentBuilder(113,1413310118,"Nahid Anwer")
                .inBranch("Computer Science & Engineering")
                .havingStream("Computer Science")
                .isHostler(false).build();
        System.out.println(student1);
    }
}