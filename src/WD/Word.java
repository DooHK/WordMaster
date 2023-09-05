package WD;

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;
    Word(){}
    Word(int id, int level, String word, String mean){
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = mean;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}