public class JobInfo {

    private  String   positon;
    private  String   employes;
    private  String   posted;
    private  String   dedline;


    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public String getEmployes() {
        return employes;
    }

    public void setEmployes(String employes) {
        this.employes = employes;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getDedline() {
        return dedline;
    }

    public void setDedline(String dedline) {
        this.dedline = dedline;
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "positon='" + positon + '\'' +
                ", employes='" + employes + '\'' +
                ", posted='" + posted + '\'' +
                ", dedline='" + dedline + '\'' +
                '}';
    }
}
