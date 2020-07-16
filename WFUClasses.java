
public class WFUClasses {
    private String className;
    private int classNum;
    private String instructor;
    private String timeOfWeek;
    private String timeOfDayStart;
    private String timeOfDayEnd;
    private String building;
    private int classroomNum;

    public WFUClasses(){
        className = "unknown";
        classNum = 0;
        instructor = "unknown";
        timeOfWeek = "unknown";
        timeOfDayStart = "unknown";
        timeOfDayEnd = "unknown";
        building = "unknown";
        classroomNum = 0;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public void setClassNum(int classNum){
        this.classNum = classNum;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public void setTimeOfWeek(String timeOfWeek) {
        this.timeOfWeek = timeOfWeek;
    }
    public void setTimeOfDayStart(String timeOfDayStart) {
        this.timeOfDayStart = timeOfDayStart;
    }
    public void setTimeOfDayEnd(String timeOfDayEnd) {
        this.timeOfDayEnd = timeOfDayEnd;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public void setClassroomNum(int classroomNum) {
        this.classroomNum = classroomNum;
    }
    public void print(){
        System.out.println(className + classNum + " is taught by Professor " + instructor + " on " + timeOfWeek + " from " + timeOfDayStart + " - " + timeOfDayEnd + " in " + building + " " + classroomNum);

    }
}
