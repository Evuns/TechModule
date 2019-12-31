package Lab.Songs;

public class Song {
    private String typeList;
    private String name;
    private String time;



    String getTypeList(){
        return typeList;
    }
    void setTypeList(String typeList){
        this.typeList = typeList;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    public String getTime(){
        return time;
    }
    void setTime(String time) {
        this.time = time;
    }
}
