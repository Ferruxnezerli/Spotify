public class Operations implements Interface {

    Music music1[]=new Music[50];

    private int say=0;

    @Override
    public String add(Music music) {
        if(say< music1.length){
            music1[say]=music;
            say++;
            return "Ugurla elave olundu!";
        }else{
            return "Array doludur";
        }
    }

    @Override
    public void delete(int id) {
         for (int i=0;i<say;i++){
             if (music1[i].getId()==id){
                 music1[i]=null;
                 return;
             }
         }
    }


    @Override
    public Music getMusic(int id) {
        for (int i = 0; i < say; i++) {
            if (music1[i].getId() == id) {
                return music1[i];
            }
        }
        return null;
    }
    public void info(){
        for (int j=0;j< music1.length;j++){
            System.out.println(music1[j]);
        }
    }

}
