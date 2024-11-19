public class Music {
    private int id;
    private String musicName;
    private String singerName;
    private boolean isPremium;

    public Music(int id, String musicName, String singerName) {
        this.id = id;
        this.musicName = musicName;
        this.singerName = singerName;
    }

    public int getId() {
        return id;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public boolean premium(){
        if(isPremium){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", musicName='" + musicName + '\'' +
                ", singerName='" + singerName + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }


}
