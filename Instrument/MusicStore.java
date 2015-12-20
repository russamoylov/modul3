package Instrument;


public class MusicStore extends MusicInstrument {

    public static void main (String[] args){

    }
    Guitar guitar;
    Pianoforte pianoforte;
    Pipe pipe;

    public MusicStore(Guitar guitar, Pianoforte pianoforte, Pipe pipe){
        this.guitar = guitar;
        this.pianoforte = pianoforte;
        this.pipe = pipe;
    }
}
