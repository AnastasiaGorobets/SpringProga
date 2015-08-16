public class Student {

    private String name;
    private String sername;
    private String group;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +  " name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
