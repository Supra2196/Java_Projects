public class course {
    private String name;
    private int courseId;

    public course(int courseId, String name) {
        this.name = name;
        this.courseId = courseId;
    }

    public String getName() {
        return this.name;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
