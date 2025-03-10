package Modelos;

public class Preferidos extends Audio{
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo()+ " é considerado um sucesso!");

        } else {
            System.out.println(audio.getTitulo() + " é um titulo que você talvez goste");
        }
    }

}
